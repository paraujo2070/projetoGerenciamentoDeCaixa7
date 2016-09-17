package br.com.novaroma.gerenciamentoDeCaixa.dao;

import br.com.novaroma.gerenciamentoDeCaixa.entidades.Entidade;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import java.util.ArrayList;

public interface IDao<T extends Entidade> {

    public void criar(T entidade) throws ExcecaoNegocio;

    public void atualizar(T entidade) throws ExcecaoEntidadeNaoExistente;

    public void remover(String id) throws ExcecaoEntidadeNaoExistente;

    public T consultar(String id) throws ExcecaoNegocio;

    public boolean exists(String id);

    public boolean exists(T entidade);

    ArrayList<T> listar() throws ExcecaoEntidadeNaoExistente, ClassNotFoundException, ExcecaoNegocio;

}
