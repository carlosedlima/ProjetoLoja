
package Classes;

import java.util.Date;


public class Clientes {
    private String idCliente;
    private int ident;
    private String Nome;
    private String Sobrenome;
    private String Endereco;
    private int Cidade;
    private String Telefone;
    private Date DataNasc;
    private Date DataVenda;
    private String Email;

    public Clientes(String idCliente, int ident, String Nome, String Sobrenome, String Endereco, int Cidade,
            String Telefone, Date DataNasc, Date DataVenda, String Email) {
        this.idCliente = idCliente;
        this.ident = ident;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.Endereco = Endereco;
        this.Cidade = Cidade;
        this.Telefone = Telefone;
        this.DataNasc = DataNasc;
        this.DataVenda = DataVenda;
        this.Email = Email;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getCidade() {
        return Cidade;
    }

    public void setCidade(int Cidade) {
        this.Cidade = Cidade;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public Date getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Date DataNasc) {
        this.DataNasc = DataNasc;
    }

    public Date getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(Date DataVenda) {
        this.DataVenda = DataVenda;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
}
