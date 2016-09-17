package br.com.novaroma.gerenciamentoDeCaixa.apresentacao;

import br.com.novaroma.gerenciamentoDeCaixa.controlador.IControladorOperadorDeCaixa;
import br.com.novaroma.gerenciamentoDeCaixa.entidades.Caixa;
import br.com.novaroma.gerenciamentoDeCaixa.fabrica.FabricaControlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaCaixas extends javax.swing.JDialog {

    IControladorOperadorDeCaixa controladorOperador = FabricaControlador.getControladorOperadorDeCaixa();

    public ListaCaixas(java.awt.Frame parent, boolean modal) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarCaixa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar caixas");
        setModal(true);
        setName("dialogListarCaixas"); // NOI18N
        getContentPane().setLayout(null);

        jTableListarCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Caixa", "Nome", "Sobrenome", "Matrícula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListarCaixa);
        if (jTableListarCaixa.getColumnModel().getColumnCount() > 0) {
            jTableListarCaixa.getColumnModel().getColumn(0).setResizable(false);
            jTableListarCaixa.getColumnModel().getColumn(1).setResizable(false);
            jTableListarCaixa.getColumnModel().getColumn(2).setResizable(false);
            jTableListarCaixa.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(25, 13, 780, 451);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/gerenciamentoDeCaixa/imagens/Principal.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 0, 880, 510);

        setSize(new java.awt.Dimension(835, 525));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listarCaixa() throws Exception {

        try {
            ArrayList<Caixa> listCaixa = controladorOperador.listarCaixa();

            for (int i = 0; i < listCaixa.size(); i++) {

                DefaultTableModel listarCaixa = (DefaultTableModel) jTableListarCaixa.getModel();

                listarCaixa.addRow(new String[]{listCaixa.get(i).getNumero(), listCaixa.get(i).getNome(), listCaixa.get(i).getSobreNome(), listCaixa.get(i).getMatricula()});

            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum Caixa foi cadrastrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarCaixa;
    // End of variables declaration//GEN-END:variables
}
