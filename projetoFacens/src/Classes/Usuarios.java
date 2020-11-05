package Classes;

public class Usuarios {
    private String Codusuario;
    private String nome;
    private String Snome;
    private String Senha;
    private String perfil;

    public Usuarios(String Codusuario, String nome, String Snome, String Senha, String perfil) {
        this.Codusuario = Codusuario;
        this.nome = nome;
        this.Snome = Snome;
        this.Senha = Senha;
        this.perfil = perfil;
    }

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

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    
    
}
