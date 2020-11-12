
package Formularios;


import Classes.Dados;
import Classes.Usuarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmUsuario extends javax.swing.JFrame {

private Dados clsdados;
private int usuarioatual=0;
private boolean cmdnovo = false;
private DefaultTableModel Usertable;
    
public void setDados(Dados clsdados){
    this.clsdados = clsdados;
}
    
    public frmUsuario() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmdPrimeiro = new javax.swing.JButton();
        cmdPesquisar = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        cmdAnterior = new javax.swing.JButton();
        cmdProximo = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();
        cmdDeletar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdAdicionar = new javax.swing.JButton();
        cmdNovo = new javax.swing.JButton();
        txtCsenha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();
        txtSnome = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCodigoUsuario = new javax.swing.JTextField();
        cmbPerfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastros Usuarios");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(32, 34, 37));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 61, 71), 7));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(602, 1194));
        jPanel1.setPreferredSize(new java.awt.Dimension(602, 1194));
        jPanel1.setLayout(null);

        cmdPrimeiro.setBackground(new java.awt.Color(51, 61, 71));
        cmdPrimeiro.setText("Primeiro");
        cmdPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrimeiroActionPerformed(evt);
            }
        });
        jPanel1.add(cmdPrimeiro);
        cmdPrimeiro.setBounds(20, 500, 83, 32);

        cmdPesquisar.setBackground(new java.awt.Color(51, 61, 71));
        cmdPesquisar.setText("Procurar");
        cmdPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdPesquisar);
        cmdPesquisar.setBounds(470, 500, 80, 32);

        cmdEditar.setBackground(new java.awt.Color(51, 61, 71));
        cmdEditar.setForeground(new java.awt.Color(255, 255, 255));
        cmdEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/092-edit copy.png"))); // NOI18N
        cmdEditar.setToolTipText("Editar");
        cmdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdEditar);
        cmdEditar.setBounds(510, 60, 40, 46);

        cmdAnterior.setBackground(new java.awt.Color(51, 61, 71));
        cmdAnterior.setText("Anterior");
        cmdAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAnterior);
        cmdAnterior.setBounds(120, 500, 80, 32);

        cmdProximo.setBackground(new java.awt.Color(51, 61, 71));
        cmdProximo.setText("Proximo");
        cmdProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProximoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdProximo);
        cmdProximo.setBounds(200, 500, 76, 32);

        cmdUltimo.setBackground(new java.awt.Color(51, 61, 71));
        cmdUltimo.setText("Ultimo");
        cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdUltimo);
        cmdUltimo.setBounds(280, 500, 74, 32);

        cmdDeletar.setBackground(new java.awt.Color(51, 61, 71));
        cmdDeletar.setForeground(new java.awt.Color(255, 255, 255));
        cmdDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/098-delete-2 copy.png"))); // NOI18N
        cmdDeletar.setToolTipText("Deletar");
        cmdDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdDeletar);
        cmdDeletar.setBounds(510, 100, 40, 40);

        cmdCancelar.setBackground(new java.awt.Color(51, 61, 71));
        cmdCancelar.setForeground(new java.awt.Color(255, 255, 255));
        cmdCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/127-ban copy.png"))); // NOI18N
        cmdCancelar.setToolTipText("Cancelar");
        cmdCancelar.setEnabled(false);
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCancelar);
        cmdCancelar.setBounds(510, 160, 40, 40);

        cmdAdicionar.setBackground(new java.awt.Color(51, 61, 71));
        cmdAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        cmdAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/027-diskette copy.png"))); // NOI18N
        cmdAdicionar.setToolTipText("Salvar");
        cmdAdicionar.setEnabled(false);
        cmdAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAdicionar);
        cmdAdicionar.setBounds(470, 160, 40, 40);

        cmdNovo.setBackground(new java.awt.Color(51, 61, 71));
        cmdNovo.setForeground(new java.awt.Color(255, 255, 255));
        cmdNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/074-layers copy.png"))); // NOI18N
        cmdNovo.setToolTipText("Novo");
        cmdNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNovoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdNovo);
        cmdNovo.setBounds(510, 20, 40, 46);

        txtCsenha.setEnabled(false);
        jPanel1.add(txtCsenha);
        txtCsenha.setBounds(20, 190, 220, 22);

        txtSenha.setEnabled(false);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenha);
        txtSenha.setBounds(20, 150, 220, 22);

        txtSnome.setEnabled(false);
        jPanel1.add(txtSnome);
        txtSnome.setBounds(20, 100, 400, 24);

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome);
        txtNome.setBounds(20, 60, 400, 24);

        txtCodigoUsuario.setEnabled(false);
        txtCodigoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoUsuario);
        txtCodigoUsuario.setBounds(40, 20, 170, 20);

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Perfil", "Administrador", "Funcionario" }));
        cmbPerfil.setEnabled(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(cmbPerfil);
        cmbPerfil.setBounds(260, 20, 160, 26);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Perfil:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 20, 31, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 20, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 40, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2º nome");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 50, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 130, 34, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Conf Senha");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 170, 64, 14);

        Mtable.setModel(new javax.swing.table.DefaultTableModel(
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
        Mtable.setEnabled(false);
        jScrollPane1.setViewportView(Mtable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 530, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrimeiroActionPerformed
        // ESTE È O BOTÂO PRIMEIRO DO FORMULARIO USUARIOS
        usuarioatual=0;
        visualizarCadastros();
    }//GEN-LAST:event_cmdPrimeiroActionPerformed

    private void cmdPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPesquisarActionPerformed
        // ESTE CÓDIGO É DO BOTÃO PESQUISAR
        String usuario = JOptionPane.showInputDialog("FAVOR DIGIAR O CODIGO DE USUARIO");
        if(usuario.equals("")){
            return;
        }
        int posL= clsdados.LinhaUsuario(usuario);
        if(posL == -1){
            JOptionPane.showMessageDialog(rootPane,"NÃO FOI POSSIVEL LOCALIZAR ESSE CADASTRO");
            return;
        }
        usuarioatual=posL;
        visualizarCadastros();
    }//GEN-LAST:event_cmdPesquisarActionPerformed

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
        cmdNovo.setEnabled(false);

        //Campos exibição
        txtNome.setEnabled(true);
        txtSnome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtCsenha.setEnabled(true);
        cmbPerfil.setEnabled(true);

        cmdnovo = false;
        txtCodigoUsuario.requestFocusInWindow();
    }//GEN-LAST:event_cmdEditarActionPerformed

    private void cmdAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnteriorActionPerformed
        // CODIGO DO BOTÂO ANTERIOR

        usuarioatual --;
        if (usuarioatual == -1) {
            usuarioatual= clsdados.Nusuarios()-1;
        }

        visualizarCadastros();

    }//GEN-LAST:event_cmdAnteriorActionPerformed

    private void cmdProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProximoActionPerformed
        //
        usuarioatual ++;
        if (usuarioatual == clsdados.Nusuarios()) {
            usuarioatual=0;
        }
        visualizarCadastros();
    }//GEN-LAST:event_cmdProximoActionPerformed

    private void cmdUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUltimoActionPerformed
        // ESTE È O CODIGO DO BOTÃO ULTIMO CADASTRO DO FORMULARIO USUARIOS
        usuarioatual = clsdados.Nusuarios()-1;
        visualizarCadastros();
    }//GEN-LAST:event_cmdUltimoActionPerformed

    private void cmdDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeletarActionPerformed
        // ESTE É O CODIGO DO BOTÃO DELETAR

        int Del = JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE DLETAR ESTE CADASTRO");

        if (Del !=0) {
            return;
        }
        String msg;
        msg = clsdados.DeletarUsuario(usuarioatual);
        JOptionPane.showMessageDialog(rootPane, msg);
        usuarioatual=0;
        visualizarCadastros();
        CarregarTable();
    }//GEN-LAST:event_cmdDeletarActionPerformed

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
        cmdNovo.setEnabled(true);

        //Campos exibição
        txtCodigoUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSnome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtCsenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdicionarActionPerformed
        //VALIDANDO CAMPOS NO FORMULARIO CADASTRO DE USUARIOS

        //CODIGO DE USUARIO
        if (txtCodigoUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O CODIGO PARA REALIZAR O CADASTRO");
            txtCodigoUsuario.requestFocusInWindow();
            return;
        }
        //PERFIL
        if (cmbPerfil.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O PERFIL PARA REALIZAR O CADASTRO");
            cmbPerfil.requestFocusInWindow();
            return;
        }

        //NOME E SOBRENOME
        if (txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O NOME PARA REALIZAR O CADASTRO");
            txtNome.requestFocusInWindow();
            return;
        }

        if (txtSnome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O SOBRENOME PARA REALIZAR O CADASTRO");
            txtSnome.requestFocusInWindow();
            return;
        }

        //SENHAS
        String SSenha = new String (txtSenha.getPassword());
        String Confsenha = new String (txtSenha.getPassword());

        if (SSenha.equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO A SENHA PARA REALIZAR O CADASTRO");
            txtSenha.requestFocusInWindow();
            return;
        }
        if (Confsenha.equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO CONFIRMAR A SENHA PARA REALIZAR O CADASTRO");
            txtCsenha.requestFocusInWindow();
            return;
        }
        if (!SSenha.equals(Confsenha)){
            JOptionPane.showMessageDialog(rootPane,"SENHAS NÃO CORRESPODEM");
            txtCsenha.requestFocusInWindow();
            return;
        }

        int poslinha = clsdados.LinhaUsuario(txtCodigoUsuario.getText());
        if(cmdnovo){
            if (poslinha != -1) {
                JOptionPane.showMessageDialog(rootPane, "ESTE CADASTRO DE USUARIO JA EXISTE");
                txtCodigoUsuario.requestFocusInWindow();
                return;
            }else{
                if (poslinha != -1) {
                    JOptionPane.showMessageDialog(rootPane, "ESTE CADASTRO DE USUARIO NÂO EXISTE");
                    txtCodigoUsuario.requestFocusInWindow();
                    return;
                }
            }
        }
        Usuarios Musuario = new Usuarios(txtCodigoUsuario.getText(),txtNome.getText(), txtSnome.getText(), SSenha,(String)cmbPerfil.getSelectedItem());

        String msg;

        if(cmdnovo){

            msg = clsdados.CadastroUsuario(Musuario);

        }else{

            msg = clsdados.EditarUsuario(Musuario, poslinha);

        }

        JOptionPane.showMessageDialog(rootPane, msg);

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
        cmdNovo.setEnabled(true);
        cmdDeletar.setEnabled(true);

        //Campos exibição
        txtCodigoUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSnome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtCsenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
        
        CarregarTable();
    }//GEN-LAST:event_cmdAdicionarActionPerformed

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
        cmdDeletar.setEnabled(false);

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
        CarregarTable();
    }//GEN-LAST:event_cmdNovoActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        visualizarCadastros();
        CarregarTable();
    }//GEN-LAST:event_formWindowOpened

    private void txtCodigoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoUsuarioActionPerformed
  
    
    private void visualizarCadastros(){
        txtCodigoUsuario.setText(clsdados.getUsuarios()[usuarioatual].getCodusuario());
        txtNome.setText(clsdados.getUsuarios()[usuarioatual].getNome());
        txtSnome.setText(clsdados.getUsuarios()[usuarioatual].getSnome());
        txtSenha.setText(clsdados.getUsuarios()[usuarioatual].getSenha());
        txtCsenha.setText(clsdados.getUsuarios()[usuarioatual].getSenha());
        cmbPerfil.setSelectedItem(clsdados.getUsuarios()[usuarioatual].getPerfil());
    }

    private void CarregarTable(){
         String titulocabecalho[]={"Cod Usuario","Nome","Sobrenome","Perfil"};
         String RegCadastro[] = new String [4];
         Usertable= new DefaultTableModel(null,titulocabecalho);
         for (int i = 0; i < clsdados.Nusuarios(); i++) {
             RegCadastro[0]= clsdados.getUsuarios()[i].getCodusuario();
              RegCadastro[1]= clsdados.getUsuarios()[i].getNome();
               RegCadastro[2]= clsdados.getUsuarios()[i].getSnome();
                RegCadastro[3]= Perfil(clsdados.getUsuarios()[i].getPerfil());
                
                Usertable.addRow(RegCadastro);    
         }
         Mtable.setModel(Usertable);
     }
    
    private String Perfil(String idperfil){
            if(idperfil.equals("1")){
                return "ADMINISTRADOR";
                
        }else{
                return "FUNCIONARIO";
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
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuario().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mtable;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JButton cmdAdicionar;
    private javax.swing.JButton cmdAnterior;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdDeletar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JPasswordField txtCsenha;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSnome;
    // End of variables declaration//GEN-END:variables
}
