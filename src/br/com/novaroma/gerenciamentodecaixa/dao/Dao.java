package br.com.novaroma.gerenciamentoDeCaixa.dao;

import br.com.novaroma.gerenciamentoDeCaixa.entidades.Entidade;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Dao<T extends Entidade> implements IDao<T> {

    private final String EXTENSAO = ".data";

    private Class<T> currentClass;

    public Dao(Class<T> currentClass) {
        this.currentClass = currentClass;
    }

    @Override
    public void criar(T entidade) throws ExcecaoNegocio {
        File folder = getFolder();
        File file = new File(folder, entidade.getId() + EXTENSAO);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(entidade);
        } catch (Exception ex) {
            throw new ExcecaoNegocio();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    throw new ExcecaoNegocio();
                }
            }
        }
    }

    @Override
    public void atualizar(T entidade) throws ExcecaoEntidadeNaoExistente {
        try {
            criar(entidade);
        } catch (Exception ex) {
            throw new ExcecaoEntidadeNaoExistente();
        }
    }

    @Override
    public void remover(String id) throws ExcecaoEntidadeNaoExistente {
        File pasta = getFolder();
        File arquivo = new File(pasta, id + EXTENSAO);
        try {
            arquivo.delete();
        } catch (Exception e) {
            throw new ExcecaoEntidadeNaoExistente();
        }

    }

    @Override
    public T consultar(String id) throws ExcecaoNegocio {

        T entidade = null;
        File pasta = getFolder();

        File file = new File(pasta, id + EXTENSAO);

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            entidade = (T) ois.readObject();

        } catch (Exception ex) {
            throw new ExcecaoNegocio();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    throw new ExcecaoNegocio();
                }
            }
        }

        return entidade;
    }

    @Override
    public ArrayList<T> listar() throws ClassNotFoundException, ExcecaoNegocio {

        File diretorio = getFolder();
        File fList[] = diretorio.listFiles();

        try {
            ArrayList<T> listaT = new ArrayList<T>();

            for (int i = 0; i < fList.length; i++) {
                InputStream in = new FileInputStream(fList[i]);
                ObjectInputStream oin = new ObjectInputStream(in);
                listaT.add((T) oin.readObject());

                oin.close();
                in.close();
            }

            return listaT;

        } catch (IOException e) {
            throw new ExcecaoNegocio();
        }
    }

    @Override
    public boolean exists(T entidade) {
        File file = getFile(entidade);
        return file.exists();
    }

    @Override
    public boolean exists(String id) {
        File file = getFile(id);
        return file.exists();
    }

    private File getFolder() {
        String getClassName = "Projeto\\" + currentClass.getSimpleName();
        File file = new File(getClassName);
        file.mkdirs();
        return file;
    }

    private File getFile(T entidade) {
        File directory = getFolder();
        directory.mkdirs();

        return new File(directory, entidade.getId() + EXTENSAO);
    }

    private File getFile(String id) {
        File directory = getFolder();
        directory.mkdirs();

        return new File(directory, id + EXTENSAO);
    }

}
