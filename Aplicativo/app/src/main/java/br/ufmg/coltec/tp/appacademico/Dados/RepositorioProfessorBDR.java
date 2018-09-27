package br.ufmg.coltec.tp.appacademico.Dados;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.ufmg.coltec.tp.appacademico.Negocio.Professor;

/**
 * Created by a2016951820 on 19/09/18.
 */

public class RepositorioProfessorBDR extends SQLiteOpenHelper implements IRepositorioProfessor {

    private static String DB_NAME = "Professores";
    private static final int DB_VERSION = 1;
    private static final String SCRIPT_CREATE = "CREATE TABLE Professores (nome TEXT, curso TEXT, numero_cadastro LONG)";

    public RepositorioProfessorBDR(Activity activity) {
        super(activity, DB_NAME, null, DB_VERSION);
    }


    //SQLite
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SCRIPT_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }

    //IRepositorioProfessor
    @Override
    public void insereProfessor(Professor professor) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        try {
            ContentValues contentValues = new ContentValues();

            contentValues.put("nome", professor.getNome());
            contentValues.put("curso", professor.getCurso());
            contentValues.put("numero_cadastro", professor.getNumeroCadastro());

            sqLiteDatabase.insert(DB_NAME, null, contentValues);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            sqLiteDatabase.close();
        }
    }

    @Override
    public boolean removeProfessor(long numeroCadastro) {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        int rows_deleted = sqLiteDatabase.delete(DB_NAME, "numero_cadastro" + " = " + numeroCadastro, null);

        sqLiteDatabase.close();

        return rows_deleted > 0;
    }

    @Override
    public Professor buscaProfessor(long numeroCadastro) {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        try {
            Cursor cursor = sqLiteDatabase.query(DB_NAME, null, null, null, null, null, null);

            if (cursor.moveToFirst()) {
                do {
                    long numCadastro = cursor.getLong(cursor.getColumnIndex("numero_cadastro"));;

                    if (numCadastro == numeroCadastro) {
                        String nome = cursor.getString(cursor.getColumnIndex("nome"));
                        String curso = cursor.getString(cursor.getColumnIndex("curso"));

                        return new Professor(nome, curso, numeroCadastro);
                    }
                } while (cursor.moveToNext());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            sqLiteDatabase.close();
        }

        return null;
    }
}