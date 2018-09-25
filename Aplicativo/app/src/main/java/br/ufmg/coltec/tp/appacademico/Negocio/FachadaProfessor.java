package br.ufmg.coltec.tp.appacademico.Negocio;

import android.app.Activity;

public class FachadaProfessor implements IFachadaProfessor{

    private ControladorProfessor controladorProfessor;

    public FachadaProfessor (Activity activity) {
        this.controladorProfessor = new ControladorProfessor(activity);
    }

    @Override
    public void insereProfessor(Professor professor) {
        this.controladorProfessor.insereProfessor(professor);
    }

    @Override
    public boolean removeProfessor(long numeroCadastro) {
        return this.controladorProfessor.removeProfessor(numeroCadastro);
    }

    @Override
    public Professor buscaProfessor(long numeroCadastro) {
        return this.controladorProfessor.buscaProfessor(numeroCadastro);
    }
}
