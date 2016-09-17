package br.com.novaroma.gerenciamentoDeCaixa.excecoes;

public class ExcecaoRegistroExistente extends Exception {

    public ExcecaoRegistroExistente() {
        super("Entidade já cadastrada!");
    }

    public ExcecaoRegistroExistente(String message) {
        super(message);
    }

    public ExcecaoRegistroExistente(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcecaoRegistroExistente(Throwable cause) {
        super(cause);
    }

    public ExcecaoRegistroExistente(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
