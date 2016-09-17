package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorOperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Endereco;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.OperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoRegistroExistente;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.ValidarLetras;
import br.com.novaroma.gerenciamentoDeCaixa.controlador.ValidarNumeros;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroOperado extends javax.swing.JDialog {

    public CadastroOperado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldNome = new ValidarLetras();
        jTextFieldSobrenome = new ValidarLetras();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMatricula = new ValidarNumeros();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelSobrenome = new javax.swing.JLabel();
        jTextFieldCidade = new ValidarLetras();
        jTextFieldRua = new ValidarLetras();
        jLabelRua = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new ValidarLetras();
        jTextFieldCep = new ValidarNumeros();
        jTextFieldComplemento = new ValidarLetras();
        jTextFieldCpf = new ValidarNumeros(11);
        jTextFieldNumero = new ValidarNumeros();
        jTextFieldBairro = new ValidarLetras();
        jLabelCep = new javax.swing.JLabel();
        jLabelComplemento = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelComImagem = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(780, 780));
        jLabel1.setMinimumSize(new java.awt.Dimension(420, 420));
        jLabel1.setPreferredSize(new java.awt.Dimension(780, 420));

        jLabel16.setText("jLabel16");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Operador");
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(40, 100, 80, 30);

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCidade.setText("Cidade");
        getContentPane().add(jLabelCidade);
        jLabelCidade.setBounds(450, 220, 90, 30);

        jTextFieldNome.setToolTipText("Apenas letras.");
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(120, 100, 200, 30);

        jTextFieldSobrenome.setToolTipText("Apenas letras.");
        jTextFieldSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSobrenome);
        jTextFieldSobrenome.setBounds(120, 160, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Matrícula");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 277, 80, 30);

        jTextFieldMatricula.setToolTipText("Apenas números.");
        jTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMatricula);
        jTextFieldMatricula.setBounds(120, 280, 200, 30);

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_person_add_black_16dp_1x.png"))); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(200, 430, 110, 25);

        jLabelSobrenome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSobrenome.setText("Sobrenome");
        getContentPane().add(jLabelSobrenome);
        jLabelSobrenome.setBounds(40, 157, 80, 30);

        jTextFieldCidade.setToolTipText("Apenas letras.");
        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCidade);
        jTextFieldCidade.setBounds(540, 220, 200, 30);

        jTextFieldRua.setToolTipText("Apenas letras.");
        jTextFieldRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRuaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldRua);
        jTextFieldRua.setBounds(540, 340, 200, 30);

        jLabelRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRua.setText("Rua");
        getContentPane().add(jLabelRua);
        jLabelRua.setBounds(450, 340, 90, 30);

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEstado.setText("Estado");
        getContentPane().add(jLabelEstado);
        jLabelEstado.setBounds(450, 160, 90, 30);

        jTextFieldEstado.setToolTipText("Apenas letras.");
        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstado);
        jTextFieldEstado.setBounds(540, 160, 200, 30);

        jTextFieldCep.setToolTipText("Apenas números.");
        jTextFieldCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCepActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCep);
        jTextFieldCep.setBounds(540, 100, 200, 30);

        jTextFieldComplemento.setToolTipText("Apenas letras.");
        jTextFieldComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldComplemento);
        jTextFieldComplemento.setBounds(540, 460, 200, 30);

        jTextFieldCpf.setToolTipText("Apenas números.");
        jTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCpf);
        jTextFieldCpf.setBounds(120, 220, 200, 30);

        jTextFieldNumero.setToolTipText("Apenas números.");
        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumero);
        jTextFieldNumero.setBounds(540, 400, 200, 30);

        jTextFieldBairro.setToolTipText("Apenas letras.");
        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBairro);
        jTextFieldBairro.setBounds(540, 280, 200, 30);

        jLabelCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCep.setText("Cep");
        getContentPane().add(jLabelCep);
        jLabelCep.setBounds(450, 97, 90, 30);

        jLabelComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelComplemento.setText("Complemento");
        getContentPane().add(jLabelComplemento);
        jLabelComplemento.setBounds(450, 457, 90, 30);

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumero.setText("Número");
        getContentPane().add(jLabelNumero);
        jLabelNumero.setBounds(450, 400, 90, 30);

        jLabelCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCpf.setText("Cpf");
        getContentPane().add(jLabelCpf);
        jLabelCpf.setBounds(40, 217, 80, 30);

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBairro.setText("Bairro");
        getContentPane().add(jLabelBairro);
        jLabelBairro.setBounds(450, 277, 90, 30);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/ic_close_black_18dp_1x.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(60, 430, 110, 27);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Senha");
        jLabel17.setToolTipText("");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(40, 337, 80, 30);

        jPasswordFieldSenha.setToolTipText("Digite sua senha.");
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(120, 340, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Dados Pessoais");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 20, 180, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Endereço");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(550, 20, 110, 22);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("<html><font color=\"red\">Todos Os Campos Sao Obrigatórios!</font>  ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(80, 520, 240, 17);

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/111.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 60, 740, 490);

        jLabelComImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        getContentPane().add(jLabelComImagem);
        jLabelComImagem.setBounds(-40, -20, 830, 606);

        setSize(new java.awt.Dimension(794, 613));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if (isInvalid(jTextFieldNome) || isInvalid(jTextFieldSobrenome) || isInvalid(jTextFieldMatricula)
                || isInvalid(jTextFieldCpf) || isInvalid(jTextFieldNumero) || isInvalid(jTextFieldComplemento) || isInvalid(jTextFieldCep)
                || isInvalid(jTextFieldEstado) || isInvalid(jTextFieldCidade) || isInvalid(jTextFieldBairro) || isInvalid(jTextFieldRua)|| isInvalid(jPasswordFieldSenha)) {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos devem ser preenchidos!", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else {
            cadastrarEntidade();
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeActionPerformed

    }//GEN-LAST:event_jTextFieldSobrenomeActionPerformed

    private void jTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaActionPerformed

    }//GEN-LAST:event_jTextFieldMatriculaActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRuaActionPerformed
    }//GEN-LAST:event_jTextFieldRuaActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed
    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jTextFieldCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCepActionPerformed
    }//GEN-LAST:event_jTextFieldCepActionPerformed

    private void jTextFieldComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComplementoActionPerformed
    }//GEN-LAST:event_jTextFieldComplementoActionPerformed

    private void jTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfActionPerformed
    }//GEN-LAST:event_jTextFieldCpfActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComImagem;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration//GEN-END:variables

    private boolean isInvalid(JTextField campo) {
        return campo.getText().isEmpty();
    }

    private void cadastrarEntidade() {

        IControladorOperadorDeCaixa controladorOperador = FabricaControlador.getControladorOperadorDeCaixa();
        try {
            String nome = jTextFieldNome.getText();
            String sobrenome = jTextFieldSobrenome.getText();
            String matricula = jTextFieldMatricula.getText();
            String rua = jTextFieldRua.getText();
            String bairro = jTextFieldBairro.getText();
            String cidade = jTextFieldCidade.getText();
            String estado = jTextFieldEstado.getText();
            String cep = jTextFieldCep.getText();
            String complemento = jTextFieldComplemento.getText();
            String numero = jTextFieldNumero.getText();
            String cpf = jTextFieldCpf.getText();
            String senha = jPasswordFieldSenha.getText();

            Endereco endereco = new Endereco(rua, bairro, cidade, estado, cep, numero, complemento);

            OperadorDeCaixa operador = new OperadorDeCaixa(nome, sobrenome, matricula, endereco, cpf, senha);

            controladorOperador.cadastrar(operador);

            LimparCampos();

            JOptionPane.showMessageDialog(rootPane, "Operador cadastrado com sucesso!", "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
        } catch (ExcecaoRegistroExistente | ExcecaoNegocio ex) {
            JOptionPane.showMessageDialog(null, "Operador já Cadastrado!");
        }
    }

    void LimparCampos() {
        jTextFieldNome.setText("");
        jTextFieldSobrenome.setText("");
        jTextFieldMatricula.setText("");
        jTextFieldRua.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jTextFieldCep.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldNumero.setText("");
        jTextFieldCpf.setText("");
        jPasswordFieldSenha.setText("");
    }

}
