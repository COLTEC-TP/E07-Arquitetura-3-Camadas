package br.ufmg.coltec.tp.appacademico.negocios;


import java.util.List;

public interface IFachadaAluno {

    void cadastro(String nomeAluno);
    List consulta(String nomeAluno);
}
