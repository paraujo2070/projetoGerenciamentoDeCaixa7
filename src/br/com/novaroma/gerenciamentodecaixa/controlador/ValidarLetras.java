package br.com.novaroma.gerenciamentoDeCaixa.controlador;

import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntradaInvalida;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public final class ValidarLetras extends JTextField {

    public ValidarLetras() {
        super();
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValidarLetras(evt);
            }
        });
    }

    private void jTextFieldValidarLetras(KeyEvent evt) {

        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            try {
                evt.consume();
                throw new ExcecaoEntradaInvalida();
            } catch (ExcecaoEntradaInvalida ex) {
                JOptionPane.showMessageDialog(null, "Verifique se você preencheu os campos corretamente!");
            }
        }
    }

}
