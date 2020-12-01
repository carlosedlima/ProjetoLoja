
package Formularios;

import Classes.Dados;

/**
 *
 * @author Carlos
 */
public class frmMenu extends javax.swing.JFrame {
private Dados clsdados;
private String[] args;
private int perfil;
private String senha;
private String usuario;

public void setupUsuario(String usuario){
    this.usuario = usuario;
}


public void setDados(Dados clsdados){
    this.clsdados = clsdados;
}

public void setupPerfil(int perfil){
    this.perfil = perfil;
}

public void setupSenha(String senha){
    this.senha = senha;
}
   
    public frmMenu() {
        initComponents();
        this.setLocationRelativeTo(null);//Inicia no centro da tela

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeskPainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnarquivo = new javax.swing.JMenu();
        mnarquivo_clientes = new javax.swing.JMenuItem();
        mnarquivo_produtos = new javax.swing.JMenuItem();
        mnarquivo_usuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnarquivo_altsenha = new javax.swing.JMenuItem();
        mnarquivo_altusuario = new javax.swing.JMenuItem();
        mnarquivo_sair = new javax.swing.JMenuItem();
        mnmovimentos = new javax.swing.JMenu();
        mnmovimentos_vendas = new javax.swing.JMenuItem();
        mnmovimentos_relatorio = new javax.swing.JMenuItem();
        mnajuda = new javax.swing.JMenu();
        mnajuda_sobre = new javax.swing.JMenuItem();
        mnajuda_ajuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetVendas");
        setMinimumSize(new java.awt.Dimension(400, 200));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        DeskPainel.setBackground(new java.awt.Color(32, 34, 37));
        DeskPainel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 61, 71), 7));
        DeskPainel.setForeground(new java.awt.Color(0, 0, 0));
        DeskPainel.setToolTipText("");
        DeskPainel.setMinimumSize(new java.awt.Dimension(400, 300));
        DeskPainel.setName(""); // NOI18N
        DeskPainel.setPreferredSize(new java.awt.Dimension(800, 400));

        jMenuBar1.setBackground(new java.awt.Color(51, 61, 71));
        jMenuBar1.setBorder(null);

        mnarquivo.setBackground(new java.awt.Color(153, 153, 153));
        mnarquivo.setBorder(null);
        mnarquivo.setForeground(new java.awt.Color(255, 255, 255));
        mnarquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arquivo.png"))); // NOI18N
        mnarquivo.setText("Arquivos");

        mnarquivo_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cliente.png"))); // NOI18N
        mnarquivo_clientes.setText("Clientes");
        mnarquivo_clientes.setIconTextGap(2);
        mnarquivo_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivo_clientesActionPerformed(evt);
            }
        });
        mnarquivo.add(mnarquivo_clientes);

        mnarquivo_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produto.png"))); // NOI18N
        mnarquivo_produtos.setText("Produtos");
        mnarquivo_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivo_produtosActionPerformed(evt);
            }
        });
        mnarquivo.add(mnarquivo_produtos);

        mnarquivo_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuarios.png"))); // NOI18N
        mnarquivo_usuarios.setText("Usuarios");
        mnarquivo_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivo_usuariosActionPerformed(evt);
            }
        });
        mnarquivo.add(mnarquivo_usuarios);
        mnarquivo.add(jSeparator1);

        mnarquivo_altsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/senha.png"))); // NOI18N
        mnarquivo_altsenha.setText("Alterar Senha");
        mnarquivo_altsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivo_altsenhaActionPerformed(evt);
            }
        });
        mnarquivo.add(mnarquivo_altsenha);

        mnarquivo_altusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trocar_usuario.png"))); // NOI18N
        mnarquivo_altusuario.setText("Alterar Usuario");
        mnarquivo_altusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivo_altusuarioActionPerformed(evt);
            }
        });
        mnarquivo.add(mnarquivo_altusuario);

        mnarquivo_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        mnarquivo_sair.setText("Sair");
        mnarquivo_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivo_sairActionPerformed(evt);
            }
        });
        mnarquivo.add(mnarquivo_sair);

        jMenuBar1.add(mnarquivo);

        mnmovimentos.setBorder(null);
        mnmovimentos.setForeground(new java.awt.Color(255, 255, 255));
        mnmovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Movimentos.png"))); // NOI18N
        mnmovimentos.setText("Movimentos");

        mnmovimentos_vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/venda.png"))); // NOI18N
        mnmovimentos_vendas.setText("Vendas");
        mnmovimentos_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnmovimentos_vendasActionPerformed(evt);
            }
        });
        mnmovimentos.add(mnmovimentos_vendas);

        mnmovimentos_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorios.png"))); // NOI18N
        mnmovimentos_relatorio.setText("Relatorio Vendas");
        mnmovimentos.add(mnmovimentos_relatorio);

        jMenuBar1.add(mnmovimentos);

        mnajuda.setBorder(null);
        mnajuda.setForeground(new java.awt.Color(255, 255, 255));
        mnajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ajudas.png"))); // NOI18N
        mnajuda.setText("Ajuda");

        mnajuda_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sobre.png"))); // NOI18N
        mnajuda_sobre.setText("Sobre");
        mnajuda_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnajuda_sobreActionPerformed(evt);
            }
        });
        mnajuda.add(mnajuda_sobre);

        mnajuda_ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ajuda.png"))); // NOI18N
        mnajuda_ajuda.setText("Ajuda");
        mnajuda.add(mnajuda_ajuda);

        jMenuBar1.add(mnajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        // ESTE É O CÓDIGO DO BOTÃO USUARIO NA BARRA DE MENU
    private void mnarquivo_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivo_usuariosActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO USUARIO NA BARRA DE MENU
        frmUsuario fusuario = new frmUsuario();
        fusuario.setDados(clsdados);
        fusuario.setVisible(true);
        
        
    }//GEN-LAST:event_mnarquivo_usuariosActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO SAIR NA BARRA DE MENU
    private void mnarquivo_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivo_sairActionPerformed
            clsdados.CadastroGeral();
            System.exit(0);
    }//GEN-LAST:event_mnarquivo_sairActionPerformed
        //ESTE É O BOTÃO DE ALTERAR USUARIO
    private void mnarquivo_altusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivo_altusuarioActionPerformed
        this.setVisible(false);
        frmLogin mlogin = new frmLogin();
        mlogin.setDados(clsdados);
        mlogin.setLocationRelativeTo(null);
        mlogin.setVisible(true);
        
    }//GEN-LAST:event_mnarquivo_altusuarioActionPerformed
        // CÓDIGO DO BOTÃO CLIENTES NA BARRA DE MENU
    private void mnarquivo_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivo_clientesActionPerformed
        // CÓDIGO DO BOTÃO CLIENTES NA BARRA DE MENU
        frmClientes fclientes = new frmClientes();
        fclientes.setDados(clsdados);
        fclientes.setVisible(true);
    }//GEN-LAST:event_mnarquivo_clientesActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO PRODUTO NA BARRA DE MENU
    private void mnarquivo_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivo_produtosActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO PRODUTO NA BARRA DE MENU
        frmProdutos fprodutos = new frmProdutos();
        fprodutos.setDados(clsdados);
        fprodutos.setVisible(true);
        
    }//GEN-LAST:event_mnarquivo_produtosActionPerformed
        //EVENTO PRA QUANDO ABRIR
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(perfil ==2){
            mnmovimentos_relatorio.setEnabled(false);
             mnarquivo_altsenha.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void mnarquivo_altsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivo_altsenhaActionPerformed
        frmAlterarSenha Malterarsenha = new frmAlterarSenha(this,rootPaneCheckingEnabled);
        Malterarsenha.setupSenha(senha);
        Malterarsenha.setupUsuario(usuario);
        Malterarsenha.setDados(clsdados);
        Malterarsenha.setLocationRelativeTo(this);
        Malterarsenha.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnarquivo_altsenhaActionPerformed

    private void mnajuda_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnajuda_sobreActionPerformed
        frmSobre formularioSobre = new frmSobre(this,rootPaneCheckingEnabled);
        formularioSobre.setLocationRelativeTo(this);
        formularioSobre.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnajuda_sobreActionPerformed

    private void mnmovimentos_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnmovimentos_vendasActionPerformed
        frmControlevendas frmvendas = new frmControlevendas();
        frmvendas.setDados(clsdados);
        frmvendas.setVisible(true);
    }//GEN-LAST:event_mnmovimentos_vendasActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DeskPainel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnajuda;
    private javax.swing.JMenuItem mnajuda_ajuda;
    private javax.swing.JMenuItem mnajuda_sobre;
    private javax.swing.JMenu mnarquivo;
    private javax.swing.JMenuItem mnarquivo_altsenha;
    private javax.swing.JMenuItem mnarquivo_altusuario;
    private javax.swing.JMenuItem mnarquivo_clientes;
    private javax.swing.JMenuItem mnarquivo_produtos;
    private javax.swing.JMenuItem mnarquivo_sair;
    private javax.swing.JMenuItem mnarquivo_usuarios;
    private javax.swing.JMenu mnmovimentos;
    private javax.swing.JMenuItem mnmovimentos_relatorio;
    private javax.swing.JMenuItem mnmovimentos_vendas;
    // End of variables declaration//GEN-END:variables
}
