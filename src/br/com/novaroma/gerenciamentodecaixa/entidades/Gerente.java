package br.com.novaroma.gerenciamentoDeCaixa.entidades;

import java.io.Serializable;

public class Gerente extends Pessoa implements Serializable {

    private String matricula;
    private String senha;

    public Gerente() {
        super();
    }

    public Gerente(String nome, String sobrenome, String matricula, Endereco endereco, String cpf, String senha) {
        super(nome, sobrenome, endereco, cpf);
        this.matricula = matricula;
        this.senha = senha;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String getId() {
        return matricula;
    }

}
