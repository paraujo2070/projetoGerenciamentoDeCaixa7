package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorOperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.ValidarNumeros;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Caixa;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.OperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoRegistroExistente;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CriarCaixa extends javax.swing.JDialog {

    IControladorOperadorDeCaixa controladorOperador = FabricaControlador.getControladorOperadorDeCaixa();

    public CriarCaixa() {
        super();
        initComponents();

        try {
            listarOperado();
        } catch (ExcecaoNegocio ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno!", "Aviso", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNumeroCaixa = new ValidarNumeros();
        jLabelNumeroCaixa = new javax.swing.JLabel();
        jTextFieldMatricula = new ValidarNumeros();
        jLabelOperador = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarOperador = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelComImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        getContentPane().setLayout(null);

        jTextFieldNumeroCaixa.setToolTipText("Digite o número do caixa.");
        jTextFieldNumeroCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroCaixaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumeroCaixa);
        jTextFieldNumeroCaixa.setBounds(150, 50, 120, 30);

        jLabelNumeroCaixa.setText("Número do Caixa");
        getContentPane().add(jLabelNumeroCaixa);
        jLabelNumeroCaixa.setBounds(40, 60, 110, 20);

        jTextFieldMatricula.setToolTipText("Apenas números.");
        jTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMatricula);
        jTextFieldMatricula.setBounds(150, 100, 120, 30);

        jLabelOperador.setText("Matricula");
        getContentPane().add(jLabelOperador);
        jLabelOperador.setBounds(40, 110, 120, 20);

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_person_add_black_16dp_1x.png"))); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(170, 170, 110, 25);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_close_black_18dp_1x.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(37, 170, 110, 27);

        jTableListarOperador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Matrícula"
            }
        ));
        jScrollPane1.setViewportView(jTableListarOperador);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 50, 240, 200);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Lista de Operadores de caixa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 20, 220, 19);

        jLabelComImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        jLabelComImagem.setText("jLabel2");
        getContentPane().add(jLabelComImagem);
        jLabelComImagem.setBounds(0, 0, 560, 270);

        setSize(new java.awt.Dimension(566, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroCaixaActionPerformed

    private void jTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        if (jTextFieldNumeroCaixa.getText().trim().equals("") || jTextFieldMatricula.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os campos são de preenchimento obrigatorio!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            String matricula = jTextFieldMatricula.getText();

            try {
                controladorOperador.consultar(matricula);
            } catch (ExcecaoNegocio ex) {
                new ExcecaoNegocio();
            }

            criarCaixa(matricula);

        } catch (ExcecaoEntidadeNaoExistente ex) {
            JOptionPane.showMessageDialog(null, "matrícula Inexistente!");
        }

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelComImagem;
    private javax.swing.JLabel jLabelNumeroCaixa;
    private javax.swing.JLabel jLabelOperador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarOperador;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNumeroCaixa;
    // End of variables declaration//GEN-END:variables

    private boolean isInvalid(JTextField campo) {
        return campo.getText().isEmpty();
    }

    private void criarCaixa(String matricula) {

        try {

            String numeroCaixa = jTextFieldNumeroCaixa.getText();
            String nome = controladorOperador.consultar(matricula).getNome();
            String sobreNome = controladorOperador.consultar(matricula).getSobrenome();

            Caixa caixa = new Caixa(numeroCaixa, nome, sobreNome, matricula);

            controladorOperador.criarCaixa(caixa);

            JOptionPane.showMessageDialog(rootPane, "Caixa cadastrado com sucesso!", "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
        } catch (ExcecaoRegistroExistente | ExcecaoNegocio ex) {
            JOptionPane.showMessageDialog(rootPane, "Este caixa Já esta Em Uso", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ExcecaoEntidadeNaoExistente ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void listarOperado() throws ExcecaoNegocio, Exception {

        try {
            ArrayList<OperadorDeCaixa> listCaixa = controladorOperador.listar();

            for (int i = 0; i < listCaixa.size(); i++) {

                DefaultTableModel listarCaixa = (DefaultTableModel) jTableListarOperador.getModel();

                listarCaixa.addRow(new String[]{listCaixa.get(i).getNome(), listCaixa.get(i).getMatricula()});

            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum Operador foi cadrastrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }

}
