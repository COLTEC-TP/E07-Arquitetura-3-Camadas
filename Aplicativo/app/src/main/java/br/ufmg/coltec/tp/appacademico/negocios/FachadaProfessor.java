package br.ufmg.coltec.tp.appacademico.negocios;

import java.util.List;

public class FachadaProfessor implements IFachadaProfessor {


    @Override
    public void Cadastro(String nomeProfessor) {
        Professor professor = new Professor(nomeProfessor);
        new ControladorProfessor().cadastrarProfessor(professor);
    }

    @Override
    public void Consulta(String nomeProfessor) {
        List professores = new ControladorProfessor().consultarProfessores();
    }
}
