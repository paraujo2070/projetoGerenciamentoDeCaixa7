package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorGerente;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.ValidarNumeros;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Gerente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;
import javax.swing.JOptionPane;

public class CapturarGerente extends javax.swing.JDialog {

    IControladorGerente controladorGerente = FabricaControlador.getControladorGerente();

    public CapturarGerente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldMatricula = new ValidarNumeros();
        jButtonOk = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Localizar Matrícula");
        setModal(true);
        getContentPane().setLayout(null);

        jLabel1.setText(" Matrícula");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 60, 31);

        jTextFieldMatricula.setToolTipText("Apenas números.");
        jTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMatricula);
        jTextFieldMatricula.setBounds(90, 20, 180, 31);

        jButtonOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_search_black_18dp_1x.png"))); // NOI18N
        jButtonOk.setText("Procurar");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOk);
        jButtonOk.setBounds(170, 60, 100, 27);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_close_black_18dp_1x.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(47, 60, 110, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 310, 120);

        setSize(new java.awt.Dimension(327, 153));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed

        if (jTextFieldMatricula.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo matrícula é obrigatorio", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            String matricula = jTextFieldMatricula.getText();

            Gerente gerente = controladorGerente.consultar(matricula);

            AtualizarGerente atualizado = new AtualizarGerente(gerente);

            atualizado.setVisible(true);
            this.dispose();
        } catch (ExcecaoEntidadeNaoExistente ex) {
            JOptionPane.showMessageDialog(null, "Este usuário não está cadrastrado no sistema!");
        } catch (ExcecaoNegocio ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno!.");
        }


    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldMatricula;
    // End of variables declaration//GEN-END:variables
}
