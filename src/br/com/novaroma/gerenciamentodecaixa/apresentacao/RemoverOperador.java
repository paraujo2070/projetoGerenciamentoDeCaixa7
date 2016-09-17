package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorOperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;
import javax.swing.JOptionPane;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.ValidarNumeros;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.OperadorDeCaixa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class RemoverOperador extends javax.swing.JDialog {

    IControladorOperadorDeCaixa controladorOperador = FabricaControlador.getControladorOperadorDeCaixa();

    public RemoverOperador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            listarOperado();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelCadastro = new javax.swing.JLabel();
        jTextFieldMatricula = new ValidarNumeros();
        jButtonRemover = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarOperador = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remover Operador");
        setModal(true);
        getContentPane().setLayout(null);

        jLabelCadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCadastro.setText("Matrícula");
        getContentPane().add(jLabelCadastro);
        jLabelCadastro.setBounds(40, 50, 63, 29);

        jTextFieldMatricula.setToolTipText("Apenas números.");
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

        jTableListarOperador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operador", "Matrícula"
            }
        ));
        jScrollPane1.setViewportView(jTableListarOperador);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 50, 240, 200);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Operadores");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 10, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 560, 270);

        setSize(new java.awt.Dimension(567, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        removerOperador();
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarOperador;
    private javax.swing.JTextField jTextFieldMatricula;
    // End of variables declaration//GEN-END:variables
public void removerOperador() {

        if (jTextFieldMatricula.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo matrícula é obrigatorio", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String id = jTextFieldMatricula.getText();

            controladorOperador.remover(id);

            JOptionPane.showMessageDialog(null, "Operador Removido Com Sucesso!");
            this.dispose();

        } catch (ExcecaoEntidadeNaoExistente ex) {
            JOptionPane.showMessageDialog(null, "Esta matrícula não está cadrastrada no sistema!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato Invalido!");
        }

    }

    private void listarOperado() throws Exception {

        try {
            ArrayList<OperadorDeCaixa> listOperador = controladorOperador.listar();

            for (int i = 0; i < listOperador.size(); i++) {

                DefaultTableModel listarOperador = (DefaultTableModel) jTableListarOperador.getModel();

                listarOperador.addRow(new String[]{listOperador.get(i).getNome(), listOperador.get(i).getMatricula()});

            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum Operador foi cadrastrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
}
