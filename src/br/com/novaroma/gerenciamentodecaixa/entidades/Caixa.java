package br.com.novaroma.gerenciamentoDeCaixa.entidades;

import java.io.Serializable;

public class Caixa extends Entidade implements Serializable {

    private String numero;
    private String nome;
    private String sobreNome;
    private String matricula;

    public Caixa(String numero, String nome, String sobrenome) {

        this.numero = numero;
        this.nome = nome;
        this.sobreNome = sobrenome;

    }

    public Caixa(String numero, String nome, String sobrenome, String matricula) {

        this.numero = numero;
        this.nome = nome;
        this.sobreNome = sobrenome;
        this.matricula = matricula;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getId() {
        return getNumero();
    }

}
