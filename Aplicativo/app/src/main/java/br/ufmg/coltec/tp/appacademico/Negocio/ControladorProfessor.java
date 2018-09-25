package br.ufmg.coltec.tp.appacademico.Negocio;

import android.app.Activity;

import br.ufmg.coltec.tp.appacademico.Dados.IRepositorioProfessor;
import br.ufmg.coltec.tp.appacademico.Dados.RepositorioProfessorBDR;

/**
 * Created by a2016951820 on 19/09/18.
 */

public class ControladorProfessor {

    private IRepositorioProfessor iRepositorioProfessor;

    public ControladorProfessor (Activity context) {
        this.iRepositorioProfessor = new RepositorioProfessorBDR(context);
    }

    public void insereProfessor (Professor professor) {
        this.iRepositorioProfessor.insereProfessor(professor);
    }

    public boolean removeProfessor (long numeroCadastro) {
        return this.iRepositorioProfessor.removeProfessor(numeroCadastro);
    }

    public Professor buscaProfessor (long numeroCadastro) {
        return this.iRepositorioProfessor.buscaProfessor(numeroCadastro);
    }
}
