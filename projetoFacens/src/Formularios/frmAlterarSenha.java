
package Formularios;

import Classes.Dados;
import javax.swing.JOptionPane;


public class frmAlterarSenha extends javax.swing.JDialog {

    private String senha;
    private String usuario;
    private Dados clsdados;
    
    
public void setDados(Dados clsdados){
    this.clsdados = clsdados;
}
    
public void setupUsuario(String usuario){
    this.usuario = usuario;
}
    
    public void setupSenha(String senha){
    this.senha = senha;
}
    public frmAlterarSenha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtConfSenha = new javax.swing.JPasswordField();
        txtSenhaAtual = new javax.swing.JPasswordField();
        txtNovaSenha = new javax.swing.JPasswordField();
        cmdCancelar = new javax.swing.JButton();
        cmdAlterar = new javax.swing.JButton();
        txtConfSenha1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Senha:");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(32, 34, 37));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 61, 71), 7));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha Nova:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 100, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha Atual:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 100, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirmar Senha:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 110, 110, 14);

        txtConfSenha.setBackground(new java.awt.Color(51, 61, 71));
        txtConfSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtConfSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(txtConfSenha);
        txtConfSenha.setBounds(110, 100, 320, 30);

        txtSenhaAtual.setBackground(new java.awt.Color(51, 61, 71));
        txtSenhaAtual.setForeground(new java.awt.Color(255, 255, 255));
        txtSenhaAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSenhaAtual);
        txtSenhaAtual.setBounds(110, 40, 320, 30);

        txtNovaSenha.setBackground(new java.awt.Color(51, 61, 71));
        txtNovaSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtNovaSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNovaSenha);
        txtNovaSenha.setBounds(110, 70, 320, 30);

        cmdCancelar.setBackground(new java.awt.Color(51, 61, 71));
        cmdCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdCancelar.setForeground(new java.awt.Color(255, 255, 255));
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCancelar);
        cmdCancelar.setBounds(200, 140, 90, 30);

        cmdAlterar.setBackground(new java.awt.Color(51, 61, 71));
        cmdAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdAlterar.setForeground(new java.awt.Color(255, 255, 255));
        cmdAlterar.setText("Alterar");
        cmdAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAlterar);
        cmdAlterar.setBounds(110, 140, 77, 30);

        txtConfSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfSenha1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtConfSenha1);
        txtConfSenha1.setBounds(110, 90, 195, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfSenhaActionPerformed

    private void cmdAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAlterarActionPerformed
       String Satual = new String (txtSenhaAtual.getPassword());
       String Snova = new String (txtNovaSenha.getPassword());
       String Sconf = new String (txtConfSenha.getPassword());
       
       
       if(Satual.equals("")){
           JOptionPane.showMessageDialog(rootPane,"FAVOR DIGITAR SUA SENHA ATUAL ALTERAÇÃO");
           txtSenhaAtual.requestFocusInWindow();
           return;
       }
       if(Snova.equals("")){
           JOptionPane.showMessageDialog(rootPane,"FAVOR DIGITAR SUA NOVA SENHA ALTERAÇÃO");
           txtNovaSenha.requestFocusInWindow();
           return;
       }
       
       if(Sconf.equals("")){
           JOptionPane.showMessageDialog(rootPane,"FAVOR CONFIRMAR SENHA");
           txtConfSenha.requestFocusInWindow();
           return;
       }
       
       if(!Satual.equals(senha)){
           JOptionPane.showMessageDialog(rootPane,"VOCÊ DIGITOU UMA SENHA DIFERENTE DA ATUAL");
           txtSenhaAtual.setText("");
           txtSenhaAtual.requestFocusInWindow();
           return;
       }
       
       if(!Snova.equals(Sconf)){
           JOptionPane.showMessageDialog(rootPane,"SENHAs NÃO CORRESPODEM");
           txtNovaSenha.setText("");
           txtConfSenha.setText("");
           txtNovaSenha.requestFocusInWindow();
           return;
       }
       
       clsdados.Altersenha(usuario, Snova);
        JOptionPane.showMessageDialog(rootPane,"SENHA ALTERADA COM SUCESSO");
        this.dispose();
       
    }//GEN-LAST:event_cmdAlterarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtConfSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfSenha1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmAlterarSenha dialog = new frmAlterarSenha(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmdAlterar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JPasswordField txtConfSenha1;
    private javax.swing.JPasswordField txtNovaSenha;
    private javax.swing.JPasswordField txtSenhaAtual;
    // End of variables declaration//GEN-END:variables
}
