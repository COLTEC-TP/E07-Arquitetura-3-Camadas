package br.ufmg.coltec.tp.appacademico.Dados;

import br.ufmg.coltec.tp.appacademico.Negocio.Aluno;

/**
 * Created by a2016951820 on 19/09/18.
 */

public interface IRepositorioAluno {

    public void inserirAluno(Aluno aluno);

    public void removerAluno(Aluno aluno);

    public Aluno buscarAluno(long matricula);

}
