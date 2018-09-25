package br.ufmg.coltec.tp.appacademico.Negocio;

/**
 * Created by a2016951820 on 19/09/18.
 */

public class Professor {

    private String nome;
    private String curso;
    private long  numeroCadastro;

    public Professor(String nome, String curso, long numeroCadastro) {
        this.nome = nome;
        this.curso = curso;
        this.numeroCadastro = numeroCadastro;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public long getNumeroCadastro() {
        return numeroCadastro;
    }

    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNumeroCadastro(long numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }
}
