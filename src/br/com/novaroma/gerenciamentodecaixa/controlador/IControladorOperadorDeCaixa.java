package br.com.novaroma.gerenciamentoDeCaixa.controlador;

import br.com.novaroma.gerenciamentoDeCaixa.entidades.Caixa;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.OperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoRegistroExistente;
import java.util.ArrayList;

public interface IControladorOperadorDeCaixa {

    OperadorDeCaixa consultar(String id) throws ExcecaoEntidadeNaoExistente, ExcecaoNegocio;

    void cadastrar(OperadorDeCaixa operador) throws ExcecaoNegocio, ExcecaoRegistroExistente;

    void atualizar(OperadorDeCaixa operador) throws ExcecaoEntidadeNaoExistente;

    void remover(String id) throws ExcecaoEntidadeNaoExistente;

    void criarCaixa(Caixa caixa) throws ExcecaoNegocio, ExcecaoRegistroExistente;

    void atualizarCaixa(Caixa caixa) throws ExcecaoEntidadeNaoExistente;

    ArrayList<OperadorDeCaixa> listar() throws Exception;

    ArrayList<Caixa> listarCaixa() throws Exception;

    void removerCaixa(String id) throws ExcecaoEntidadeNaoExistente;

}
