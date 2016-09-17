package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorGerente;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Gerente;
import br.com.novaroma.gerenciamentoDeCaixa.excecoes.ExcecaoNegocio;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListarGerente extends javax.swing.JFrame {

    IControladorGerente controladorGerente = FabricaControlador.getControladorGerente();

    public ListarGerente() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarOperador = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar gerente");
        setName("frameListarGenrente"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jTableListarOperador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "Matricula", "CPF", "Cep", "Estado", "Cidade", "Bairro", "Rua", "Número"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListarOperador);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 13, 850, 453);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/111.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 890, 520);

        setSize(new java.awt.Dimension(892, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarOperador;
    // End of variables declaration//GEN-END:variables

    private void listarGerente() throws ExcecaoNegocio, Exception {

        try {
            ArrayList<Gerente> listGerente = controladorGerente.listar();

            for (int i = 0; i < listGerente.size(); i++) {

                DefaultTableModel listarGerente = (DefaultTableModel) jTableListarOperador.getModel();

                listarGerente.addRow(new String[]{listGerente.get(i).getNome(), listGerente.get(i).getSobrenome(),
                    listGerente.get(i).getMatricula(), listGerente.get(i).getCpf(), listGerente.get(i).endereco.getCep(), listGerente.get(i).endereco.getEstado(), listGerente.get(i).endereco.getCidade(), listGerente.get(i).endereco.getBairro(),
                    listGerente.get(i).endereco.getRua(), listGerente.get(i).endereco.getNumero()});

            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum Gerente foi cadrastrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }

}
