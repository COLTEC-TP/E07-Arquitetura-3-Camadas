package br.ufmg.coltec.tp.appacademico.Dados;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import br.ufmg.coltec.tp.appacademico.Negocio.Aluno;


/**
 * Created by a2016951820 on 19/09/18.
 */

public class RepositorioAlunoBDR extends SQLiteOpenHelper implements IRepositorioAluno {

    private static String DB_NOME = "Alunos";
    private static final int DB_VERSAO = 1;
    private static final String SCRIPT_CREATE = "CREATE TABLE Alunos (nome TEXT, matricula LONG, curso TEXT, endereco TEXT)";

    public RepositorioAlunoBDR(Activity context){
        super(context, DB_NOME, null, DB_VERSAO);
    }

    /* Métodos da Interface */
    @Override
    public void inserirAluno(Aluno aluno) {
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("nome", aluno.getNome());
            cv.put("matricula", aluno.getMatricula());
            cv.put("curso", aluno.getCurso());
            cv.put("endereco", aluno.getEndereco());
            db.insert("Alunos", null, cv);
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removerAluno(Aluno aluno) {

    }

    @Override
    public Aluno buscarAluno(long matricula) {
        SQLiteDatabase db = getReadableDatabase();

        try {
            // faz a leitura dos dados do banco
            Cursor c = db.query("Alunos", null, null, null, null, null, null);

            if(c.moveToFirst()) {
                do {
                    long matriculaAluno = c.getLong(c.getColumnIndex("matricula"));
                    if (matriculaAluno == matricula){
                        String nome = c.getString(c.getColumnIndex("nome"));
                        String curso = c.getString(c.getColumnIndex("curso"));
                        String endereco = c.getString(c.getColumnIndex("endereco"));
                        return new Aluno(nome, curso, matricula, endereco);
                    }
                } while(c.moveToNext());
            }
        } catch (Exception e) {
            // trata exceção
        } finally {
            db.close();
        }

        return null;
    }

    /* Métodos SQLiteOpenHelper */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SCRIPT_CREATE); // Cria a table
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

