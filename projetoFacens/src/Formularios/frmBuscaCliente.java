package Formularios;

import Classes.Dados;
import Classes.Utilidades;
import javax.swing.table.DefaultTableModel;

public class frmBuscaCliente extends javax.swing.JDialog {

    private Dados clsdados;
    private DefaultTableModel Usertable;
    private String resposta= "";

    public void setDados(Dados clsdados) {
        this.clsdados = clsdados;
    }
    
    
    public String getResposta(){
        return resposta;
    }

    private void CarregarTable() {
        String titulocabecalho[] = {"ID Cliente", "Nome", "Sobrenome"};
        String RegCadastro[] = new String[3];
        Usertable = new DefaultTableModel(null, titulocabecalho);
        if (txtBusca.getText().equals("")) {
            for (int i = 0; i < clsdados.Nclientes(); i++) {
                RegCadastro[0] = clsdados.getClientes()[i].getCodigoCliente();
                RegCadastro[1] = (clsdados.getClientes()[i].getNome());
                RegCadastro[2] = clsdados.getClientes()[i].getSobrenome();
                Usertable.addRow(RegCadastro);
            }
            tblBcliente.setModel(Usertable);
            return;
        }
        //BUSCA PELO NOME
        if(radioNome.isSelected()){
            for (int i = 0; i < clsdados.Nclientes(); i++) {
            if (clsdados.getClientes()[i].getNome().startsWith(txtBusca.getText())){
                    RegCadastro[0]= clsdados.getClientes()[i].getCodigoCliente();
                    RegCadastro[1]= (clsdados.getClientes()[i].getNome());
                    RegCadastro[2]= clsdados.getClientes()[i].getSobrenome();
                    Usertable.addRow(RegCadastro);
                }
                
            }
            tblBcliente.setModel(Usertable);
            return;
        }
        //BISCA PELO SOBRENOME
        if(radioSnome.isSelected()){
            for (int i = 0; i < clsdados.Nclientes(); i++) {
            if (clsdados.getClientes()[i].getSobrenome().startsWith(txtBusca.getText())){
                    RegCadastro[0]= clsdados.getClientes()[i].getCodigoCliente();
                    RegCadastro[1]= (clsdados.getClientes()[i].getNome());
                    RegCadastro[2]= clsdados.getClientes()[i].getSobrenome();
                    Usertable.addRow(RegCadastro);
                }
                
            }
            tblBcliente.setModel(Usertable);
            return;
        }
        
        if(radioID.isSelected()){
            for (int i = 0; i < clsdados.Nclientes(); i++) {
            if (clsdados.getClientes()[i].getCodigoCliente().startsWith(txtBusca.getText())){
                    RegCadastro[0]= clsdados.getClientes()[i].getCodigoCliente();
                    RegCadastro[1]= (clsdados.getClientes()[i].getNome());
                    RegCadastro[2]= clsdados.getClientes()[i].getSobrenome();
                    Usertable.addRow(RegCadastro);
                }
                
            }
            tblBcliente.setModel(Usertable);
            return;
        }
        
    }
       
    

    public frmBuscaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bgpesqui.add(radioID);
        bgpesqui.add(radioNome);
        bgpesqui.add(radioSnome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpesqui = new javax.swing.ButtonGroup();
        radioID = new javax.swing.JRadioButton();
        radioNome = new javax.swing.JRadioButton();
        radioSnome = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBcliente = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        radioID.setSelected(true);
        radioID.setText("IDCliente");
        radioID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIDActionPerformed(evt);
            }
        });

        radioNome.setText("Nome Cliente");

        radioSnome.setText("S_Nome Cliente");

        tblBcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBcliente);

        btnBuscar.setText("Busca");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(radioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioSnome))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                            .addComponent(txtBusca))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioID)
                    .addComponent(radioNome)
                    .addComponent(radioSnome))
                .addGap(29, 29, 29)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioIDActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CarregarTable();
        txtBusca.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        CarregarTable();
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int num = tblBcliente.getRowCount();
        if (num == 0) {
            resposta="";
            dispose();
            return;
        }
        for (int i = 0; i < num; i++) {
          if(tblBcliente.isRowSelected(i))
          resposta = Utilidades.objectToString(tblBcliente.getValueAt(i, 0));
          dispose();
          return;
        }
        resposta = Utilidades.objectToString(tblBcliente.getValueAt(0, 0));
          dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        resposta="";
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmBuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBuscaCliente dialog = new frmBuscaCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup bgpesqui;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioID;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JRadioButton radioSnome;
    private javax.swing.JTable tblBcliente;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
