
package Classes;

public class Dados {
   
    
    
   private int maxUsuarios = 150; 
   private int maxClientes = 150;
   private Usuarios musuarios[] = new Usuarios[maxUsuarios];
   private Clientes mClientes[] = new Clientes[maxClientes];
   
   private int countusuario = 0; 
   private int conCli = 0;
   
   
   
   
   
   
    public Dados (){
        
        
        //Criando Usuario
        Usuarios musuario = new Usuarios("carlos", "carlos", "carlos", "123", "1");
        
        musuarios[countusuario] = musuario;
        countusuario++;
        
        
        //Criando clientes
        Clientes mCliente = null;
        
        mClientes[conCli]=mCliente;
        conCli++;
        
        
        
        
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
    
}
