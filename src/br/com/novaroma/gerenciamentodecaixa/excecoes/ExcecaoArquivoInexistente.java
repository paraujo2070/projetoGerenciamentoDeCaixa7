package br.com.novaroma.gerenciamentoDeCaixa.excecoes;

public class ExcecaoArquivoInexistente extends Exception {

    public ExcecaoArquivoInexistente() {
        super("O arquivo não existe!");
    }

    public ExcecaoArquivoInexistente(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ExcecaoArquivoInexistente(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcecaoArquivoInexistente(String message) {
        super(message);
    }

    public ExcecaoArquivoInexistente(Throwable cause) {
        super(cause);

    }
}
