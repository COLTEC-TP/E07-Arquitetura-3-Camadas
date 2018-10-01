package br.ufmg.coltec.tp.appacademico.negocios;

import java.util.ArrayList;
import java.util.List;

import br.ufmg.coltec.tp.appacademico.dados.RepositorioAluno;
import br.ufmg.coltec.tp.appacademico.gui.GUIActivity;

public class ControladorAluno {

    private RepositorioAluno repositorioAluno;

    public ControladorAluno(){
        repositorioAluno = new RepositorioAluno(new GUIActivity().getBaseContext());
    }

    public void cadastrarAluno(Aluno aluno){
        repositorioAluno.addAluno(aluno);
    }

    public List consultarAlunos(Aluno aluno) {
        List alunos = repositorioAluno.getAllAlunos(aluno);
        return alunos;
    }
}
