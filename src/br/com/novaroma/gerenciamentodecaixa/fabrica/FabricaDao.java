package br.com.novaroma.gerenciamentoDeCaixa.fabrica;

import br.com.novaroma.gerenciamentoDeCaixa.dao.Dao;
import br.com.novaroma.gerenciamentoDeCaixa.dao.IDao;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Entidade;

public class FabricaDao {

    public static <T extends Entidade> IDao<T> getDao(Class<T> currentClass) {
        return new Dao<T>(currentClass);
    }
}
