package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorOperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.*;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Endereco;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.OperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;

import javax.swing.JOptionPane;

public class AtualizarOperado extends javax.swing.JDialog {

    IControladorOperadorDeCaixa controladorOperador = FabricaControlador.getControladorOperadorDeCaixa();
    private OperadorDeCaixa operador;

    public AtualizarOperado() {
        initComponents();
    }

    public AtualizarOperado(OperadorDeCaixa operador) {
        initComponents();
        this.operador = operador;
        setTextoNaTela();
    }

    private void setTextoNaTela() {
        jTextFieldNome5.setText(this.operador.getNome());
        jTextFieldSobrenome.setText(this.operador.getSobrenome());
        jTextFieldRua.setText(this.operador.endereco.getRua());
        jTextFieldBairro.setText(this.operador.endereco.getBairro());
        jTextFieldCidade.setText(this.operador.endereco.getCidade());
        jTextFieldEstado.setText(this.operador.endereco.getEstado());
        jTextFieldCep.setText(this.operador.endereco.getCep());
        jTextFieldComplemento.setText(this.operador.endereco.getComplemento());
        jTextFieldNumero.setText(this.operador.endereco.getNumero());
        jTextFieldCpf.setText(this.operador.getCpf());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldRua = new ValidarLetras();
        jTextFieldSobrenome = new ValidarLetras();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelSobrenome1 = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelRua = new javax.swing.JLabel();
        jTextFieldBairro = new ValidarLetras();
        jTextFieldCidade = new ValidarLetras();
        jTextFieldEstado = new ValidarLetras();
        jTextFieldComplemento = new ValidarLetras();
        jTextFieldNome5 = new ValidarLetras();
        jTextFieldCpf = new ValidarNumeros(11);
        jLabelComoplemento = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldNumero = new ValidarNumeros();
        jTextFieldCep = new ValidarNumeros();
        jButtonCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelComImagem = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(780, 780));
        jLabel1.setMinimumSize(new java.awt.Dimension(420, 420));
        jLabel1.setPreferredSize(new java.awt.Dimension(780, 420));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Operador");
        setModal(true);
        getContentPane().setLayout(null);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(40, 100, 80, 30);

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBairro.setText("Bairro");
        getContentPane().add(jLabelBairro);
        jLabelBairro.setBounds(450, 277, 90, 30);

        jTextFieldRua.setToolTipText("Apenas letras.");
        jTextFieldRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRuaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldRua);
        jTextFieldRua.setBounds(540, 340, 200, 30);

        jTextFieldSobrenome.setToolTipText("Apenas letras.");
        jTextFieldSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSobrenome);
        jTextFieldSobrenome.setBounds(120, 160, 200, 30);

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_cached_black_18dp_1x.png"))); // NOI18N
        jButtonCadastrar.setText("Atualizar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(200, 400, 110, 27);

        jLabelSobrenome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSobrenome1.setText("Sobrenome");
        getContentPane().add(jLabelSobrenome1);
        jLabelSobrenome1.setBounds(40, 160, 80, 30);

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCidade.setText("Cidade");
        getContentPane().add(jLabelCidade);
        jLabelCidade.setBounds(450, 217, 90, 30);

        jLabelCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCpf.setText("Cpf");
        getContentPane().add(jLabelCpf);
        jLabelCpf.setBounds(40, 217, 80, 30);

        jLabelRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRua.setText("Rua");
        getContentPane().add(jLabelRua);
        jLabelRua.setBounds(450, 337, 90, 30);

        jTextFieldBairro.setToolTipText("Apenas letras.");
        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBairro);
        jTextFieldBairro.setBounds(540, 280, 200, 30);

        jTextFieldCidade.setToolTipText("Apenas letras.");
        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCidade);
        jTextFieldCidade.setBounds(540, 220, 200, 30);

        jTextFieldEstado.setToolTipText("Apenas letras.");
        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstado);
        jTextFieldEstado.setBounds(540, 160, 200, 30);

        jTextFieldComplemento.setToolTipText("Apenas letras.");
        jTextFieldComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldComplemento);
        jTextFieldComplemento.setBounds(540, 460, 200, 30);

        jTextFieldNome5.setToolTipText("Apenas letras.");
        jTextFieldNome5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNome5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome5);
        jTextFieldNome5.setBounds(120, 100, 200, 30);

        jTextFieldCpf.setToolTipText("apenas números");
        jTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCpf);
        jTextFieldCpf.setBounds(120, 220, 200, 30);

        jLabelComoplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelComoplemento.setText("Complemento");
        getContentPane().add(jLabelComoplemento);
        jLabelComoplemento.setBounds(450, 457, 90, 30);

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEstado.setText("Estado");
        getContentPane().add(jLabelEstado);
        jLabelEstado.setBounds(450, 157, 90, 30);

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumero.setText("Número");
        getContentPane().add(jLabelNumero);
        jLabelNumero.setBounds(450, 410, 90, 20);

        jLabelCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCep.setText("Cep");
        getContentPane().add(jLabelCep);
        jLabelCep.setBounds(450, 97, 90, 30);

        jTextFieldNumero.setToolTipText("Apenas números.");
        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumero);
        jTextFieldNumero.setBounds(540, 400, 200, 30);

        jTextFieldCep.setToolTipText("Apenas números.");
        jTextFieldCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCepActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCep);
        jTextFieldCep.setBounds(540, 100, 200, 30);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_close_black_18dp_1x.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(70, 400, 110, 27);

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/111.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 60, 740, 490);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Dados Pessoais");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 20, 180, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Endereço");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(550, 20, 110, 22);

        jLabelComImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        jLabelComImagem.setText("jLabel3");
        getContentPane().add(jLabelComImagem);
        jLabelComImagem.setBounds(0, 0, 1014, 606);

        setSize(new java.awt.Dimension(791, 613));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        try {
            String nome = jTextFieldNome5.getText();
            String sobrenome = jTextFieldSobrenome.getText();
            String rua = jTextFieldRua.getText();
            String bairro = jTextFieldBairro.getText();
            String cidade = jTextFieldCidade.getText();
            String estado = jTextFieldEstado.getText();
            String cep = jTextFieldCep.getText();
            String complemento = jTextFieldComplemento.getText();
            String numero = jTextFieldNumero.getText();
            String cpf = jTextFieldCpf.getText();

            Endereco endereco = new Endereco(rua, bairro, cidade, estado, cep, numero, complemento);
            String matricula = this.operador.getMatricula();
            OperadorDeCaixa novoOperador = new OperadorDeCaixa(nome, sobrenome, matricula, endereco, cpf, cep);
            controladorOperador.atualizar(novoOperador);

            JOptionPane.showMessageDialog(null, "Operador de caixa Atualizado!");

            this.dispose();

        } catch (ExcecaoEntidadeNaoExistente ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar tente novamente");
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRuaActionPerformed

    }//GEN-LAST:event_jTextFieldRuaActionPerformed

    private void jTextFieldSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeActionPerformed

    }//GEN-LAST:event_jTextFieldSobrenomeActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed
    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jTextFieldComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComplementoActionPerformed
    }//GEN-LAST:event_jTextFieldComplementoActionPerformed

    private void jTextFieldNome5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNome5ActionPerformed
    }//GEN-LAST:event_jTextFieldNome5ActionPerformed

    private void jTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfActionPerformed
    }//GEN-LAST:event_jTextFieldCpfActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jTextFieldCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCepActionPerformed
    }//GEN-LAST:event_jTextFieldCepActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComImagem;
    private javax.swing.JLabel jLabelComoplemento;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSobrenome1;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNome5;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration//GEN-END:variables
}
