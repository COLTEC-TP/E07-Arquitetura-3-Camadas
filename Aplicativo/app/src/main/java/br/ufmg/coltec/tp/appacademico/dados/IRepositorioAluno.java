package br.ufmg.coltec.tp.appacademico.dados;

import java.util.List;

import br.ufmg.coltec.tp.appacademico.negocios.Aluno;

public interface IRepositorioAluno {

    void addAluno(Aluno aluno);
    List<Aluno> getAllAlunos(Aluno aluno);
}
