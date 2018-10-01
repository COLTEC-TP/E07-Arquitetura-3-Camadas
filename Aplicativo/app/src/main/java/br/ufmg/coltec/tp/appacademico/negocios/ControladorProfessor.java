package br.ufmg.coltec.tp.appacademico.negocios;

import java.util.ArrayList;
import java.util.List;

import br.ufmg.coltec.tp.appacademico.dados.RepositorioAluno;
import br.ufmg.coltec.tp.appacademico.dados.RepositorioProfessor;
import br.ufmg.coltec.tp.appacademico.gui.GUIActivity;

public class ControladorProfessor {

    private RepositorioProfessor repositorioProfessor;

    public ControladorProfessor() {
        repositorioProfessor = new RepositorioProfessor(new GUIActivity().getBaseContext());
    }

    public void cadastrarProfessor(Professor professor) {
        repositorioProfessor.addProfessor(professor);
    }

    public List consultarProfessores(Professor professor) {
        List professores = repositorioProfessor.getAllProfesssores(professor);
        return professores;
    }
}
