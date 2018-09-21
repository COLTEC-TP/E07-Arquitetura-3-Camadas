package br.ufmg.coltec.tp.appacademico.Negocio;

import android.app.Activity;

import br.ufmg.coltec.tp.appacademico.Dados.IRepositorioAluno;
import br.ufmg.coltec.tp.appacademico.Dados.RepositorioAlunoBDR;

/**
 * Created by a2016951820 on 19/09/18.
 */

public class ControladorAluno {
    private IRepositorioAluno repositorioAluno;

    public ControladorAluno(Activity activity){
        this.repositorioAluno = new RepositorioAlunoBDR(activity);
    }

    public void inserir(Aluno aluno){
        repositorioAluno.inserirAluno(aluno);
    }

    public boolean remover(long matricula){
        return repositorioAluno.removerAluno(matricula);
    }

    public Aluno buscar(long matricula){
        return repositorioAluno.buscarAluno(matricula);
    }
}
