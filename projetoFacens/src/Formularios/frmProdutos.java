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

        jPanel1 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Produtos");
        setPreferredSize(new java.awt.Dimension(600, 620));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(32, 34, 37));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 61, 71), 7));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(602, 1194));
        jPanel1.setPreferredSize(new java.awt.Dimension(602, 1194));
        jPanel1.setLayout(null);

        txtCodigoProduto.setBackground(new java.awt.Color(51, 61, 71));
        txtCodigoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCodigoProduto.setEnabled(false);
        txtCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoProduto);
        txtCodigoProduto.setBounds(20, 40, 130, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descrição");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 70, 60, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 40, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Preço");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 20, 40, 14);

        txtPreco.setBackground(new java.awt.Color(51, 61, 71));
        txtPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPreco.setEnabled(false);
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPreco);
        txtPreco.setBounds(220, 40, 130, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Taxa");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(420, 20, 50, 14);

        cmbTaxa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Taxa", "0%", "10%", "15%", "20%" }));
        cmbTaxa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbTaxa.setEnabled(false);
        cmbTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTaxaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTaxa);
        cmbTaxa.setBounds(420, 40, 129, 26);

        txtDescricao.setBackground(new java.awt.Color(51, 61, 71));
        txtDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDescricao.setEnabled(false);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescricao);
        txtDescricao.setBounds(20, 90, 530, 20);

        txtObs.setBackground(new java.awt.Color(51, 61, 71));
        txtObs.setColumns(20);
        txtObs.setRows(5);
        txtObs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtObs.setEnabled(false);
        jScrollPane2.setViewportView(txtObs);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 140, 530, 90);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Obs :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 120, 40, 14);

        cmdPesquisar.setBackground(new java.awt.Color(51, 61, 71));
        cmdPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/024-loupe.png"))); // NOI18N
        cmdPesquisar.setToolTipText("Buscar");
        cmdPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdPesquisar);
        cmdPesquisar.setBounds(570, 570, 30, 36);

        cmdPrimeiro.setBackground(new java.awt.Color(51, 61, 71));
        cmdPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/042-next-1-invertido.png"))); // NOI18N
        cmdPrimeiro.setToolTipText("Primeiro");
        cmdPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrimeiroActionPerformed(evt);
            }
        });
        jPanel1.add(cmdPrimeiro);
        cmdPrimeiro.setBounds(20, 570, 30, 36);

        cmdAnterior.setBackground(new java.awt.Color(51, 61, 71));
        cmdAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/030-next-2-invertido.png"))); // NOI18N
        cmdAnterior.setToolTipText("Anterior");
        cmdAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAnterior);
        cmdAnterior.setBounds(70, 570, 30, 36);

        cmdEditar.setBackground(new java.awt.Color(51, 61, 71));
        cmdEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/092-edit copy.png"))); // NOI18N
        cmdEditar.setToolTipText("Editar");
        cmdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdEditar);
        cmdEditar.setBounds(560, 60, 40, 40);

        cmdNovo.setBackground(new java.awt.Color(51, 61, 71));
        cmdNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/074-layers copy.png"))); // NOI18N
        cmdNovo.setToolTipText("Novo");
        cmdNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNovoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdNovo);
        cmdNovo.setBounds(560, 20, 40, 40);

        cmdProximo.setBackground(new java.awt.Color(51, 61, 71));
        cmdProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/030-next-2.png"))); // NOI18N
        cmdProximo.setToolTipText("Proximo");
        cmdProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProximoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdProximo);
        cmdProximo.setBounds(100, 570, 30, 36);

        cmdDeletar.setBackground(new java.awt.Color(51, 61, 71));
        cmdDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/098-delete-2 copy.png"))); // NOI18N
        cmdDeletar.setToolTipText("Deletar");
        cmdDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdDeletar);
        cmdDeletar.setBounds(560, 100, 40, 40);

        cmdCancelar.setBackground(new java.awt.Color(51, 61, 71));
        cmdCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/127-ban copy.png"))); // NOI18N
        cmdCancelar.setToolTipText("Cancelar");
        cmdCancelar.setEnabled(false);
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCancelar);
        cmdCancelar.setBounds(560, 190, 40, 40);

        cmdAdicionar.setBackground(new java.awt.Color(51, 61, 71));
        cmdAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/027-diskette copy.png"))); // NOI18N
        cmdAdicionar.setToolTipText("Salvar");
        cmdAdicionar.setEnabled(false);
        cmdAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAdicionar);
        cmdAdicionar.setBounds(560, 150, 40, 40);

        cmdUltimo.setBackground(new java.awt.Color(51, 61, 71));
        cmdUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/042-next-1.png"))); // NOI18N
        cmdUltimo.setToolTipText("Ultimo");
        cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdUltimo);
        cmdUltimo.setBounds(150, 570, 30, 36);

        Mtable.setBackground(new java.awt.Color(51, 61, 71));
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
        jScrollPane1.setBounds(20, 249, 580, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
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
         for (int i = 0; i < clsdados.Nprodutos(); i++) {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
