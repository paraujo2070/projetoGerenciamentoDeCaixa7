package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorOperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.OperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import javax.swing.JOptionPane;

public class AcessoOperador extends javax.swing.JFrame {

    IControladorOperadorDeCaixa controladorOperador = FabricaControlador.getControladorOperadorDeCaixa();

    public AcessoOperador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonGerente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(260, 200, 80, 25);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(370, 200, 60, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Matricula");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 120, 70, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 160, 50, 17);

        jButton1.setText("Acesso Operador");
        getContentPane().add(jButton1);
        jButton1.setBounds(800, -270, 80, 25);

        jTextFieldUsuario.setToolTipText("Apenas número");
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(260, 110, 200, 30);

        jPasswordFieldSenha.setToolTipText("Digite sua senha!.");
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(260, 150, 200, 30);

        jButtonGerente.setText("Gerente");
        jButtonGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerenteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerente);
        jButtonGerente.setBounds(540, 320, 90, 25);

        jLabel3.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login Operador");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 50, 320, 30);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Tela Login.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 670, 380);

        setSize(new java.awt.Dimension(678, 415));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed

        if (jTextFieldUsuario.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo matrícula é obrigatorio", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            String matricula = jTextFieldUsuario.getText();
            OperadorDeCaixa operador = controladorOperador.consultar(matricula);
            String senha = operador.getSenha();

            if (jTextFieldUsuario.getText().equals(matricula) && jPasswordFieldSenha.getText().equals(senha)) {
                OpcaoOperadorCaixa telaOperador = new OpcaoOperadorCaixa();
                telaOperador.setVisible(true);
                this.dispose();

            } else {

                JOptionPane.showMessageDialog(rootPane, "Senha ou Usuáio invalidos");
            }

        } catch (ExcecaoEntidadeNaoExistente ex) {
            JOptionPane.showMessageDialog(null, "Este usuário não está cadrastrado no sistema!");
        } catch (ExcecaoNegocio ex) {
            new ExcecaoNegocio();
        }
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed

    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
System.exit(0);    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerenteActionPerformed
        TelaLogin telaGerente = new TelaLogin();

        telaGerente.setVisible(true);

    }//GEN-LAST:event_jButtonGerenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonGerente;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
