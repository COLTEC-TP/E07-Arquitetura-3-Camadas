package br.ufmg.coltec.tp.appacademico.Negocio;

/**
 * Created by a2016951820 on 19/09/18.
 */

public class Aluno {
    private String nome;
    private String curso;
    private long matricula;
    private String endereco;

    public Aluno(String nome, String curso, long matricula, String endereco) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getEndereco() {
        return endereco;
    }

}
