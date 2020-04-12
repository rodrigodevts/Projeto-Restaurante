/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Capitao
 */
public class FormConsultaCliente extends javax.swing.JDialog {

    /**
     * Creates new form FrmConsultaCliente
     */
    public FormConsultaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preenche("select IdClientes,nome,cpf,telefone from clientes order by nome");
    }
    public clientes clientes = new clientes();
    private FormClientes frmCli;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultaCliente = new javax.swing.JTable();
        txtConsultaCliente = new javax.swing.JTextField();
        btConsultaCliente = new javax.swing.JButton();
        btConsultaTodos = new javax.swing.JButton();
        btSelecionarCliente = new javax.swing.JButton();
        btSairConsulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbConsultaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbConsultaCliente.setColumnSelectionAllowed(true);
        tbConsultaCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbConsultaCliente);
        tbConsultaCliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        txtConsultaCliente.setText("Digite o nome ou CPF do Cliente");
        txtConsultaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultaClienteMouseClicked(evt);
            }
        });
        txtConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaClienteActionPerformed(evt);
            }
        });

        btConsultaCliente.setText("Buscar");
        btConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaClienteActionPerformed(evt);
            }
        });

        btConsultaTodos.setText("Buscar Todos");
        btConsultaTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaTodosActionPerformed(evt);
            }
        });

        btSelecionarCliente.setText("Selecionar");
        btSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarClienteActionPerformed(evt);
            }
        });

        btSairConsulta.setText("Sair");
        btSairConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairConsultaActionPerformed(evt);
            }
        });

        jLabel1.setText("Consulta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSelecionarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSairConsulta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultaTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultaCliente)
                    .addComponent(btConsultaTodos)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSelecionarCliente)
                    .addComponent(btSairConsulta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConsultaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultaClienteMouseClicked
        if(txtConsultaCliente.getText().equals("Digite o nome ou CPF do Cliente")){
            txtConsultaCliente.setText("");
        }
    }//GEN-LAST:event_txtConsultaClienteMouseClicked

    private void txtConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaClienteActionPerformed

    private void btConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaClienteActionPerformed
        clientes.setNome(txtConsultaCliente.getText());
        clientes.setCpf(txtConsultaCliente.getText());
        
        if(clientes.buscaClienteTabela(clientes)){
            String sql = "select IdClientes,nome,cpf,telefone from clientes where nome like '%"
                    + clientes.getNome()+ "%' or cpf like '%"+ clientes.getCpf()+"%'";
            preenche(sql);
        }else{
            System.out.print("Erro na consulta");
        }
    }//GEN-LAST:event_btConsultaClienteActionPerformed

    private void btConsultaTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaTodosActionPerformed
        preenche("select IdClientes,nome,cpf,telefone from clientes order by nome");
    }//GEN-LAST:event_btConsultaTodosActionPerformed

    private void btSairConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairConsultaActionPerformed
       this.dispose();
    }//GEN-LAST:event_btSairConsultaActionPerformed

    private void btSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarClienteActionPerformed
        int id = (int) tbConsultaCliente.getModel().getValueAt(tbConsultaCliente.getSelectedRow(),0);
        clientes.setIdCliente(id);
        this.setVisible(false);
    }//GEN-LAST:event_btSelecionarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void preenche(String sql){
        String aux2 = sql;
        
        while (tbConsultaCliente.getRowCount() > 0) {
            ((DefaultTableModel) tbConsultaCliente.getModel()).removeRow(0);
        }
        ((DefaultTableModel) tbConsultaCliente.getModel()).setColumnCount(0);

        tbConsultaCliente.setModel(clientes.preencheTabelaPesquisa(aux2));
        
        tbConsultaCliente.getTableHeader().setReorderingAllowed(false);
                
        tbConsultaCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i <= 3; i++) {
            tbConsultaCliente.getColumnModel().getColumn(i).setPreferredWidth(127);
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormConsultaCliente dialog = new FormConsultaCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultaCliente;
    private javax.swing.JButton btConsultaTodos;
    private javax.swing.JButton btSairConsulta;
    private javax.swing.JButton btSelecionarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbConsultaCliente;
    private javax.swing.JTextField txtConsultaCliente;
    // End of variables declaration//GEN-END:variables
}