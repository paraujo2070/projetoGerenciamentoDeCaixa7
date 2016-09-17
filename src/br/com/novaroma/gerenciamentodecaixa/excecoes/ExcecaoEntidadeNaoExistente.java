package br.com.novaroma.gerenciamentoDeCaixa.excecoes;

public class ExcecaoEntidadeNaoExistente extends Exception {

    public ExcecaoEntidadeNaoExistente() {
        super("Este usuario não esta cadastrado.");
    }

    public ExcecaoEntidadeNaoExistente(String message) {
        super(message);
    }

    public ExcecaoEntidadeNaoExistente(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcecaoEntidadeNaoExistente(Throwable cause) {
        super(cause);
    }

    public ExcecaoEntidadeNaoExistente(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
