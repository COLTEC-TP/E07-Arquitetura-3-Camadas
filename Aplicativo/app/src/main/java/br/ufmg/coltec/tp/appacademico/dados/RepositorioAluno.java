package br.ufmg.coltec.tp.appacademico.dados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.ufmg.coltec.tp.appacademico.negocios.Aluno;

public class RepositorioAluno implements IRepositorioAluno{

    private SQLiteDatabase db;
    private BancoDeDados newBase;

    public RepositorioAluno(Context context) {
        this.newBase = new BancoDeDados(context);
    }

    public void addAluno(Aluno aluno) {
        ContentValues values = new ContentValues();
        db = newBase.getWritableDatabase();

        values.put("Nome", aluno.getNome());
        db.insert("Alunos", null, values);
        db.close();
    }

    public List<Aluno> getAllAlunos(Aluno aluno) {
        Cursor cursor;
        List<Aluno> list = new ArrayList();
        String[] data = {"ID", "Nome"};
        db = newBase.getReadableDatabase();
        cursor = db.query("Alunos", data, null, null, null, null, null);
        if(cursor != null){
            cursor.moveToFirst();
        }
        db.close();
        if(cursor.getCount() > 0) {
            do {
                String nome = cursor.getString(cursor.getColumnIndex("Nome"));
                Aluno newAluno = new Aluno(nome);
                list.add(newAluno);
            } while (cursor.moveToNext());
        }
        return list;
    }
}
