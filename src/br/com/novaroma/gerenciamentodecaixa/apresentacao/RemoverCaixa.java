package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorOperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.ValidarNumeros;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Caixa;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RemoverCaixa extends javax.swing.JDialog {

    IControladorOperadorDeCaixa controladorOperador = FabricaControlador.getControladorOperadorDeCaixa();

    public RemoverCaixa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        try {
            listarCaixa();
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno!", "Aviso", JOptionPane.ERROR_MESSAGE);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCadastro = new javax.swing.JLabel();
        jTextFieldCaixa = new ValidarNumeros();
        jLabel4 = new javax.swing.JLabel();
        jButtonRemover = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarCaixa = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remover Operador");
        setModal(true);
        getContentPane().setLayout(null);

        jLabelCadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCadastro.setText("Caixa");
        getContentPane().add(jLabelCadastro);
        jLabelCadastro.setBounds(40, 50, 63, 29);

        jTextFieldCaixa.setToolTipText("Digite o número do caixa a ser fechado.");
        getContentPane().add(jTextFieldCaixa);
        jTextFieldCaixa.setBounds(100, 50, 173, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Lista de caixas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 10, 150, 30);

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_delete_forever_black_18dp_1x.png"))); // NOI18N
        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemover);
        jButtonRemover.setBounds(160, 100, 110, 27);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_close_black_18dp_1x.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(40, 100, 110, 27);

        jTableListarCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Caixa", "Operador"
            }
        ));
        jScrollPane1.setViewportView(jTableListarCaixa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 50, 240, 200);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 560, 270);

        setSize(new java.awt.Dimension(566, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        removerCaixa();
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarCaixa;
    private javax.swing.JTextField jTextFieldCaixa;
    // End of variables declaration//GEN-END:variables
public void removerCaixa() {

        if (jTextFieldCaixa.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Caixa é obrigatorio", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String id = jTextFieldCaixa.getText();

            controladorOperador.removerCaixa(id);

            JOptionPane.showMessageDialog(null, "caixa Removido Com Sucesso!");

            dispose();

        } catch (ExcecaoEntidadeNaoExistente ex) {
            JOptionPane.showMessageDialog(null, "Caixa Não Cadastrado!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato Invalido!");
        }

    }

    private void listarCaixa() throws Exception {

        try {
            ArrayList<Caixa> listCaixa = controladorOperador.listarCaixa();

            for (int i = 0; i < listCaixa.size(); i++) {

                DefaultTableModel listarCaixa = (DefaultTableModel) jTableListarCaixa.getModel();

                listarCaixa.addRow(new String[]{listCaixa.get(i).getNumero(), listCaixa.get(i).getNome()});

            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum Caixa foi cadrastrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
}
