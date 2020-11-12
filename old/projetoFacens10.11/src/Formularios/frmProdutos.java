package Formularios;

import Classes.Dados;
import Classes.Produtos;
import Classes.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProdutos extends javax.swing.JFrame {

private Dados clsdados;
private int produtoAtual=0;
private boolean cmdnovo = false;
private DefaultTableModel Usertable;
    

    //FUNÇÃO DO QUE CARREGA OS DADOS TEMPORARIOS
    public void setDados(Dados clsdados){
        this.clsdados = clsdados;
    }    
    //FUNÇÃO PADRÃO DO FORM QUE INICIA OS COMPONETES ISTO AQUI É GERADO AUTOMATICAMENTE.
    public frmProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigoProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbTaxa = new javax.swing.JComboBox<>();
        txtDescricao = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cmdPesquisar = new javax.swing.JButton();
        cmdPrimeiro = new javax.swing.JButton();
        cmdAnterior = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        cmdNovo = new javax.swing.JButton();
        cmdProximo = new javax.swing.JButton();
        cmdDeletar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdAdicionar = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtCodigoProduto.setEnabled(false);
        txtCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição");

        jLabel1.setText("Cod Produto");

        jLabel2.setText("Preço");

        txtPreco.setEnabled(false);
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jLabel6.setText("Taxa");

        cmbTaxa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Taxa", "0%", "10%", "15%", "20%" }));
        cmbTaxa.setEnabled(false);
        cmbTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTaxaActionPerformed(evt);
            }
        });

        txtDescricao.setEnabled(false);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        txtObs.setColumns(20);
        txtObs.setRows(5);
        txtObs.setEnabled(false);
        jScrollPane2.setViewportView(txtObs);

        jLabel4.setText("Obs :");

        cmdPesquisar.setText("Procurar");
        cmdPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPesquisarActionPerformed(evt);
            }
        });

        cmdPrimeiro.setText("Primeiro");
        cmdPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrimeiroActionPerformed(evt);
            }
        });

        cmdAnterior.setText("Anterior");
        cmdAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnteriorActionPerformed(evt);
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

        cmdProximo.setText("Proximo");
        cmdProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProximoActionPerformed(evt);
            }
        });

        cmdDeletar.setText("Deletar");
        cmdDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeletarActionPerformed(evt);
            }
        });

        cmdCancelar.setText("Cancelar");
        cmdCancelar.setEnabled(false);
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        cmdAdicionar.setText("Adicionar");
        cmdAdicionar.setEnabled(false);
        cmdAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAdicionarActionPerformed(evt);
            }
        });

        cmdUltimo.setText("Ultimo");
        cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUltimoActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(cmdAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //CAMPO INUTIL
    private void txtCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdutoActionPerformed
    //CAMPO INUTIL
    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed
    //CAMPO INUTIL
    private void cmbTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTaxaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTaxaActionPerformed
    //CAMPO INUTIL
    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed
    //ESTE É O BOTÃO PESQUISAR
    private void cmdPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPesquisarActionPerformed
        // ESTE CÓDIGO É DO BOTÃO PESQUISAR
        String produto = JOptionPane.showInputDialog("FAVOR DIGIAR O CODIGO DE PRODUTO");
        if(produto.equals("")){
            return;
        }
        int posL= clsdados.LinhaProduto(produto);
        if(posL == -1){
            JOptionPane.showMessageDialog(rootPane,"NÃO FOI POSSIVEL LOCALIZAR ESSE PRODUTO");
            return;
        }
        produtoAtual=posL;
        visualizarCadastros();
    }//GEN-LAST:event_cmdPesquisarActionPerformed
    // ESTE È O BOTÂO PRIMEIRO
    private void cmdPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrimeiroActionPerformed
        // ESTE È O BOTÂO PRIMEIRO DO FORMULARIO USUARIOS
        produtoAtual=0;
        visualizarCadastros();
    }//GEN-LAST:event_cmdPrimeiroActionPerformed
    // CODIGO DO BOTÂO ANTERIOR
    private void cmdAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnteriorActionPerformed
        // CODIGO DO BOTÂO ANTERIOR

        produtoAtual --;
        if (produtoAtual == -1) {
            produtoAtual= clsdados.Nprodutos()-1;
        }

        visualizarCadastros();

    }//GEN-LAST:event_cmdAnteriorActionPerformed
    // ESTE É O CÓDIGO DO BOTÃO EDITAR DO FORMULARÍO CADASTRO PRODUTOS
    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditarActionPerformed

        // ESTE É O CÓDIGO DO BOTÃO EDITAR DO FORMULARÍO CADASTRO PRODUTOS

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
        txtPreco.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtObs.setEnabled(true);
        cmbTaxa.setEnabled(true);

        cmdnovo = false;
        txtCodigoProduto.requestFocusInWindow();
    }//GEN-LAST:event_cmdEditarActionPerformed
    // ESTE É O CÓDIGO DO BOTÃO NOVO DO FORMULARÍO CADASTRO PRODUTOS
    private void cmdNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNovoActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO NOVO DO FORMULARÍO CADASTRO PRODUTOS

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
        txtCodigoProduto.setEnabled(true);
        txtPreco.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtObs.setEnabled(true);
        cmbTaxa.setEnabled(true);

        //Campos Limpos
        txtCodigoProduto.setText("");
        txtPreco.setText("");
        txtDescricao.setText("");
        txtObs.setText("");
        cmbTaxa.setSelectedIndex(0);

        cmdnovo = true;

        txtCodigoProduto.requestFocusInWindow();
        CarregarTable();
    }//GEN-LAST:event_cmdNovoActionPerformed
    // BOTÃO PROXIMO ITEM
    private void cmdProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProximoActionPerformed
        // BOTÃO PROXIMO ITEM
        produtoAtual ++;
        if (produtoAtual == clsdados.Nprodutos()) {
            produtoAtual=0;
        }
        visualizarCadastros();
    }//GEN-LAST:event_cmdProximoActionPerformed
    // ESTE É O CODIGO DO BOTÃO DELETAR
    private void cmdDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeletarActionPerformed
        // ESTE É O CODIGO DO BOTÃO DELETAR

        int Del = JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE DELETAR ESTE CADASTRO?");

        if (Del !=0) {
            return;
        }
        String msg;
        msg = clsdados.DeletarProduto(produtoAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        produtoAtual=0;
        visualizarCadastros();
        CarregarTable();
    }//GEN-LAST:event_cmdDeletarActionPerformed
     // ESTE É O CÓDIGO DO BOTÃO CANCELAR
    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO CANCELAR DO FORMULARÍO CADASTRO PRODUTOS

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
        txtCodigoProduto.setEnabled(false);
        txtPreco.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtObs.setEnabled(false);
        cmbTaxa.setEnabled(false);
    }//GEN-LAST:event_cmdCancelarActionPerformed
    
    private void cmdAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdicionarActionPerformed
        //VALIDANDO CAMPOS NO FORMULARIO CADASTRO DE USUARIOS

        //CODIGO DE USUARIO
        if (txtCodigoProduto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O CODIGO PARA REALIZAR O CADASTRO");
            txtCodigoProduto.requestFocusInWindow();
            return;
        }
        //PERFIL
        if (cmbTaxa.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO A TAXA PARA REALIZAR O CADASTRO");
            cmbTaxa.requestFocusInWindow();
            return;
        }

        //NOME E SOBRENOME
        if (txtPreco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO O PREÇO PARA REALIZAR O CADASTRO");
            txtPreco.requestFocusInWindow();
            return;
        }

        if (txtDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO A DESCRIÇÃO PARA REALIZAR O CADASTRO");
            txtDescricao.requestFocusInWindow();
            return;
        }

        if (txtObs.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"È NECESSARIO A OBSERVAÇÃO PARA REALIZAR O CADASTRO");
            txtObs.requestFocusInWindow();
            return;
        }

        if(!Utilidades.isNumeric(txtPreco.getText())){

        }else{
            JOptionPane.showMessageDialog(rootPane, "ESTE CAMPO ACEITA APENAS NUMEROS");
            txtPreco.requestFocusInWindow();
            return;
        }

        int preco = Integer.parseInt(txtPreco.getText());
        if (preco<=0){
            JOptionPane.showMessageDialog(rootPane, "ESTE CAMPO ACEITA APENAS NUMEROS MAIORES QUE ZERO");
            txtPreco.requestFocusInWindow();
            return;
        }

        int poslinha = clsdados.LinhaUsuario(txtCodigoProduto.getText());
        if(cmdnovo){
            if (poslinha != -1) {
                JOptionPane.showMessageDialog(rootPane, "ESTE CADASTRO DE PRODUTO JA EXISTE");
                txtCodigoProduto.requestFocusInWindow();
                return;
            }else{
                if (poslinha != -1) {
                    JOptionPane.showMessageDialog(rootPane, "ESTE CADASTRO DE PRODUTO NÂO EXISTE");
                    txtCodigoProduto.requestFocusInWindow();
                    return;
                }
            }
        }
        Produtos mProduto = new Produtos(txtCodigoProduto.getText(),txtDescricao.getText(),preco,cmbTaxa.getSelectedIndex(),txtObs.getText());

        String msg;

        if(cmdnovo){

            msg = clsdados.CadastroProduto(mProduto);

        }else{

            msg = clsdados.EditarProduto(mProduto, poslinha);

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
        txtCodigoProduto.setEnabled(false);
        txtPreco.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtObs.setEnabled(false);
        cmbTaxa.setEnabled(false);

    }//GEN-LAST:event_cmdAdicionarActionPerformed

    private void cmdUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUltimoActionPerformed
        // ESTE È O CODIGO DO BOTÃO ULTIMO CADASTRO DO FORMULARIO PRODUTOS
        produtoAtual = clsdados.Nprodutos()-1;
        visualizarCadastros();
    }//GEN-LAST:event_cmdUltimoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       visualizarCadastros();
       CarregarTable();
    }//GEN-LAST:event_formWindowOpened

    
    
    
    /*
    OS CODIGOS A BAIXO POR ENQUANTO SÃO TEMPORARIOS ELES SÃO RESPONSAVEIS DE CARREGAR OS DADOS NO FORMULARIO E
    NAS TABELAS POR TANTO NÃO HÁ NECESSIDADE DE ALTERALAS ATÉ A IMPLEMENTAÇÃO DO BD
    */
    
    
    private void visualizarCadastros(){
        txtCodigoProduto.setText(clsdados.getProdutos()[produtoAtual].getCodProduto());
        txtPreco.setText("" + clsdados.getProdutos()[produtoAtual].getPreco());
        txtDescricao.setText(clsdados.getProdutos()[produtoAtual].getDescricao());
        txtObs.setText(clsdados.getProdutos()[produtoAtual].getObs());
        cmbTaxa.setSelectedItem(clsdados.getProdutos()[produtoAtual].getTaxa());
    }

     private void CarregarTable(){
         String titulocabecalho[]={"Cod Produtos","Descrição","Preço","Taxa","Obs"};
         String RegCadastro[] = new String [5];
         Usertable= new DefaultTableModel(null,titulocabecalho);
         for (int i = 0; i < clsdados.Nusuarios(); i++) {
             RegCadastro[0]= clsdados.getProdutos()[i].getCodProduto();
              RegCadastro[1]= clsdados.getProdutos()[i].getDescricao();
               RegCadastro[2]= "" + clsdados.getProdutos()[i].getPreco();
                RegCadastro[3]= Taxa(clsdados.getProdutos()[i].getTaxa());
                 RegCadastro[4]= clsdados.getProdutos()[i].getObs();
                
                Usertable.addRow(RegCadastro);    
         }
         Mtable.setModel(Usertable);
     }
     
     private String Taxa (int idtaxa){
         switch (idtaxa){
             case 0: return "0%";
             case 1: return "10%";
             case 2: return "15%";
             case 3: return "20%";
           
             default: return "SEM TAXA";
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
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mtable;
    private javax.swing.JComboBox<String> cmbTaxa;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
