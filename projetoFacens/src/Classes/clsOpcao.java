
package Classes;

public class clsOpcao {
    private String valor;
    private String descricao;

    public clsOpcao(String valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    
    @Override
    public String toString() {
        return  descricao;
    }
    
    
    
    
}
