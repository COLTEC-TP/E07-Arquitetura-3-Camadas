package br.ufmg.coltec.tp.appacademico.negocios;

import java.util.List;

public interface IFachadaProfessor {

    void cadastro(String nomeProfessor);
    List consulta(String nomeProfessor);
}
