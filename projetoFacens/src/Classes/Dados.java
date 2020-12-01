
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Dados {
   
   //Variaveis dos usuarios
   private int maxUsuarios = 150; 
   private Usuarios musuarios[] = new Usuarios[maxUsuarios];
   private int countusuario = 0; 
   
   
   //Variasveis dos Produtos
   private int maxProdutos = 150;
   private Produtos mprodutos[] = new Produtos[maxProdutos];
   private int countproduto = 0;
   
   //Variasveis dos clientes
   private int maxClientes = 150;
   private Clientes mclientes[] = new Clientes[maxClientes];
   private int countcliente = 0;
   
   
   //Aqui são os dados ja inicias do programa
  
   
    public Dados (){
        //CARREGANDO USUARIOS
      PreencherUsuarios();
    
      //CRIANDO OS CADASTROS DE PRODUTOS
       PreencherProdutos();
     
      //CRIANDO OS CADASTROS DE CLIENTES
      
      PreencherClientes();
      
    }
    
    //CONFIGURAÇÃO DOS DADOS PARA O USUARIO
    
    public int Nusuarios(){
        return countusuario;
    
    }
    
    public Usuarios[] getUsuarios(){
        return musuarios;
    }
    
    public boolean validarUsuarios (String usuario, String senha){
        boolean x = false;
        
        for (int i=0; i < countusuario; i++) {
            if (musuarios[i].getCodusuario().equals(usuario) && musuarios[i].getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
    
    public int getPerfl (String usuario){
        
        for (int i=0; i < countusuario; i++) {
            if (musuarios[i].getCodusuario().equals(usuario)) {
                return musuarios[i].getPerfil();
            }
        }
        return -1;
    }
    
    
    public void Altersenha (String usuario,String senha){
        
        for (int i=0; i < countusuario; i++) {
            if (musuarios[i].getCodusuario().equals(usuario)) {
                musuarios[i].setSenha(senha);
            }
        }
    }
    
    
    
   public int LinhaUsuario (String usuario){
       for (int i=0; i < countusuario; i++) {
           if (musuarios[i].getCodusuario().equals(usuario)) {
               return i;
           }
       }
       return -1;
    }
    
   //CONFIGURAÇÃO DOS DADOS PARA PRODUTOS
   
       public int Nprodutos(){
        return countproduto;
    
    }
    
        public Produtos[] getProdutos(){
        return mprodutos;
    }
   
    public int LinhaProduto (String produto){
       for (int i=0; i < countproduto; i++) {
           if (mprodutos[i].getCodProduto().equals(produto)) {
               return i;
           }
       }
       return -1;
    }
   
   
    
    //CONFIGURAÇÃO DOS DADOS PARA CLIENTES
    
    public int Nclientes(){
        return countcliente;
    
    }
    
    public Clientes[] getClientes(){
        return mclientes;
    }
   
    public int LinhaCliente (String cliente){
       for (int i=0; i < countcliente; i++) {
           if (mclientes[i].getCodigoCliente().equals(cliente)) {
               return i;
           }
       }
       return -1;
    }
   
   
   
   //TODOS OS METODOS A BAIXO FAZEM REFERENCIA AS FUNÇÕES DE CADA BOTÃO.
   //ADICIONAR
   //Adcionar Usuario
   public String CadastroUsuario(Usuarios MMusuario){
       if (countusuario == maxUsuarios){
           return "NÃO A MAIS ESPAÇO";
       }
       
   musuarios[countusuario]=MMusuario;
   countusuario++;
   return "USUARIO CADASTRADO COM SUCESSO";
   }
   //Adicionar Produto
   public String CadastroProduto(Produtos MMproduto){
       if (countproduto == maxProdutos){
           return "NÃO A MAIS ESPAÇO";
       }
       
   mprodutos[countproduto]=MMproduto;
   countproduto++;
   return "PRODUTO CADASTRADO COM SUCESSO";
   }
   //Adicionar Cliente
   public String CadastroCliente(Clientes MMcliente){
       if (countcliente == maxClientes){
           return "NÃO A MAIS ESPAÇO";
       }
       
   mclientes[countproduto]=MMcliente;
   countcliente++;
   return "CLIENTE CADASTRADO COM SUCESSO";
   }
   
   
   //EDITAR
   //Editar Usuario
   public String EditarUsuario(Usuarios MMusuario, int poslinha){
   musuarios[poslinha].setNome(MMusuario.getNome());
   musuarios[poslinha].setSnome(MMusuario.getSnome());
   musuarios[poslinha].setSenha(MMusuario.getSenha());
   musuarios[poslinha].setPerfil(MMusuario.getPerfil());
   
   return "USUARIO EDITADO COM SUCESSO";
   }
   //Editar Produto
   public String EditarProduto(Produtos MMproduto, int poslinha){
   mprodutos[poslinha].setDescricao(MMproduto.getDescricao());
   mprodutos[poslinha].setPreco(MMproduto.getPreco());
   mprodutos[poslinha].setTaxa(MMproduto.getTaxa());
   mprodutos[poslinha].setObs(MMproduto.getObs());
   
   return "PRODUTO EDITADO COM SUCESSO";
   } 
   //Editar Cliente
   public String EditarCliente(Clientes MMcliente, int poslinha){
   mclientes[poslinha].setIndent(MMcliente.getIndent());
   mclientes[poslinha].setNome(MMcliente.getNome());
   mclientes[poslinha].setSobrenome(MMcliente.getSobrenome());
   mclientes[poslinha].setEndereco(MMcliente.getEndereco());
   mclientes[poslinha].setTelefone(MMcliente.getTelefone());
   mclientes[poslinha].setDataNasc(MMcliente.getDataNasc());
   mclientes[poslinha].setDataVenda(MMcliente.getDataVenda());
   mclientes[poslinha].setEmail(MMcliente.getEmail());
   
   
   return "CLIENTE EDITADO COM SUCESSO";
   } 
   
   
   //DELETAR
   //Deletar Usuario
   public String DeletarUsuario(int poslinha){
       for(int i= poslinha;i<countusuario-1; i++){
           musuarios[i]=musuarios[i+1];
       }
       countusuario--;
   return"USUARIO DELETADO COM SUCESSO";
   }
   //Deletar Produto
   public String DeletarProduto(int poslinha){
      for(int i= poslinha;i<countproduto-1; i++){
           mprodutos[i]=mprodutos[i+1];
       }
       countproduto--;
   return"PRODUTO DELETADO COM SUCESSO";
   }
   //Deletar Cliente
   public String DeletarCliente(int poslinha){
    for(int i= poslinha;i<countcliente-1; i++){
           mclientes[i]=mclientes[i+1];
       }
       countcliente--;
   return"CLIENTE DELETADO COM SUCESSO";
   }
   
  /*
    
   TODO CÓDIGO A BAIXO FAZ REFERENCIA AS FUNÇÕES DO BD IMPROVISADO COM TXT
   
   */
   
   
   //FUNÇÃO CHAMADA AO SAIR DO FORMULARIO
   public void CadastroGeral(){
       SalvarUsuarios();
       SalvarClientes();
       SalvarProdutos();
   }
   //SALVANDO DADOS NO TXT
   public void SalvarUsuarios(){
      FileWriter FW= null;
      PrintWriter PW= null;
      
      try{
          FW = new FileWriter("Dadosbd/usuarios.txt");
          PW = new PrintWriter(FW);
          
          
          for (int i = 0; i < countusuario; i++) {
              PW.println(musuarios[i].ToString());
          }
      }catch(Exception e1){
      e1.printStackTrace();
      }finally{
          try{
              if(FW!=null){
                 FW.close();
              }
          }catch(Exception e2){
              e2.printStackTrace();
          }
        }
      }

   public void SalvarClientes(){
      FileWriter FW= null;
      PrintWriter PW= null;
      
      try{
          FW = new FileWriter("Dadosbd/clientes.txt");
          PW = new PrintWriter(FW);
          
          
          for (int i = 0; i < countcliente; i++) {
              PW.println(mclientes[i].ToString());
          }
      }catch(Exception e1){
      e1.printStackTrace();
      }finally{
          try{
              if(FW!=null){
                 FW.close();
              }
          }catch(Exception e2){
              e2.printStackTrace();
          }
        }
   }
   
   public void SalvarProdutos(){
         FileWriter FW= null;
      PrintWriter PW= null;
      
      try{
          FW = new FileWriter("Dadosbd/produtos.txt");
          PW = new PrintWriter(FW);
          
          
          for (int i = 0; i < countproduto; i++) {
              PW.println(mprodutos[i].ToString());
          }
      }catch(Exception e1){
      e1.printStackTrace();
      }finally{
          try{
              if(FW!=null){
                 FW.close();
              }
          }catch(Exception e2){
              e2.printStackTrace();
          }
        }
   }
   
   
   //CARREGAMENTO DOS DADOS ATRAVES DO TXT
   
   public void PreencherUsuarios(){
       File Arquivo = null;
       FileReader Fr = null;
       BufferedReader BR= null;
       
       try {
           Arquivo = new File("Dadosbd/usuarios.txt");
           Fr = new FileReader(Arquivo);
           BR = new BufferedReader(Fr);
           
           int pos;
           String Ax;
           String Codusuario;
           String Linha;
           String nome;
           String Snome;
           String senha;
           int perfil;
           
           
           
           while ((Linha = BR.readLine()) !=null) {               
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               Codusuario= Ax;
               
               Linha= Linha.substring(pos + 1);
               
               //CARREGANDO NOME
               
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               nome= Ax;
               
               Linha= Linha.substring(pos + 1);
               
               
               //CARREGANDO SOBRENOME
               
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               Snome= Ax;
               
               Linha= Linha.substring(pos + 1);
               
               // CARREGANDO SENHA
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               senha= Ax;
               
               
               Linha= Linha.substring(pos + 1);
               perfil = new Integer(Linha);
               
               
               Usuarios musuario;
        
               //Criando Usuario
               musuario = new Usuarios(Codusuario, nome, Snome, senha, perfil);
               musuarios[countusuario] = musuario;
               countusuario++;
               
               
           }
           
       } catch (Exception ex) {
           ex.printStackTrace();
       }finally{
           try {
               if (Fr !=null) {
                   Fr.close();
               }
           } catch (Exception ex) {
               ex.printStackTrace();
           }
       
       
       }
       
       
       
       
   }
   
   public void PreencherProdutos(){
       File Arquivo = null;
       FileReader Fr = null;
       BufferedReader BR= null;
       
       try {
           Arquivo = new File("Dadosbd/produtos.txt");
           Fr = new FileReader(Arquivo);
           BR = new BufferedReader(Fr);
           
           int pos;
           String Ax;
           String Linha;
           
           String codProduto;
           String descricao;
           int preco;
           int taxa;
           String obs;
           
           while ((Linha = BR.readLine()) !=null) {
               //CARREGANDO CODIGO PRODUTO
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               codProduto= Ax;
               Linha= Linha.substring(pos + 1);
               
               //CARREGANDO DESCRIÇÃO
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               descricao= Ax;
               Linha= Linha.substring(pos + 1);
               
               
               //CARREGANDO PRECO
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               preco= new Integer(Ax);
               Linha= Linha.substring(pos + 1);
               
               // CARREGANDO TAXA
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               taxa= new Integer(Ax);
               Linha= Linha.substring(pos + 1);
               obs = Linha;
               
               
               
        
               //Criando Produto
               
               Produtos mproduto;
               mproduto = new Produtos(codProduto,descricao,preco,taxa,obs);
               mprodutos[countproduto] = mproduto;
               countproduto++;
               
           }
           
       } catch (Exception ex) {
           ex.printStackTrace();
       }finally{
           try {
               if (Fr !=null) {
                   Fr.close();
               }
           } catch (Exception ex) {
               ex.printStackTrace();
           }
       
       
       }
       
       
       
       
   }
   
   public void PreencherClientes(){
       File Arquivo = null;
       FileReader Fr = null;
       BufferedReader BR= null;
       
       try {
           Arquivo = new File("Dadosbd/clientes.txt");
           Fr = new FileReader(Arquivo);
           BR = new BufferedReader(Fr);
           
           int pos;
           String Ax;
           String Linha;
           
           String CodigoCliente;
           int Indent;
           String Nome;
           String Sobrenome;
           String Endereco;
           int Cidade;
           String Telefone;
           Date DataNasc;
           Date DataVenda;
           String Email;
           
           
           
           while ((Linha = BR.readLine()) !=null) {
               //CARREGANDO CODIGO CLIENTE
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               CodigoCliente= Ax;
               
               Linha= Linha.substring(pos + 1);
               
               //CARREGANDO INDENTIDADE
               
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               Indent= new Integer(Ax);
               
               Linha= Linha.substring(pos + 1);
               
               
               //CARREGANDO NOME
               
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               Nome= Ax;
               
               Linha= Linha.substring(pos + 1);
               
               // CARREGANDO SOBRENOME
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               Sobrenome= Ax;
               
               Linha= Linha.substring(pos + 1);
             
               // CARREGANDO ENDEREÇO
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               Endereco= Ax;
               
               Linha= Linha.substring(pos + 1);
                
               // CARREGANDO TELEFONE
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               Telefone= Ax;
               
               Linha= Linha.substring(pos + 1);
               
               // CARREGANDO CIDADE
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               Cidade= new Integer(Ax);
               
               Linha= Linha.substring(pos + 1);
               
               
               // CARREGANDO DATA NASCIMENTO
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               DataNasc= Utilidades.StringToDate(Ax);
               
              
              
               
               Linha= Linha.substring(pos + 1);
               
               
               // CARREGANDO DATA VENDA
               pos = Linha.indexOf("-");
               Ax = Linha.substring(0,pos);
               DataVenda= Utilidades.StringToDate(Ax);
               
               Linha= Linha.substring(pos + 1);
               // CARREGANDO EMAIL
               Email= Linha;
               
               
               //CRIANDO CLIENTE
               Clientes mcliente;
               mcliente = new Clientes(CodigoCliente,Indent,Nome,Sobrenome,Endereco,
               Telefone,Cidade,DataNasc,DataVenda,Email);
               mclientes[countcliente] = mcliente;
               countcliente++;
               
               
           }
           
       } catch (Exception ex) {
           ex.printStackTrace();
       }finally{
           try {
               if (Fr !=null) {
                   Fr.close();
               }
           } catch (Exception ex) {
               ex.printStackTrace();
           }
       
       
       }
       
       
       
       
   }
   
}
