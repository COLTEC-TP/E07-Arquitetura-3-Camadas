package br.ufmg.coltec.tp.appacademico.dados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by a2016951669 on 27/09/18.
 */

public class BancoDeDados extends SQLiteOpenHelper {

    private static final String SQL_CREATE_ALUNOS = "CREATE TABLE Alunos (" +
            "ID INTEGER PRIMARY KEY AUTO_INCREMENT, Nome TEXT NOT NULL)";
    private static final String SQL_CREATE_PROFESSORES = "CREATE TABLE Professores (" +
            "ID INTEGER PRIMARY KEY AUTO_INCREMENT, Nome TEXT NOT NULL)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS Alunos; DROP TABLE IF EXISTS Professores;";

    public BancoDeDados(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
