
package Formularios;

import Classes.Dados;
import Classes.Utilidades;
import javax.swing.table.DefaultTableModel;

public class frmBuscaProduto extends javax.swing.JDialog {
    private Dados clsdados;
    private DefaultTableModel Usertable;
    private String resposta= "";

    public void setDados(Dados clsdados) {
        this.clsdados = clsdados;
    }
    
    
    public String getResposta(){
        return resposta;
    }
    public frmBuscaProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
     private void CarregarTable() {
        String titulocabecalho[] = {"ID Cliente", "Descricao"};
        String RegCadastro[] = new String[2];
        Usertable = new DefaultTableModel(null, titulocabecalho);
        if (txtBusca.getText().equals("")) {
            for (int i = 0; i < clsdados.Nprodutos(); i++) {
                RegCadastro[0] = clsdados.getProdutos()[i].getCodProduto();
                RegCadastro[1] = (clsdados.getProdutos()[i].getDescricao());
                Usertable.addRow(RegCadastro);
            }
            tblBprodutos.setModel(Usertable);
            return;
        }
        //BUSCA PELO NOME
        if(radioDrescricao.isSelected()){
            for (int i = 0; i < clsdados.Nprodutos(); i++) {
            if (clsdados.getClientes()[i].getNome().startsWith(txtBusca.getText())){
                    RegCadastro[0]= clsdados.getProdutos()[i].getCodProduto();
                    RegCadastro[1]= (clsdados.getProdutos()[i].getDescricao());
                    Usertable.addRow(RegCadastro);
                }
                
            }
            tblBprodutos.setModel(Usertable);
            return;
        }

        if(radioID.isSelected()){
            for (int i = 0; i < clsdados.Nprodutos(); i++) {
            if (clsdados.getClientes()[i].getCodigoCliente().startsWith(txtBusca.getText())){
                    RegCadastro[0]= clsdados.getClientes()[i].getCodigoCliente();
                    RegCadastro[1]= (clsdados.getClientes()[i].getNome());
                    RegCadastro[2]= clsdados.getClientes()[i].getSobrenome();
                    Usertable.addRow(RegCadastro);
                }
                
            }
            tblBprodutos.setModel(Usertable);
            return;
        }
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        radioID = new javax.swing.JRadioButton();
        radioDrescricao = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBprodutos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(32, 34, 37));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 61, 71), 7));
        jPanel1.setLayout(null);

        radioID.setBackground(new java.awt.Color(51, 61, 71));
        radioID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioID.setForeground(new java.awt.Color(255, 255, 255));
        radioID.setSelected(true);
        radioID.setText("ID Produto");
        radioID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIDActionPerformed(evt);
            }
        });
        jPanel1.add(radioID);
        radioID.setBounds(20, 60, 111, 23);

        radioDrescricao.setBackground(new java.awt.Color(51, 61, 71));
        radioDrescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioDrescricao.setForeground(new java.awt.Color(255, 255, 255));
        radioDrescricao.setText("Descricao");
        radioDrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDrescricaoActionPerformed(evt);
            }
        });
        jPanel1.add(radioDrescricao);
        radioDrescricao.setBounds(210, 60, 90, 23);

        tblBprodutos.setBackground(new java.awt.Color(51, 61, 71));
        tblBprodutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblBprodutos.setForeground(new java.awt.Color(255, 255, 255));
        tblBprodutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBprodutos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 450, 330);

        btnBuscar.setBackground(new java.awt.Color(51, 61, 71));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/024-loupe.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(20, 90, 40, 30);

        txtBusca.setBackground(new java.awt.Color(51, 61, 71));
        txtBusca.setForeground(new java.awt.Color(255, 255, 255));
        txtBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        jPanel1.add(txtBusca);
        txtBusca.setBounds(60, 90, 410, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int num = tblBprodutos.getRowCount();
        if (num == 0) {
            resposta="";
            dispose();
            return;
        }
        for (int i = 0; i < num; i++) {
            if(tblBprodutos.isRowSelected(i))
            resposta = Utilidades.objectToString(tblBprodutos.getValueAt(i, 0));
            dispose();
            return;
        }
        resposta = Utilidades.objectToString(tblBprodutos.getValueAt(0, 0));
        dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void radioIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioIDActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        CarregarTable();
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void radioDrescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDrescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDrescricaoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CarregarTable();
        txtBusca.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmBuscaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBuscaProduto dialog = new frmBuscaProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioDrescricao;
    private javax.swing.JRadioButton radioID;
    private javax.swing.JTable tblBprodutos;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
