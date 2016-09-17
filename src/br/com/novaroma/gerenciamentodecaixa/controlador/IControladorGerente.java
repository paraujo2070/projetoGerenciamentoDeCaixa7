package br.com.novaroma.gerenciamentoDeCaixa.controlador;

import br.com.novaroma.gerenciamentoDeCaixa.entidades.Gerente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoRegistroExistente;
import java.util.ArrayList;

public interface IControladorGerente {

    void cadastrar(Gerente gerente) throws ExcecaoNegocio, ExcecaoRegistroExistente;

    void atualizar(Gerente gerente) throws ExcecaoEntidadeNaoExistente;

    void remover(String id) throws ExcecaoEntidadeNaoExistente;

    Gerente consultar(String id) throws ExcecaoEntidadeNaoExistente, ExcecaoNegocio;

    void conferirMtriculaGerente(String matricula) throws ExcecaoEntidadeNaoExistente, ExcecaoNegocio;

    ArrayList<Gerente> listar() throws Exception;

}
