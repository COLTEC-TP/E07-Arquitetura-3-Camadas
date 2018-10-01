package br.ufmg.coltec.tp.appacademico.negocios;

import java.util.List;

public class FachadaProfessor implements IFachadaProfessor {

    private ControladorProfessor controladorProfessor;

    public FachadaProfessor() {
        controladorProfessor = new ControladorProfessor();
    }

    @Override
    public void cadastro(String nomeProfessor) {
        Professor professor = new Professor(nomeProfessor);
        controladorProfessor.cadastrarProfessor(professor);
    }

    @Override
    public List consulta(String nomeProfessor) {
        Professor professor = new Professor(nomeProfessor);
        List professores = controladorProfessor.consultarProfessores(professor);
        return professores;
    }
}
