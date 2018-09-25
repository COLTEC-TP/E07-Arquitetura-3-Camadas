package br.ufmg.coltec.tp.appacademico.Negocio;

/**
 * Created by a2016951820 on 19/09/18.
 */

public interface IFachadaProfessor {

    public void insereProfessor (Professor professor);

    public boolean removeProfessor (long numeroCadastro);

    public Professor buscaProfessor (long numeroCadastro);
}
