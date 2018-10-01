package br.ufmg.coltec.tp.appacademico.dados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.ufmg.coltec.tp.appacademico.gui.GUIActivity;
import br.ufmg.coltec.tp.appacademico.negocios.Aluno;
import br.ufmg.coltec.tp.appacademico.negocios.Professor;

public class RepositorioProfessor implements IRepositorioProfessor{

    private SQLiteDatabase db;
    private BancoDeDados newBase;

    public RepositorioProfessor(Context context) {
        this.newBase = new BancoDeDados(context);
    }

    public void addProfessor(Professor professor) {
        ContentValues values = new ContentValues();
        db = newBase.getWritableDatabase();

//        values.put("Nome", professor.getNome());
//        db.insert("Professor", null, values);
//        db.close();
    }

    public List<Professor> getAllProfesssores(Professor professor) {
        Cursor cursor;
        List<Professor> list = new ArrayList();
        String[] data = {"ID", "Nome"};
        db = newBase.getReadableDatabase();
        cursor = db.query("Professores", data, null, null, null, null, null);
        if(cursor != null){
            cursor.moveToFirst();
        }
        db.close();
        if(cursor.getCount() > 0) {
            do {
                String nome = cursor.getString(cursor.getColumnIndex("Nome"));
                Professor newProfessor = new Professor(nome);
                list.add(newProfessor);
            } while (cursor.moveToNext());
        }
        return list;
    }
}
