package br.com.novaroma.gerenciamentoDeCaixa.entidades;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {

    private String matricula;
    private String senha;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String sobrenome, String matricula, String senha, Endereco endereco, String cpf) {
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
        this.matricula = senha;
    }

    @Override
    public String getId() {
        return matricula;
    }

}
