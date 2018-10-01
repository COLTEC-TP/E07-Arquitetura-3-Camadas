package br.ufmg.coltec.tp.appacademico.negocios;

import java.util.List;

public class FachadaAluno implements IFachadaAluno {

    private ControladorAluno controladorAluno;

    public FachadaAluno() {
        controladorAluno = new ControladorAluno();
    }
    @Override
    public void cadastro(String nomeAluno) {
        Aluno aluno = new Aluno(nomeAluno);
        controladorAluno.cadastrarAluno(aluno);
    }

    @Override
    public List consulta(String nomeAluno) {
        Aluno aluno = new Aluno(nomeAluno);
        List alunos = controladorAluno.consultarAlunos(aluno);
        return alunos;
    }
}
