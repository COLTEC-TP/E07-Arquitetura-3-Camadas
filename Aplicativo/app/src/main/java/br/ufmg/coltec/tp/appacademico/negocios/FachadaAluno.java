package br.ufmg.coltec.tp.appacademico.negocios;

import java.util.List;

public class FachadaAluno implements IFachadaAluno {

    @Override
    public void Cadastro(String nomeAluno) {
        Aluno aluno = new Aluno(nomeAluno);
        new ControladorAluno().cadastrarAluno(aluno);
    }

    @Override
    public void Consulta(String nomeAluno) {
        List alunos = new ControladorAluno().consultarAlunos();
    }
}
