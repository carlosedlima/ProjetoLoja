
package Formularios;

import Classes.Dados;
import Classes.Opcoes;
import Classes.Utilidades;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingContainer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class frmControlevendas extends javax.swing.JFrame {
private Dados clsdados;
private DefaultTableModel Usertable;

public void setDados(Dados clsdados){
    this.clsdados = clsdados;
}
    public frmControlevendas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        cmbCliente = new javax.swing.JComboBox<>();
        cmbProduto = new javax.swing.JComboBox<>();
        btBuscaCliente = new javax.swing.JButton();
        btBuscaProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        txtData = new javax.swing.JTextField();
        cmdAdicionar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        btnDeletarTodos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txttotalquantidade = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle Vendas:");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Data");

        jLabel2.setText("Cliente");

        jLabel3.setText("Produto");

        jLabel4.setText("Quantidade");

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        btBuscaCliente.setText("...");
        btBuscaCliente.setToolTipText("Pesquisar Clientes");
        btBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaClienteActionPerformed(evt);
            }
        });

        btBuscaProduto.setText("...");
        btBuscaProduto.setToolTipText("Pesquisar Produtos");
        btBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaProdutoActionPerformed(evt);
            }
        });

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblVendas);

        txtData.setEnabled(false);
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        cmdAdicionar.setText("Adicionar");
        cmdAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAdicionarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        btnDeletarTodos.setText("Deletar Todos");
        btnDeletarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarTodosActionPerformed(evt);
            }
        });

        jLabel5.setText("TOTAL:");

        txttotalquantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txttotalquantidade.setEnabled(false);
        txttotalquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalquantidadeActionPerformed(evt);
            }
        });

        txtValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValor.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(cmdAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDeletarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(26, 26, 26)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttotalquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btBuscaCliente)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscaProduto)
                    .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Salvar)
                        .addComponent(cmdAdicionar)
                        .addComponent(btnDeletar)
                        .addComponent(btnDeletarTodos)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttotalquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txttotalquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalquantidadeActionPerformed
    //EVENTO CHAMADO AO ABRIR
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Opcoes opc = new Opcoes("Carlos@gmail.com","SELECIONE UM CLIENTE");
        cmbCliente.addItem(""+opc);
        for(int i = 0; i<clsdados.Nclientes();i++){
            opc = new Opcoes(
             clsdados.getClientes()[i].getCodigoCliente(),
             clsdados.getClientes()[i].getNome()+""+
             clsdados.getClientes()[i].getSobrenome());
            cmbCliente.addItem(opc+"");
        }
  
        
        opc = new Opcoes("Carlos@gmail.com","SELECIONE UM PRODUTO");
        cmbProduto.addItem(""+opc);
        for(int i = 0; i<clsdados.Nprodutos();i++){
            opc = new Opcoes(
             clsdados.getProdutos()[i].getCodProduto(),
             clsdados.getProdutos()[i].getDescricao());
            cmbProduto.addItem(opc+"");
        }
        
        txtData.setText(Utilidades.formatDate (new Date()));
        txttotalquantidade.setText("0");
        txtValor.setText("0");
        
        CarregarTable();
    }//GEN-LAST:event_formWindowOpened
    //ADICIONAR
    private void cmdAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdicionarActionPerformed
        //VERIFICANDO OS CAMPOS
        if(cmbProduto.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"UM PRODUTO DEVE SER SELECIONADO");
            cmbProduto.requestFocusInWindow();
            return;
        }
        
        if(cmbCliente.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"UM CLIENTE DEVE SER SELECIONADO");
            cmbCliente.requestFocusInWindow();
            return;
        }
        
        if(txtQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"DIGITE A QUANTIDADE");
            txtQuantidade.requestFocusInWindow();
            return;
        }
        
        if(Utilidades.isNumeric(txtQuantidade.getText())){

        }else{
            JOptionPane.showMessageDialog(rootPane, "ESTE CAMPO ACEITA APENAS NUMEROS");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        int quantidade = Integer.parseInt(txtQuantidade.getText());
        if (quantidade<=0){
            JOptionPane.showMessageDialog(rootPane, "ESTE CAMPO ACEITA APENAS NUMEROS MAIORES QUE ZERO");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }
        
        int posi = cmbProduto.getSelectedIndex()-1;
        
        String registro[] = new String[5];
        registro[0]=clsdados.getProdutos()[posi].getCodProduto();
        registro[1]=clsdados.getProdutos()[posi].getDescricao();
        registro[2]=""+clsdados.getProdutos()[posi].getPreco();
        registro[3]=""+quantidade;
        registro[4]=""+(quantidade * clsdados.getProdutos()[posi].getPreco());
        Usertable.addRow(registro);
        
        cmbProduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cmbProduto.requestFocusInWindow();
        totais();
    }//GEN-LAST:event_cmdAdicionarActionPerformed
    //SALVAR
    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed

         if(cmbCliente.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"UM CLIENTE DEVE SER SELECIONADO");
            cmbCliente.requestFocusInWindow();
            return;
        }
        
        int totalquantidade = Integer.parseInt(txttotalquantidade.getText());
        if (totalquantidade==0){
            JOptionPane.showMessageDialog(rootPane, "FAVOR SELECIONAR OS PRODUTOS");
            cmbProduto.requestFocusInWindow();
            return;
        }
        
        int Del = JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE REALIZAR ESTA VENDA?");

        if (Del !=0) {
            return;
        }
        
        
        int NumVendas=clsdados.getNumeroVendas()+1;
        FileWriter FW = null;
        PrintWriter PW = null;

        try {
            FW = new FileWriter("Dadosbd/venda.txt",true);
            PW = new PrintWriter(FW);
            
            String aux = "1|"
                    +NumVendas+"|"
                    +(cmbProduto.getSelectedIndex()-1)+"|"
                    +(cmbProduto.getSelectedIndex()-1)+"|"
                    + txtData.getText();
            PW.println(aux);
            
            int num = tblVendas.getRowCount();
          
            for (int i = 0; i < num; i++) {
                  aux = "2|"
                   + Utilidades.objectToString(tblVendas.getValueAt(1, 0))+"|"
                   + Utilidades.objectToString(tblVendas.getValueAt(1, 1))+"|"
                   + Utilidades.objectToString(tblVendas.getValueAt(1, 2))+"|"
                   + Utilidades.objectToString(tblVendas.getValueAt(1, 3))+"|"
                   + Utilidades.objectToString(tblVendas.getValueAt(1, 4));
                  
                  PW.println(aux);
              }
              
                    
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (FW != null) {
                    FW.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } 
          JOptionPane.showMessageDialog(rootPane,"VENDA:"+ NumVendas +"VENDA REALIZADA");
          clsdados.setNvendas(NumVendas);
          cmbCliente.setSelectedIndex(0);
          Limpartabela();
          totais();
          cmbCliente.requestFocusInWindow();
    }//GEN-LAST:event_SalvarActionPerformed
    //BOTÃO DELETAR
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if(cmbProduto.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"FAVOR SELECIONAR O PRODUTO");
            cmbProduto.requestFocusInWindow();
            return;
        }
        LimparItem();
        totais();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnDeletarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarTodosActionPerformed
        // TODO add your handling code here:
        int Del = JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE DELETAR ESTA VENDA ?");

        if (Del !=0) {
            return;
        }
        Limpartabela();
        totais();
    }//GEN-LAST:event_btnDeletarTodosActionPerformed

    private void btBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaClienteActionPerformed
        frmBuscaCliente pesquisaC = new frmBuscaCliente(this, rootPaneCheckingEnabled);
        pesquisaC.setDados(clsdados);
        pesquisaC.setLocationRelativeTo(null);
        pesquisaC.setVisible(true);
        String rta = pesquisaC.getResposta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i <cmbCliente.getItemCount(); i++) {
            if ((cmbCliente.getItemAt(i)).equals(rta))   {
                cmbCliente.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btBuscaClienteActionPerformed

    private void btBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaProdutoActionPerformed
        frmBuscaProduto pesquisaP = new frmBuscaProduto(this, rootPaneCheckingEnabled);
        pesquisaP.setDados(clsdados);
        pesquisaP.setLocationRelativeTo(null);
        pesquisaP.setVisible(true);
        String rta = pesquisaP.getResposta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i <cmbProduto.getItemCount(); i++) {
            if ((cmbProduto.getItemAt(i)).equals(rta))   {
                cmbProduto.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btBuscaProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(frmControlevendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmControlevendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmControlevendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmControlevendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmControlevendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JButton btBuscaCliente;
    private javax.swing.JButton btBuscaProduto;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletarTodos;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JButton cmdAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txttotalquantidade;
    // End of variables declaration//GEN-END:variables
    private void CarregarTable(){
         String titulocabecalho[]={"ID PRODUTO","DESCRICAO","PRECO","QUANT","VALOR"};
         String RegCadastro[] = new String [5];
         Usertable= new DefaultTableModel(null,titulocabecalho);
         tblVendas.setModel(Usertable);
         
         DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
         dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
         
         tblVendas.getColumnModel().getColumn(2).setCellRenderer(dtcr);
         tblVendas.getColumnModel().getColumn(3).setCellRenderer(dtcr);
         tblVendas.getColumnModel().getColumn(4).setCellRenderer(dtcr);
         
         }
     private void totais(){
       int num = tblVendas.getRowCount();
       int somQuant = 0, somVal=0;
         for (int i = 0; i < num; i++) {
             somQuant += Utilidades.objectToInt(tblVendas.getValueAt(i, 3));
             somVal += Utilidades.objectToInt(tblVendas.getValueAt(i, 4));
         }
         txttotalquantidade.setText(""+somQuant);
         txtValor.setText(""+somVal);
     }
     
     public void Limpartabela(){
         try{
            DefaultTableModel modelo = (DefaultTableModel)tblVendas.getModel();
            int Linha = tblVendas.getRowCount();
            for(int i= 0; Linha> i; i ++){
                modelo.removeRow(0);
            }
         }catch(Exception e){
             e.printStackTrace();
         }
     
     }
     
     public void LimparItem(){
         try {
            DefaultTableModel modelo = (DefaultTableModel)tblVendas.getModel();
            int Linha = tblVendas.getRowCount();
            for(int i = 0 ; Linha> i ; i++){ 
             String idTabela = Utilidades.objectToString(tblVendas.getValueAt(i,0));
             String idCombo = ((Opcoes)cmbProduto.getSelectedItem()).getValor() + "";
             if(idTabela.equals(idCombo)){
                 modelo.removeRow(i);
                 return;
                }
            }
            
        } catch (Exception e) {
        }
     
     }
}

