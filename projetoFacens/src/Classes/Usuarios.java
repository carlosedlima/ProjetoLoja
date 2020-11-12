package Classes;

public class Usuarios {
    private String Codusuario;
    private String nome;
    private String Snome;
    private String Senha;
    private int perfil;
    
    //CONSTRUTOR DOS Usuarios
    
    public Usuarios(String Codusuario, String nome, String Snome, String Senha, int perfil) {
        this.Codusuario = Codusuario;
        this.nome = nome;
        this.Snome = Snome;
        this.Senha = Senha;
        this.perfil = perfil;
    }

    
    // ABAIXO TODOS OS GET SETTERS DE USUARIOS
    
    
    
    
    public String getCodusuario() {
        return Codusuario;
    }

    public void setCodusuario(String Codusuario) {
        this.Codusuario = Codusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return Snome;
    }

    public void setSnome(String Snome) {
        this.Snome = Snome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    

    
    
    
    
    // TODO CÒDIGO A SEGUIR E TEMPORARIO PRO BANCO DE DADOS TXT
    
    
   public String ToString(){
        return Codusuario + "-"
                
                + nome + "-"
                + Snome + "-"
                + Senha + "-"
                + perfil;
    }
   


}
