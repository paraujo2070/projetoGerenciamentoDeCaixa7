package br.com.novaroma.gerenciamentoDeCaixa.entidades;

import java.io.Serializable;

public abstract class Pessoa extends Entidade implements Serializable {

    private String nome;
    private String sobrenome;
    public Endereco endereco;
    private String cpf;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, String sobrenome, Endereco endereco, String cpf) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public abstract String getId();
}
