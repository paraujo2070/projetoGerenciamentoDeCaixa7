package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

public class OpcaoOperadorCaixa extends javax.swing.JFrame {

    public OpcaoOperadorCaixa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuRemover = new javax.swing.JMenu();
        jMenuAtualizarDados = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemListarCaixas = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operador de caixa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 969, 606);

        jMenuCadastros.setText("Cadastrar");
        jMenuBar1.add(jMenuCadastros);

        jMenuRemover.setText("Remover");
        jMenuBar1.add(jMenuRemover);

        jMenuAtualizarDados.setText("Atualizar");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_mode_edit_black_18dp_1x.png"))); // NOI18N
        jMenuItem1.setText("Dados Operado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAtualizarDados.add(jMenuItem1);

        jMenuBar1.add(jMenuAtualizarDados);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemListarCaixas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemListarCaixas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_pages_black_18dp_1x.png"))); // NOI18N
        jMenuItemListarCaixas.setText("Visualizar Caixas Em Operaçao");
        jMenuItemListarCaixas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarCaixasActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemListarCaixas);

        jMenuBar1.add(jMenuRelatorios);

        jMenuSair.setText("Sair");

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_close_black_18dp_1x.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(798, 467));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CapturarOperador capCodOperador = new CapturarOperador();
        capCodOperador.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemListarCaixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarCaixasActionPerformed
        ListaCaixas listaCaixas = new ListaCaixas(this, true);
        listaCaixas.setVisible(true);
    }//GEN-LAST:event_jMenuItemListarCaixasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JMenu jMenuAtualizarDados;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemListarCaixas;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuRemover;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
