package br.ufmg.coltec.tp.appacademico.Negocio;

import android.app.Activity;

/**
 * Created by a2016951820 on 19/09/18.
 */

public class FachadaAluno implements IFachadaAluno{
    ControladorAluno controlador;

    public FachadaAluno(Activity activity){
        this.controlador = new ControladorAluno(activity);
    }

    @Override
    public void inserirAluno(Aluno aluno) {
        this.controlador.inserir(aluno);
    }

    @Override
    public boolean removerAluno(long matricula) {
        return this.controlador.remover(matricula);
    }

    @Override
    public Aluno buscarAluno(long matricula) {
        return this.controlador.buscar(matricula);
    }
}
