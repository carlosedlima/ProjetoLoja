/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Dados;

/**
 *
 * @author Carlos
 */
public class frmUsuario extends javax.swing.JInternalFrame {

private Dados clsdados;
private int usuarioatual=0;
private boolean cmdnovo = false;

public void setDados(Dados clsdados){
    this.clsdados = clsdados;
}

    public frmUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSnome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtCsenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        cmdPesquisar = new javax.swing.JButton();
        cmdAnterior = new javax.swing.JButton();
        cmdProximo = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();
        cmdPrimeiro = new javax.swing.JButton();
        cmdAdicionar = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        cmdNovo = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Usuarios :");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Cod Usuario");

        jLabel2.setText("Nome");

        jLabel3.setText("S Nome");

        jLabel4.setText("Senha");

        jLabel5.setText("Conf Senha");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jLabel6.setText("Perfil:");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Perfil", "Administrador", "Funcionario" }));
        cmbPerfil.setEnabled(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        cmdPesquisar.setText("Procurar");
        cmdPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPesquisarActionPerformed(evt);
            }
        });

        cmdAnterior.setText("Anterior");
        cmdAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnteriorActionPerformed(evt);
            }
        });

        cmdProximo.setText("Proximo");

        cmdUltimo.setText("Ultimo");

        cmdPrimeiro.setText("Primeiro");
        cmdPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrimeiroActionPerformed(evt);
            }
        });

        cmdAdicionar.setText("Adicionar");
        cmdAdicionar.setEnabled(false);
        cmdAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAdicionarActionPerformed(evt);
            }
        });

        cmdEditar.setText("Editar");
        cmdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditarActionPerformed(evt);
            }
        });

        cmdNovo.setText("Novo");
        cmdNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNovoActionPerformed(evt);
            }
        });

        cmdCancelar.setText("Cancelar");
        cmdCancelar.setEnabled(false);
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSnome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(cmdPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdProximo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmdUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdPesquisar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdAdicionar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdPesquisar)
                    .addComponent(cmdEditar)
                    .addComponent(cmdNovo)
                    .addComponent(cmdCancelar)
                    .addComponent(cmdAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAnterior)
                    .addComponent(cmdPrimeiro)
                    .addComponent(cmdProximo)
                    .addComponent(cmdUltimo))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void cmdPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdPesquisarActionPerformed

    private void cmdAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAnteriorActionPerformed

    private void cmdPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrimeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdPrimeiroActionPerformed

    private void cmdAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdicionarActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO SALVAR DO FORMULARÍO CADASTRO USUARIOS
        
        //Botões exibição
        cmdPrimeiro.setEnabled(true);
        cmdUltimo.setEnabled(true);
        cmdProximo.setEnabled(true);
        cmdAnterior.setEnabled(true);
        cmdCancelar.setEnabled(false);
        cmdPesquisar.setEnabled(true);
        cmdAdicionar.setEnabled(false);
        cmdEditar.setEnabled(true);
        
        
        //Campos exibição
        txtCodigoUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSnome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtCsenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
    }//GEN-LAST:event_cmdAdicionarActionPerformed

    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditarActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO EDITAR DO FORMULARÍO CADASTRO USUARIOS
        
        //Botões exibição
        cmdPrimeiro.setEnabled(false);
        cmdUltimo.setEnabled(false);
        cmdProximo.setEnabled(false);
        cmdAnterior.setEnabled(false);
        cmdCancelar.setEnabled(true);//TRUE
        cmdPesquisar.setEnabled(false);
        cmdAdicionar.setEnabled(true);//TRUE
        cmdEditar.setEnabled(false);
        
        //Campos exibição
        txtNome.setEnabled(true);
        txtSnome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtCsenha.setEnabled(true);
        cmbPerfil.setEnabled(true);
        
    }//GEN-LAST:event_cmdEditarActionPerformed

    private void cmdNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNovoActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO NOVO DO FORMULARÍO CADASTRO USUARIOS
        
        //Botões exibição
        cmdPrimeiro.setEnabled(false);
        cmdUltimo.setEnabled(false);
        cmdProximo.setEnabled(false);
        cmdAnterior.setEnabled(false);
        cmdCancelar.setEnabled(true);//TRUE
        cmdPesquisar.setEnabled(false);
        cmdAdicionar.setEnabled(true);//TRUE
        cmdEditar.setEnabled(false);
        cmdNovo.setEnabled(false);
        
        //Campos exibição
        txtCodigoUsuario.setEnabled(true);
        txtNome.setEnabled(true);
        txtSnome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtCsenha.setEnabled(true);
        cmbPerfil.setEnabled(true);
        
        //Campos Limpos
        txtCodigoUsuario.setText("");
        txtNome.setText("");
        txtSnome.setText("");
        txtSenha.setText("");
        txtCsenha.setText("");
        cmbPerfil.setSelectedIndex(0);
        
        cmdnovo = true;
        
        txtCodigoUsuario.requestFocusInWindow();
    }//GEN-LAST:event_cmdNovoActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO CANCELAR DO FORMULARÍO CADASTRO USUARIOS
        
        //botões exibição
        cmdPrimeiro.setEnabled(true);
        cmdUltimo.setEnabled(true);
        cmdProximo.setEnabled(true);
        cmdAnterior.setEnabled(true);
        cmdCancelar.setEnabled(false);
        cmdPesquisar.setEnabled(true);
        cmdAdicionar.setEnabled(false);
        cmdEditar.setEnabled(true);
        
        
        //Campos exibição
        txtCodigoUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSnome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtCsenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtCodigoUsuario.setText(clsdados.getUsuarios()[usuarioatual].getCodusuario());
        txtNome.setText(clsdados.getUsuarios()[usuarioatual].getNome());
        txtSnome.setText(clsdados.getUsuarios()[usuarioatual].getSnome());
        txtSenha.setText(clsdados.getUsuarios()[usuarioatual].getSenha());
        txtCsenha.setText(clsdados.getUsuarios()[usuarioatual].getSenha());
        cmbPerfil.setSelectedItem(clsdados.getUsuarios()[usuarioatual].getPerfil());
        
        
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JButton cmdAdicionar;
    private javax.swing.JButton cmdAnterior;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEditar;
    private javax.swing.JButton cmdNovo;
    private javax.swing.JButton cmdPesquisar;
    private javax.swing.JButton cmdPrimeiro;
    private javax.swing.JButton cmdProximo;
    private javax.swing.JButton cmdUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JPasswordField txtCsenha;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSnome;
    // End of variables declaration//GEN-END:variables
}