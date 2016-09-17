package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

public class OpcoesGerente extends javax.swing.JFrame {

    public OpcoesGerente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadastroOperador = new javax.swing.JMenuItem();
        jMenuItemCadastroGerente = new javax.swing.JMenuItem();
        jMenuItemCriarCaixa = new javax.swing.JMenuItem();
        jMenuRemover = new javax.swing.JMenu();
        jMenuItemRemoverOperador = new javax.swing.JMenuItem();
        jMenuItemExcluirCaixa = new javax.swing.JMenuItem();
        jMenuItemRemoverCaixa = new javax.swing.JMenuItem();
        jMenuAtualizarDados = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemGerente = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemOpCadastrados = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItemListarCaixas = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerente de Caixa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        getContentPane().setLayout(null);
        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(380, 210, 0, 0);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/111.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 1920, 1200);

        jMenuCadastros.setText("Cadastrar");

        jMenuItemCadastroOperador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadastroOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_person_add_black_16dp_1x.png"))); // NOI18N
        jMenuItemCadastroOperador.setText("Cadastro Operador");
        jMenuItemCadastroOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroOperadorActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroOperador);

        jMenuItemCadastroGerente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemCadastroGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_person_add_black_16dp_1x.png"))); // NOI18N
        jMenuItemCadastroGerente.setText("Cadastro Gerente");
        jMenuItemCadastroGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroGerenteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroGerente);

        jMenuItemCriarCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCriarCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_add_circle_black_18dp_1x.png"))); // NOI18N
        jMenuItemCriarCaixa.setText("Criar Caixa");
        jMenuItemCriarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCriarCaixaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCriarCaixa);

        jMenuBar1.add(jMenuCadastros);

        jMenuRemover.setText("Remover");

        jMenuItemRemoverOperador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRemoverOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_delete_forever_black_18dp_1x.png"))); // NOI18N
        jMenuItemRemoverOperador.setText("Remover Operador");
        jMenuItemRemoverOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRemoverOperadorActionPerformed(evt);
            }
        });
        jMenuRemover.add(jMenuItemRemoverOperador);

        jMenuItemExcluirCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemExcluirCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_delete_forever_black_18dp_1x.png"))); // NOI18N
        jMenuItemExcluirCaixa.setText("Remover Gerente");
        jMenuItemExcluirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirCaixaActionPerformed(evt);
            }
        });
        jMenuRemover.add(jMenuItemExcluirCaixa);

        jMenuItemRemoverCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentodecaixa/imagens/ic_delete_forever_black_18dp_1x.png"))); // NOI18N
        jMenuItemRemoverCaixa.setText("Remover Caixa");
        jMenuItemRemoverCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRemoverCaixaActionPerformed(evt);
            }
        });
        jMenuRemover.add(jMenuItemRemoverCaixa);

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

        jMenuItemGerente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_mode_edit_black_18dp_1x.png"))); // NOI18N
        jMenuItemGerente.setText("Gerente");
        jMenuItemGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenteActionPerformed(evt);
            }
        });
        jMenuAtualizarDados.add(jMenuItemGerente);

        jMenuBar1.add(jMenuAtualizarDados);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemOpCadastrados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_9, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemOpCadastrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_pages_black_18dp_1x.png"))); // NOI18N
        jMenuItemOpCadastrados.setText("Visualizar Operadores Cadastrados");
        jMenuItemOpCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpCadastradosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemOpCadastrados);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_pages_black_18dp_1x.png"))); // NOI18N
        jMenuItem2.setText("Visualizar Gerentes Cadastrados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItem2);

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

    private void jMenuItemCadastroOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroOperadorActionPerformed
        CadastroOperado cadastroOperador = new CadastroOperado(this, true);
        cadastroOperador.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroOperadorActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadastroGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroGerenteActionPerformed
        CadastroGerente cadastroGerente = new CadastroGerente(this, true);
        cadastroGerente.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroGerenteActionPerformed

    private void jMenuItemExcluirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirCaixaActionPerformed
        RemoverGerente removerGerente = new RemoverGerente(this, true);
        removerGerente.setVisible(true);
    }//GEN-LAST:event_jMenuItemExcluirCaixaActionPerformed

    private void jMenuItemRemoverOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRemoverOperadorActionPerformed
        RemoverOperador removerOperador = new RemoverOperador(this, true);
        removerOperador.setVisible(true);
    }//GEN-LAST:event_jMenuItemRemoverOperadorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CapturarOperador capCodOperador = new CapturarOperador();
        capCodOperador.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenteActionPerformed
        CapturarGerente capGerente = new CapturarGerente();
        capGerente.setVisible(true);
    }//GEN-LAST:event_jMenuItemGerenteActionPerformed

    private void jMenuItemOpCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpCadastradosActionPerformed
        ListaOperador listaOp = new ListaOperador();
        listaOp.setVisible(true);
    }//GEN-LAST:event_jMenuItemOpCadastradosActionPerformed

    private void jMenuItemCriarCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCriarCaixaActionPerformed
        CriarCaixa caixa = new CriarCaixa();
        caixa.setVisible(true);
    }//GEN-LAST:event_jMenuItemCriarCaixaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ListarGerente listaGerente = new ListarGerente();
        listaGerente.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemListarCaixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarCaixasActionPerformed
        ListaCaixas listaCaixas = new ListaCaixas(this, true);
        listaCaixas.setVisible(true);
    }//GEN-LAST:event_jMenuItemListarCaixasActionPerformed

    private void jMenuItemRemoverCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRemoverCaixaActionPerformed
        RemoverCaixa removerCaixa = new RemoverCaixa(this, rootPaneCheckingEnabled);
        removerCaixa.setVisible(true);
    }//GEN-LAST:event_jMenuItemRemoverCaixaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenuAtualizarDados;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCadastroGerente;
    private javax.swing.JMenuItem jMenuItemCadastroOperador;
    private javax.swing.JMenuItem jMenuItemCriarCaixa;
    private javax.swing.JMenuItem jMenuItemExcluirCaixa;
    private javax.swing.JMenuItem jMenuItemGerente;
    private javax.swing.JMenuItem jMenuItemListarCaixas;
    private javax.swing.JMenuItem jMenuItemOpCadastrados;
    private javax.swing.JMenuItem jMenuItemRemoverCaixa;
    private javax.swing.JMenuItem jMenuItemRemoverOperador;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuRemover;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables

}
