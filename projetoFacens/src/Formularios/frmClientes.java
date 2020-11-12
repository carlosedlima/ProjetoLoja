package Formularios;


import Classes.Clientes;
import java.util.Date;
import javax.swing.JOptionPane;
import Classes.Dados;
import javax.swing.table.DefaultTableModel;

public class frmClientes extends javax.swing.JFrame {

private Dados clsdados;
private int clienteAtual=0;
private boolean cmdnovo = false;
private DefaultTableModel Usertable;
    
public void setDados(Dados clsdados){
    this.clsdados = clsdados;
}
    
    public frmClientes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        cmbidentifica = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNomeC = new javax.swing.JTextField();
        txtSobrenomeC = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        calNascimento = new com.toedter.calendar.JDateChooser();
        cmbCidade = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        calData = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mtable = new javax.swing.JTable();
        cmdDeletar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();
        cmdAdicionar = new javax.swing.JButton();
        cmdProximo = new javax.swing.JButton();
        cmdNovo = new javax.swing.JButton();
        cmdAnterior = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        cmdPrimeiro = new javax.swing.JButton();
        cmdPesquisar = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadadstro Clientes");
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
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(602, 1194));
        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 20, 20);

        txtCodigoCliente.setBackground(new java.awt.Color(51, 61, 71));
        txtCodigoCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCodigoCliente.setEnabled(false);
        txtCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoCliente);
        txtCodigoCliente.setBounds(40, 20, 110, 20);

        cmbidentifica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ID", "CPF", "RG", "CNPJ", " " }));
        cmbidentifica.setEnabled(false);
        cmbidentifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbidentificaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbidentifica);
        cmbidentifica.setBounds(240, 20, 129, 26);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("identificação:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 20, 80, 20);

        txtNomeC.setBackground(new java.awt.Color(51, 61, 71));
        txtNomeC.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNomeC.setEnabled(false);
        txtNomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomeC);
        txtNomeC.setBounds(20, 60, 490, 20);

        txtSobrenomeC.setBackground(new java.awt.Color(51, 61, 71));
        txtSobrenomeC.setForeground(new java.awt.Color(255, 255, 255));
        txtSobrenomeC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSobrenomeC.setEnabled(false);
        txtSobrenomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeCActionPerformed(evt);
            }
        });
        jPanel1.add(txtSobrenomeC);
        txtSobrenomeC.setBounds(20, 100, 490, 20);

        txtEndereco.setBackground(new java.awt.Color(51, 61, 71));
        txtEndereco.setForeground(new java.awt.Color(255, 255, 255));
        txtEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEndereco.setEnabled(false);
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(txtEndereco);
        txtEndereco.setBounds(20, 140, 490, 20);

        txtTelefone.setBackground(new java.awt.Color(51, 61, 71));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefone.setEnabled(false);
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefone);
        txtTelefone.setBounds(80, 170, 110, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 170, 60, 20);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Endereco:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 120, 60, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("S-Nome:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 80, 50, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 40, 50, 16);

        calNascimento.setBackground(new java.awt.Color(51, 61, 71));
        calNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(calNascimento);
        calNascimento.setBounds(251, 170, 148, 29);

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Cidade", "Sorocaba", "São Paulo", "Campinas" }));
        cmbCidade.setEnabled(false);
        cmbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCidade);
        cmbCidade.setBounds(400, 170, 90, 26);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cidade:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(350, 170, 50, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(370, 20, 30, 20);

        calData.setBackground(new java.awt.Color(51, 61, 71));
        calData.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(calData);
        calData.setBounds(400, 20, 148, 29);

        Mtable.setBackground(new java.awt.Color(51, 61, 71));
        Mtable.setForeground(new java.awt.Color(255, 255, 255));
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
        jScrollPane1.setBounds(20, 260, 560, 295);

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
        cmdDeletar.setBounds(540, 100, 40, 46);

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
        cmdCancelar.setBounds(540, 210, 40, 40);

        cmdUltimo.setBackground(new java.awt.Color(51, 61, 71));
        cmdUltimo.setForeground(new java.awt.Color(255, 255, 255));
        cmdUltimo.setToolTipText("Ultimo");
        cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdUltimo);
        cmdUltimo.setBounds(140, 560, 30, 30);

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
        cmdAdicionar.setBounds(540, 170, 40, 46);

        cmdProximo.setBackground(new java.awt.Color(51, 61, 71));
        cmdProximo.setForeground(new java.awt.Color(255, 255, 255));
        cmdProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/030-next-2.png"))); // NOI18N
        cmdProximo.setToolTipText("Proximo");
        cmdProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProximoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdProximo);
        cmdProximo.setBounds(100, 560, 30, 36);

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
        cmdNovo.setBounds(540, 20, 40, 40);

        cmdAnterior.setBackground(new java.awt.Color(51, 61, 71));
        cmdAnterior.setForeground(new java.awt.Color(255, 255, 255));
        cmdAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/030-next-2-invertido.png"))); // NOI18N
        cmdAnterior.setToolTipText("Anterior");
        cmdAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAnterior);
        cmdAnterior.setBounds(70, 560, 30, 36);

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
        cmdEditar.setBounds(540, 60, 40, 40);

        cmdPrimeiro.setBackground(new java.awt.Color(51, 61, 71));
        cmdPrimeiro.setForeground(new java.awt.Color(255, 255, 255));
        cmdPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/042-next-1-invertido.png"))); // NOI18N
        cmdPrimeiro.setToolTipText("Primeiro");
        cmdPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrimeiroActionPerformed(evt);
            }
        });
        jPanel1.add(cmdPrimeiro);
        cmdPrimeiro.setBounds(30, 560, 30, 30);

        cmdPesquisar.setBackground(new java.awt.Color(51, 61, 71));
        cmdPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        cmdPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/024-loupe.png"))); // NOI18N
        cmdPesquisar.setToolTipText("Buscar");
        cmdPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdPesquisar);
        cmdPesquisar.setBounds(550, 560, 30, 36);

        txtEmail.setBackground(new java.awt.Color(51, 61, 71));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.setEnabled(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(20, 220, 490, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("E-mail");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 200, 50, 16);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("D-Nasc:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(200, 170, 50, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoClienteActionPerformed

    private void cmbidentificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbidentificaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbidentificaActionPerformed

    private void txtNomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCActionPerformed

    private void txtSobrenomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeCActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void cmbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCidadeActionPerformed

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

    private void cmdUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUltimoActionPerformed
        // ESTE È O CODIGO DO BOTÃO ULTIMO CADASTRO DO FORMULARIO CLIENTES
        clienteAtual = clsdados.Nclientes()-1;
        visualizarCadastros();
    }//GEN-LAST:event_cmdUltimoActionPerformed
        //VALIDANDO CAMPOS NO FORMULARIO CADASTRO DE CLIENTES
    private void cmdAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdicionarActionPerformed
        //VALIDANDO CAMPOS NO FORMULARIO CADASTRO DE CLIENTES

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
            cmbidentifica.getSelectedIndex(),
            txtNomeC.getText(),
            txtSobrenomeC.getText(),
            txtEndereco.getText(),
            txtTelefone.getText(),
            cmbCidade.getSelectedIndex(),
            calData.getDate(),
            calNascimento.getDate(),
            txtEmail.getText());//OBJETO mCliente quebrado em linhas
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
        // BOTÃO PROXIMO ITEM
    private void cmdProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProximoActionPerformed
        // BOTÃO PROXIMO ITEM
        clienteAtual ++;
        if (clienteAtual == clsdados.Nclientes()) {
            clienteAtual=0;
        }
        visualizarCadastros();
    }//GEN-LAST:event_cmdProximoActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO NOVO DO FORMULARÍO CADASTRO
    private void cmdNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNovoActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO NOVO DO FORMULARÍO CADASTRO

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
        // CODIGO DO BOTÂO ANTERIOR
    private void cmdAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnteriorActionPerformed
        // CODIGO DO BOTÂO ANTERIOR

        clienteAtual --;
        if (clienteAtual == -1) {
            clienteAtual= clsdados.Nclientes()-1;
        }

        visualizarCadastros();

    }//GEN-LAST:event_cmdAnteriorActionPerformed
        // ESTE É O CÓDIGO DO BOTÃO EDITAR DO FORMULARÍO CLIENTES
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
        // ESTE È O BOTÂO PRIMEIRO DO FORMULARIO
    private void cmdPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrimeiroActionPerformed
        // ESTE È O BOTÂO PRIMEIRO DO FORMULARIO USUARIOS
        clienteAtual=0;
        visualizarCadastros();
    }//GEN-LAST:event_cmdPrimeiroActionPerformed
        // ESTE CÓDIGO É DO BOTÃO PESQUISAR
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
        //inutil
    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed
        //Evento que carrega os dados na tabela ao abrir
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        visualizarCadastros();
        CarregarTable();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientes().setVisible(true);
            }
        });
    }
    
    /*
    OS CODIGOS A BAIXO POR ENQUANTO SÃO TEMPORARIOS ELES SÃO RESPONSAVEIS DE CARREGAR OS DADOS NO FORMULARIO E
    NAS TABELAS POR TANTO NÃO HÁ NECESSIDADE DE ALTERALAS ATÉ A IMPLEMENTAÇÃO DO BD
    */
    
    
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
    private com.toedter.calendar.JDateChooser calData;
    private com.toedter.calendar.JDateChooser calNascimento;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeC;
    private javax.swing.JTextField txtSobrenomeC;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
