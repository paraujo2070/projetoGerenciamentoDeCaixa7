package br.com.novaroma.gerenciamentoDeCaixa.controlador;

import br.com.novaroma.gerenciamentoDeCaixa.dao.IDao;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Caixa;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.OperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoRegistroExistente;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaDao;
import java.util.ArrayList;

public class ControladorOperadorCaixa implements IControladorOperadorDeCaixa {

    @Override
    public void cadastrar(OperadorDeCaixa operador) throws ExcecaoNegocio, ExcecaoRegistroExistente {
        IDao<OperadorDeCaixa> daoOperadorCaixa = FabricaDao.getDao(OperadorDeCaixa.class);

        if (daoOperadorCaixa.exists(operador)) {
            throw new ExcecaoRegistroExistente();
        }
        daoOperadorCaixa.criar(operador);

    }

    @Override
    public void atualizar(OperadorDeCaixa operador) throws ExcecaoEntidadeNaoExistente {
        IDao<OperadorDeCaixa> daoOperadorCaixa = FabricaDao.getDao(OperadorDeCaixa.class);

        if (!daoOperadorCaixa.exists(operador)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoOperadorCaixa.atualizar(operador);
    }

    @Override
    public void remover(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<OperadorDeCaixa> daoOperadorCaixa = FabricaDao.getDao(OperadorDeCaixa.class);
        if (!daoOperadorCaixa.exists(id)) {
            throw new ExcecaoEntidadeNaoExistente();
        }

        daoOperadorCaixa.remover(id);
    }

    @Override
    public void removerCaixa(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<Caixa> daoCaixa = FabricaDao.getDao(Caixa.class);
        if (!daoCaixa.exists(id)) {
            throw new ExcecaoEntidadeNaoExistente();
        }

        daoCaixa.remover(id);
    }

    @Override
    public OperadorDeCaixa consultar(String id) throws ExcecaoEntidadeNaoExistente, ExcecaoNegocio {
        IDao<OperadorDeCaixa> daoOperadorCaixa = FabricaDao.getDao(OperadorDeCaixa.class);

        try {
            if (!daoOperadorCaixa.exists(id)) {
                throw new ExcecaoEntidadeNaoExistente();
            }

            return daoOperadorCaixa.consultar(id);
        } catch (ExcecaoEntidadeNaoExistente ex) {
            throw new ExcecaoEntidadeNaoExistente();
        }
    }

    @Override
    public void criarCaixa(Caixa caixa) throws ExcecaoNegocio, ExcecaoRegistroExistente {
        IDao<Caixa> daoCaixa = FabricaDao.getDao(Caixa.class);

        if (daoCaixa.exists(caixa)) {
            throw new ExcecaoRegistroExistente();
        }
        daoCaixa.criar(caixa);
    }

    @Override
    public void atualizarCaixa(Caixa caixa) throws ExcecaoEntidadeNaoExistente {
        IDao<Caixa> daoCaixa = FabricaDao.getDao(Caixa.class);

        if (!daoCaixa.exists(caixa)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoCaixa.atualizar(caixa);

    }

    @Override
    public ArrayList<OperadorDeCaixa> listar() throws Exception {
        IDao<OperadorDeCaixa> daoOperador = FabricaDao.getDao(OperadorDeCaixa.class);
        return daoOperador.listar();
    }

    @Override
    public ArrayList<Caixa> listarCaixa() throws Exception {
        IDao<Caixa> daoCaixa = FabricaDao.getDao(Caixa.class);
        return daoCaixa.listar();
    }

}
