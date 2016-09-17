package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorGerente;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.ValidarNumeros;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Gerente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RemoverGerente extends javax.swing.JDialog {

    IControladorGerente controladorGerente = FabricaControlador.getControladorGerente();

    public RemoverGerente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            listarGerente();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelMatricula = new javax.swing.JLabel();
        jTextFieldMatricula = new ValidarNumeros();
        jButtonRemover = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarGerente = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabelComImagem = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remover Gerente");
        setModal(true);
        getContentPane().setLayout(null);

        jLabelMatricula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMatricula.setText("Matrícula");
        getContentPane().add(jLabelMatricula);
        jLabelMatricula.setBounds(40, 50, 63, 29);

        jTextFieldMatricula.setToolTipText("Apenas números.");
        jTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMatricula);
        jTextFieldMatricula.setBounds(110, 50, 173, 29);

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_delete_forever_black_18dp_1x.png"))); // NOI18N
        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemover);
        jButtonRemover.setBounds(170, 100, 110, 27);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_close_black_18dp_1x.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(40, 100, 110, 27);

        jTableListarGerente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gerente", "Matrícula"
            }
        ));
        jScrollPane1.setViewportView(jTableListarGerente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 50, 240, 200);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gerentes");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 10, 150, 30);

        jLabelComImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        jLabelComImagem.setText("jLabel2");
        getContentPane().add(jLabelComImagem);
        jLabelComImagem.setBounds(0, 0, 560, 270);

        setSize(new java.awt.Dimension(567, 309));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        removerGerente();
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelComImagem;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarGerente;
    private javax.swing.JTextField jTextFieldMatricula;
    // End of variables declaration//GEN-END:variables
public void removerGerente() {

        if (jTextFieldMatricula.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo matrícula é obrigatorio", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String id = jTextFieldMatricula.getText();

            controladorGerente.remover(id);
            JOptionPane.showMessageDialog(null, "Gerente Removido Com Sucesso!");
            this.dispose();

        } catch (ExcecaoEntidadeNaoExistente ex) {
            JOptionPane.showMessageDialog(null, "Esta matrícula não está cadrastrada no sistema!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato Invalido!");
        }

    }

    private void listarGerente() throws ExcecaoNegocio, Exception {

        try {
            ArrayList<Gerente> listGerente = controladorGerente.listar();

            for (int i = 0; i < listGerente.size(); i++) {

                DefaultTableModel listarGerente = (DefaultTableModel) jTableListarGerente.getModel();

                listarGerente.addRow(new String[]{listGerente.get(i).getNome(), listGerente.get(i).getMatricula()});

            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum Gerente foi cadrastrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
}
