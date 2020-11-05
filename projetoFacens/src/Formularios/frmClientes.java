package Formularios;

import Classes.Clientes;
import Classes.Dados;
import Classes.Utilidades;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmClientes extends javax.swing.JInternalFrame {

private Dados clsdados;
private int clienteAtual=0;
private boolean cmdnovo = false;
private DefaultTableModel Usertable;

//Puxa os dados da classe DADOS 
public void setDados(Dados clsdados){
    this.clsdados = clsdados;
}

    public frmClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        cmdPesquisar = new javax.swing.JButton();
        cmdAnterior = new javax.swing.JButton();
        cmdProximo = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();
        cmdPrimeiro = new javax.swing.JButton();
        cmdAdicionar = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        cmdNovo = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mtable = new javax.swing.JTable();
        txtSobrenomeC = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbidentifica = new javax.swing.JComboBox<>();
        calData = new org.netbeans.modules.form.InvalidComponent();
        calNascimento = new org.netbeans.modules.form.InvalidComponent();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Cliente :");
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

        jLabel1.setText("Cod Cliente");

        jLabel2.setText("identificação");

        jLabel3.setText("Nome");

        jLabel4.setText("Teleffone");

        txtCodigoCliente.setEnabled(false);
        txtCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoClienteActionPerformed(evt);
            }
        });

        txtEmail.setEnabled(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel6.setText("Data");

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Cidade", "Sorocaba", "São Paulo", "Campinas" }));
        cmbCidade.setEnabled(false);
        cmbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCidadeActionPerformed(evt);
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
        cmdProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProximoActionPerformed(evt);
            }
        });

        cmdUltimo.setText("Ultimo");
        cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUltimoActionPerformed(evt);
            }
        });

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

        cmdDeletar.setText("Deletar");
        cmdDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeletarActionPerformed(evt);
            }
        });

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

        txtSobrenomeC.setEnabled(false);
        txtSobrenomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeCActionPerformed(evt);
            }
        });

        txtTelefone.setEnabled(false);
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        txtEndereco.setEnabled(false);
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel5.setText("S-Nome");

        jLabel7.setText("Endereco");

        txtNomeC.setEnabled(false);
        txtNomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCActionPerformed(evt);
            }
        });

        jLabel8.setText("E-mail");

        jLabel9.setText("D-Nasc:");

        jLabel10.setText("Cidade");

        cmbidentifica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ID", "CPF", "RG", "CNPJ", " " }));
        cmbidentifica.setEnabled(false);
        cmbidentifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbidentificaActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(9, 9, 9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSobrenomeC, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbidentifica, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdPesquisar)
                    .addComponent(cmdPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdProximo)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmdUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdAdicionar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel2)
                        .addComponent(cmbidentifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSobrenomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdPesquisar)
                    .addComponent(cmdEditar)
                    .addComponent(cmdNovo)
                    .addComponent(cmdAdicionar)
                    .addComponent(cmdCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdPrimeiro)
                    .addComponent(cmdAnterior)
                    .addComponent(cmdProximo)
                    .addComponent(cmdUltimo)
                    .addComponent(cmdDeletar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCidadeActionPerformed

    private void cmdPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPesquisarActionPerformed
        // ESTE CÓDIGO É DO BOTÃO PESQUISAR
        String cliente = JOptionPane.showInputDialog("FAVOR DIGIAR O CODIGO DO CLIENTE");
        if(cliente.equals("")){
            return;
        }
        int posL= clsdados.LinhaCliente(cliente);
        if(posL == -1){
            JOptionPane.showMessageDialog(rootPane,"NÃO FOI POSSIVEL LOCALIZAR ESSE CLIENTE");
            return;
        }
        clienteAtual=posL;
        visualizarCadastros();
    }//GEN-LAST:event_cmdPesquisarActionPerformed

    private void cmdAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnteriorActionPerformed
        // CODIGO DO BOTÂO ANTERIOR
        
        clienteAtual --;
        if (clienteAtual == -1) {
            clienteAtual= clsdados.Nclientes()-1;
        }
        
        visualizarCadastros();
        
    }//GEN-LAST:event_cmdAnteriorActionPerformed

    private void cmdPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrimeiroActionPerformed
        // ESTE È O BOTÂO PRIMEIRO DO FORMULARIO USUARIOS
        clienteAtual=0;
        visualizarCadastros();
    }//GEN-LAST:event_cmdPrimeiroActionPerformed

    private void cmdAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdicionarActionPerformed
        //VALIDANDO CAMPOS NO FORMULARIO CADASTRO DE USUARIOS
        
        //CODIGO DE CLIENTE
        if (txtCodigoCliente.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O CODIGO PARA REALIZAR O CADASTRO");
            txtCodigoCliente.requestFocusInWindow();
            return;
        }
        //CIDADE
         if (cmbCidade.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO A TAXA PARA REALIZAR O CADASTRO");
            cmbCidade.requestFocusInWindow();
            return;
        }
         
         //NOME
          if (txtNomeC.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O NOME PARA REALIZAR O CADASTRO");
            txtNomeC.requestFocusInWindow();
            return;
        }
          
        //SOBRENOME  
          if (txtSobrenomeC.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O SOBRENOME PARA REALIZAR O CADASTRO");
            txtSobrenomeC.requestFocusInWindow();
            return;
        }
          //EMAIL
           if (txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O EMAIL PARA REALIZAR O CADASTRO");
            txtEmail.requestFocusInWindow();
            return;
        }
           //ENDERECO
           if (txtEndereco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O ENDEREÇO PARA REALIZAR O CADASTRO");
            txtEndereco.requestFocusInWindow();
            return;
        }
           //TELEFONE
           if (txtTelefone.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O ENDEREÇO PARA REALIZAR O CADASTRO");
            txtTelefone.requestFocusInWindow();
            return;
        }
          // IDENTIFICAÇÃO
           if (cmbidentifica.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO A IDENTIFICAÇÃO PARA REALIZAR O CADASTRO");
            cmbidentifica.requestFocusInWindow();
            return;
        }
           if(calNascimento.getDate().before(new Date())){
              JOptionPane.showMessageDialog(rootPane, "DADOS DA DATA DE NASCIMENTO NÃO CONFERE");
              calNascimento.requestFocusInWindow();
              return;
           }
           
         int poslinha = clsdados.LinhaCliente(txtCodigoCliente.getText());
         if(cmdnovo){  
           if (poslinha != -1) {
            JOptionPane.showMessageDialog(rootPane, "ESTE CADASTRO DE CLIENTE JA EXISTE");
            txtCodigoCliente.requestFocusInWindow();
            return;
        }else{
           if (poslinha != -1) {
            JOptionPane.showMessageDialog(rootPane, "ESTE CADASTRO DE CLIENTE NÂO EXISTE");
            txtCodigoCliente.requestFocusInWindow();
            return;
            }
           }
         }
   
   Clientes mCliente = new Clientes(txtCodigoCliente.getText(),
           cmbidentifica.getSelectedIndex(),txtNomeC.getText(),
           txtSobrenomeC.getText(),txtEndereco.getText(),
           cmbCidade.getSelectedIndex(),txtTelefone.getText(),
           calData.getDate(),calNascimento.getDate(),txtEmail.getText());//OBJETO mCliente quebrado em linhas
   String msg;
   
   if(cmdnovo){
       
        msg = clsdados.CadastroCliente(mCliente);
        
   }else{
       
        msg = clsdados.EditarCliente(mCliente, poslinha);
        
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
        txtCodigoCliente.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtEmail.setEnabled(false);
        txtNomeC.setEnabled(false);
        txtSobrenomeC.setEnabled(false);
        txtEndereco.setEnabled(false);
        cmbCidade.setEnabled(false);
        cmbidentifica.setEnabled(false);
        calNascimento.setEnabled(false);
        calData.setEnabled(false);
        
       
    }//GEN-LAST:event_cmdAdicionarActionPerformed
    
    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditarActionPerformed
        
    // ESTE É O CÓDIGO DO BOTÃO EDITAR DO FORMULARÍO CLIENTES
        
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
        txtTelefone.setEnabled(true);
        txtEmail.setEnabled(true);
        txtNomeC.setEnabled(true);
        txtSobrenomeC.setEnabled(true);
        txtEndereco.setEnabled(true);
        cmbCidade.setEnabled(true);
        cmbidentifica.setEnabled(true);
        calNascimento.setEnabled(true);
        calData.setEnabled(true);
        
        
        cmdnovo = false;
        cmbidentifica.requestFocusInWindow();
        CarregarTable();
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
        cmdDeletar.setEnabled(false);
        
        //Campos exibição
        txtCodigoCliente.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtEmail.setEnabled(true);
        txtNomeC.setEnabled(true);
        txtSobrenomeC.setEnabled(true);
        txtEndereco.setEnabled(true);
        cmbCidade.setEnabled(true);
        cmbidentifica.setEnabled(true);
        calNascimento.setEnabled(true);
        calData.setEnabled(true);
        
        //Campos Limpos
        txtCodigoCliente.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtNomeC.setText("");
        txtSobrenomeC.setText("");
        txtEndereco.setText("");
        cmbCidade.setSelectedIndex(0);
        cmbidentifica.setSelectedIndex(0);
        txtEndereco.setText("");
        calData.setDate(new Date());
        calNascimento.setDate(new Date());
        
        cmdnovo = true;
        
        txtCodigoCliente.requestFocusInWindow();
        CarregarTable();
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
        cmdNovo.setEnabled(true);
        
        
        //Campos exibição
        txtCodigoCliente.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtEmail.setEnabled(false);
        txtNomeC.setEnabled(false);
        txtSobrenomeC.setEnabled(false);
        txtEndereco.setEnabled(false);
        cmbCidade.setEnabled(false);
        cmbidentifica.setEnabled(false);
        calNascimento.setEnabled(false);
        calData.setEnabled(false);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        visualizarCadastros();
        CarregarTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmdUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUltimoActionPerformed
        // ESTE È O CODIGO DO BOTÃO ULTIMO CADASTRO DO FORMULARIO CLIENTES
        clienteAtual = clsdados.Nclientes()-1;
        visualizarCadastros();
    }//GEN-LAST:event_cmdUltimoActionPerformed

    private void cmdProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProximoActionPerformed
        // BOTÃO PROXIMO ITEM
        clienteAtual ++;
        if (clienteAtual == clsdados.Nclientes()) {
            clienteAtual=0;
        }
        visualizarCadastros();
    }//GEN-LAST:event_cmdProximoActionPerformed

    private void cmdDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeletarActionPerformed
        // ESTE É O CODIGO DO BOTÃO DELETAR
        
        int Del = JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE DELETAR ESTE CADASTRO?");
        
        if (Del !=0) {
            return;
        }
        String msg;
        msg = clsdados.DeletarCliente(clienteAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
            clienteAtual=0;
            visualizarCadastros();
            CarregarTable();
    }//GEN-LAST:event_cmdDeletarActionPerformed

    private void txtCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoClienteActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSobrenomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeCActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtNomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCActionPerformed

    private void cmbidentificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbidentificaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbidentificaActionPerformed
     private void visualizarCadastros(){
        txtCodigoCliente.setText(clsdados.getClientes()[clienteAtual].getCodigoCliente());
        txtNomeC.setText(clsdados.getClientes()[clienteAtual].getNome());
        txtSobrenomeC.setText(clsdados.getClientes()[clienteAtual].getSobrenome());
        txtEndereco.setText(clsdados.getClientes()[clienteAtual].getEndereco());
        txtTelefone.setText(clsdados.getClientes()[clienteAtual].getTelefone());
        txtEmail.setText(clsdados.getClientes()[clienteAtual].getEmail());
        cmbCidade.setSelectedItem(clsdados.getClientes()[clienteAtual].getCidade());
        cmbidentifica.setSelectedItem(clsdados.getClientes()[clienteAtual].getIndent());
        calData.setDate(clsdados.getClientes()[clienteAtual].getDataVenda());
        calNascimento.setDate(clsdados.getClientes()[clienteAtual].getDataNasc());
        
    }

     private void CarregarTable(){
         String titulocabecalho[]={"Cod Cliente","Identif","Data","Nome","Sobrenome","End","Tel","D-Nasc","Cidade","E-mail"};
         String RegCadastro[] = new String [10];
         Usertable= new DefaultTableModel(null,titulocabecalho);
         
         for (int i = 0; i < clsdados.Nusuarios(); i++) {
             RegCadastro[0]= clsdados.getClientes()[i].getCodigoCliente();
              RegCadastro[1]= Id(clsdados.getClientes()[i].getIndent());
               RegCadastro[2]= "" + clsdados.getClientes()[i].getDataVenda();
                RegCadastro[3]= (clsdados.getClientes()[i].getNome());
                 RegCadastro[4]= clsdados.getClientes()[i].getSobrenome();
                  RegCadastro[5]= clsdados.getClientes()[i].getEndereco();
                   RegCadastro[6]= clsdados.getClientes()[i].getTelefone();
                    RegCadastro[7]= "" +clsdados.getClientes()[i].getDataNasc();
                     RegCadastro[8]= Cidade(clsdados.getClientes()[i].getCidade());
                      RegCadastro[9]= clsdados.getClientes()[i].getEmail();
                
                Usertable.addRow(RegCadastro);    
         }
         Mtable.setModel(Usertable);
     }
     
     private String Id (int ident){
         switch (ident){
             case 0: return "CPF";
             case 1: return "RG";
             case 2: return "CNPJ";
           
             default: return "SEM IDENTIFICAÇÃO.";
         }
     }
     
    private String Cidade (int idcidade){
         switch (idcidade){
             case 0: return "Soracaba";
             case 1: return "São Paulo";
             case 2: return "Campinas";
           
             default: return "SEM CIDADE";
         }
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mtable;
    private org.netbeans.modules.form.InvalidComponent calData;
    private org.netbeans.modules.form.InvalidComponent calNascimento;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbidentifica;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeC;
    private javax.swing.JTextField txtSobrenomeC;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
