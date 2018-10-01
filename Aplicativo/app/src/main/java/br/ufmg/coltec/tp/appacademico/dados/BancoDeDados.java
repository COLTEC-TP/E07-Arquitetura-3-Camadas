package br.ufmg.coltec.tp.appacademico.dados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by a2016951669 on 27/09/18.
 */

public class BancoDeDados extends SQLiteOpenHelper {

    private static String BD_NAME = "BancoDeDados.sqlite";
    private static final int BD_VERSION = 1;

    private static final String SQL_CREATE_ALUNOS = "CREATE TABLE Alunos (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT NOT NULL)";
    private static final String SQL_CREATE_PROFESSORES = "CREATE TABLE Professores (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT NOT NULL)";

    private static final String SQL_DELETE_ALUNOS = "DROP TABLE IF EXISTS Alunos";
    private static final String SQL_DELETE_PROFESSORES = "DROP TABLE IF EXISTS Professores";

    public BancoDeDados(Context context) {
        super(context, BD_NAME, null, BD_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ALUNOS);
        db.execSQL(SQL_CREATE_PROFESSORES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ALUNOS);
        db.execSQL(SQL_DELETE_PROFESSORES);
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
