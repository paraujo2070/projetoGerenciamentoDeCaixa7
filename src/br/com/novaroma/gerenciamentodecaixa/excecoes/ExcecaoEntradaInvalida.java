package br.com.novaroma.gerenciamentoDeCaixa.excecoes;

public class ExcecaoEntradaInvalida extends Throwable {

    public ExcecaoEntradaInvalida() {
        super("Verifique se você preencheu os campos corretamente!");
    }

    public ExcecaoEntradaInvalida(String message) {
        super(message);
    }

    public ExcecaoEntradaInvalida(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcecaoEntradaInvalida(Throwable cause) {
        super(cause);
    }

    public ExcecaoEntradaInvalida(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
