
package Classes;

public class Opcoes {
    private String valor;
    private String descricao;

    public String getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }


    public Opcoes(String valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
    
    
    @Override
    public String toString() {
        return descricao;
    }
    
    
    
    
    
    
}
