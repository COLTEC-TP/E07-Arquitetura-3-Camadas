package br.ufmg.coltec.tp.appacademico.dados;

import java.net.PortUnreachableException;
import java.util.List;

import br.ufmg.coltec.tp.appacademico.negocios.Professor;

public interface IRepositorioProfessor {

    void addProfessor(Professor professor);
    List<Professor> getAllProfesssores(Professor professor);
}
