package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorOperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.OperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaOperador extends javax.swing.JDialog {

    IControladorOperadorDeCaixa controladorOperador = FabricaControlador.getControladorOperadorDeCaixa();

    public ListaOperador() {
        initComponents();
        try {
            listarOperado();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarOperador = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar operador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setFocusableWindowState(false);
        setModal(true);
        setName("dialogListarOperador"); // NOI18N
        setSize(new java.awt.Dimension(0, 0));
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
        jScrollPane1.setBounds(10, 10, 850, 440);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 880, 510);

        setSize(new java.awt.Dimension(886, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarOperador;
    // End of variables declaration//GEN-END:variables
private void listarOperado() throws Exception {

        try {
            ArrayList<OperadorDeCaixa> listOperador = controladorOperador.listar();

            for (int i = 0; i < listOperador.size(); i++) {

                DefaultTableModel listarOperador = (DefaultTableModel) jTableListarOperador.getModel();

                listarOperador.addRow(new String[]{listOperador.get(i).getNome(), listOperador.get(i).getSobrenome(),
                    listOperador.get(i).getMatricula(), listOperador.get(i).getCpf(), listOperador.get(i).endereco.getCep(),
                    listOperador.get(i).endereco.getEstado(), listOperador.get(i).endereco.getCidade(), listOperador.get(i).endereco.getBairro(),
                    listOperador.get(i).endereco.getRua(), listOperador.get(i).endereco.getNumero()});

            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum Operador foi cadrastrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }

}
