package br.com.novaroma.gerenciamentoDeCaixa.entidades;

import java.io.Serializable;

public class OperadorDeCaixa extends Pessoa implements Serializable {

    private String matricula;
    String senha;

    public OperadorDeCaixa() {
        super();
    }

    public OperadorDeCaixa(String nome, String sobrenome, String matricula, Endereco endereco, String cpf, String senha) {
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
