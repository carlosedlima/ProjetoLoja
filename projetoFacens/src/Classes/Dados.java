
package Classes;

import java.io.FileWriter;
import java.io.PrintWriter;

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
   
  
   
    public Dados (){
        Usuarios musuario;
        
        //Criando Usuario
        musuario = new Usuarios("carlos", "Carlos", "Lima", "123", "1");
        musuarios[countusuario] = musuario;
        countusuario++;
        
        musuario = new Usuarios("Mike", "Mike", "Sista", "123", "2");
        musuarios[countusuario] = musuario;
        countusuario++;
        
        musuario = new Usuarios("Joana", "Joana", "Dark", "123", "2");
        musuarios[countusuario] = musuario;
        countusuario++;
    
        
        
      //CRIANDO OS CADASTROS DE PRODUTOS
      Produtos mproduto;
      mproduto = new Produtos("1","Arroz",500,0,"Arroz Fino");
      mprodutos[countproduto] = mproduto;
      countproduto++;
      
      
      mproduto = new Produtos("2","feijão",50,0,"Feijão carioca");
      mprodutos[countproduto] = mproduto;
      countproduto++;
      
      mproduto = new Produtos("3","Bala",20,0,"bala de yogurt");
      mprodutos[countproduto] = mproduto;
      countproduto++;
      
      
      
      //CRIANDO OS CADASTROS DE CLIENTES
      Clientes mcliente;
      mcliente = new Clientes("1",1,"Carlos","Carlos","Andorinhas Voam",
      "2512521525",1,Utilidades.StringToDate("1975/10/04"),Utilidades.StringToDate("2017/09/30"),"carlinhostop@gmail.com");
      mclientes[countcliente] = mcliente;
      countcliente++;
      
      mcliente = new Clientes("2",2,"carla","carla","peixes Nadam",
      "2512529995",2,Utilidades.StringToDate("1975/10/04"),Utilidades.StringToDate("2017/09/30"),"carlinhostop@gmail.com");
      mclientes[countcliente] = mcliente;
      countcliente++;
      
      mcliente = new Clientes("3",3,"Jorge","Jorge","Macacos pulam",
      "2512527655",3,Utilidades.StringToDate("1975/10/04"),Utilidades.StringToDate("2017/09/30"),"carlinhostop@gmail.com");
      mclientes[countcliente] = mcliente;
      countcliente++;
      
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
   
   
   
   public void CadastroGeral(){
       SalvarUsuarios();
       SalvarClientes();
       SalvarProdutos();
   }
   
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
   
   }
   
   public void SalvarProdutos(){
   
   }
}
