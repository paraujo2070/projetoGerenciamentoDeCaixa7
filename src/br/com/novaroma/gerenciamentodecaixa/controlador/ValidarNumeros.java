package br.com.novaroma.gerenciamentoDeCaixa.controlador;

import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntradaInvalida;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public final class ValidarNumeros extends JTextField {

    private int maximoCaracteres = -1;

    public ValidarNumeros() {
        super();
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValidarNumeros(evt);
            }
        });
    }

    public ValidarNumeros(int maximo) {
        super();
        setMaximoCaracteres(maximo);

        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValidarNumeros(evt);
            }
        });
    }

    private void jTextFieldValidarNumeros(KeyEvent evt) {

        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            try {
                evt.consume();
                throw new ExcecaoEntradaInvalida();
            } catch (ExcecaoEntradaInvalida ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        if ((getText().length() >= getMaximoCaracteres()) && (getMaximoCaracteres() != -1)) {
            evt.consume();
            setText(getText().substring(0, getMaximoCaracteres()));
            JOptionPane.showMessageDialog(null, "Você atingiu o limite máximo de digitos nesse campo!");
        }
    }

    public int getMaximoCaracteres() {
        return maximoCaracteres;
    }

    public void setMaximoCaracteres(int maximoCaracteres) {
        this.maximoCaracteres = maximoCaracteres;
    }
}
