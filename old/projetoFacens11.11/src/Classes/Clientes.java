
package Classes;

import java.util.Date;


public class Clientes {
    private String CodigoCliente;
    private int Indent;
    private String Nome;
    private String Sobrenome;
    private String Endereco;
    private int Cidade;
    private String Telefone;
    private Date DataNasc;
    private Date DataVenda;
    private String Email;

    
    // CONSTRUTOR DO CLIENTE
    
    public Clientes(String CodigoCliente,int Indent, String Nome,String Sobrenome,String Endereco, String Telefone, int Cidade,Date DataNasc, Date DataVenda, String Email) {
        this.CodigoCliente = CodigoCliente;
        this.Indent = Indent;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.Endereco = Endereco;
        this.Cidade = Cidade;
        this.Telefone = Telefone;
        this.DataNasc = DataNasc;
        this.DataVenda = DataVenda;
        this.Email = Email;
    }

    /*
    
        TODOS OS CODIGOS ABAIXO SÃO
        GETS E SETTERS DA CLASSE CLIENTE
        
    
    */
    
    
    public String getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(String CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    public int getIndent() {
        return Indent;
    }

    public void setIndent(int Indent) {
        this.Indent = Indent;
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

    
    /*
    
        TODO CÓDIGO A SEGUIR É TEMPORARIO PARA O FUNCINAMENTO DE UM BD EM TXT
    
    */
    
    
    public String Tostring(){
        return CodigoCliente + "-"
         + Indent + "-"
         + Nome + "-"
         + Sobrenome + "-"
         + Endereco + "-"
         + Cidade + "-"
         + DataNasc + "-"
         + DataVenda + "-"
         + Email;       
    }
    
    
    
    
    
    
    
    
   
    
    
    
}

