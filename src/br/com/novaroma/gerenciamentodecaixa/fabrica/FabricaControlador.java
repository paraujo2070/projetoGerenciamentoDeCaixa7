package br.com.novaroma.gerenciamentoDeCaixa.fabrica;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.ControladorGerente;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.ControladorOperadorCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorGerente;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorOperadorDeCaixa;

public class FabricaControlador {

    public static IControladorGerente getControladorGerente() {
        return new ControladorGerente();
    }

    public static IControladorOperadorDeCaixa getControladorOperadorDeCaixa() {
        return new ControladorOperadorCaixa();
    }

}
