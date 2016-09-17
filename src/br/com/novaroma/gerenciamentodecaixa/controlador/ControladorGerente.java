package br.com.novaroma.gerenciamentoDeCaixa.controlador;

import br.com.novaroma.gerenciamentoDeCaixa.dao.IDao;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Gerente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoRegistroExistente;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaDao;
import java.util.ArrayList;

public class ControladorGerente implements IControladorGerente {

    public ControladorGerente() {
    }

    @Override
    public void cadastrar(Gerente gerente) throws ExcecaoNegocio, ExcecaoRegistroExistente {
        IDao<Gerente> daoGerente = FabricaDao.getDao(Gerente.class);

        if (daoGerente.exists(gerente)) {
            throw new ExcecaoRegistroExistente();
        }
        daoGerente.criar(gerente);

    }

    @Override
    public void atualizar(Gerente gerente) throws ExcecaoEntidadeNaoExistente {
        IDao<Gerente> daoGerente = FabricaDao.getDao(Gerente.class);

        if (!daoGerente.exists(gerente)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoGerente.atualizar(gerente);

    }

    @Override
    public void remover(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<Gerente> daoGerente = FabricaDao.getDao(Gerente.class);
        if (!daoGerente.exists(id)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoGerente.remover(id);
    }

    @Override
    public Gerente consultar(String id) throws ExcecaoEntidadeNaoExistente, ExcecaoNegocio {
        IDao<Gerente> daoEntidade = FabricaDao.getDao(Gerente.class);

        try {
            if (!daoEntidade.exists(id)) {
                throw new ExcecaoEntidadeNaoExistente();
            }

            return daoEntidade.consultar(id);
        } catch (ExcecaoEntidadeNaoExistente ex) {
            throw new ExcecaoEntidadeNaoExistente();
        } catch (ExcecaoNegocio ex) {
            throw new ExcecaoNegocio();
        }

    }

    @Override
    public void conferirMtriculaGerente(String matricula) throws ExcecaoEntidadeNaoExistente, ExcecaoNegocio {
        Gerente gerenteAtualizado = (Gerente) consultar(matricula);

        if (gerenteAtualizado == null) {
            throw new ExcecaoEntidadeNaoExistente();
        }
    }

    @Override
    public ArrayList<Gerente> listar() throws Exception {
        IDao<Gerente> daoGerente = FabricaDao.getDao(Gerente.class);
        return daoGerente.listar();
    }

}
