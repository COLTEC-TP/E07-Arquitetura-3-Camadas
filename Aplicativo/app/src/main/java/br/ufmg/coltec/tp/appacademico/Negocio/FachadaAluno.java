package br.ufmg.coltec.tp.appacademico.Negocio;

/**
 * Created by a2016951820 on 19/09/18.
 */

public class FachadaAluno implements IFachadaAluno{
    ControladorAluno controlador;

    public FachadaAluno(){
        this.controlador = new ControladorAluno();
    }

    @Override
    public void inserirAluno(Aluno aluno) {

    }

    @Override
    public void removerAluno(Aluno aluno) {

    }

    @Override
    public void buscarAluno(Aluno aluno) {

    }
}
