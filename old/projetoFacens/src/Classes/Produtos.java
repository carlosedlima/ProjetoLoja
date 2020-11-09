
package Classes;

public class Produtos {
    private String codProduto;
    private String descricao;
    private int preco;
    private int taxa;
    private String obs;

    public Produtos(String codProduto, String descricao, int preco, int taxa, String obs) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.preco = preco;
        this.taxa = taxa;
        this.obs = obs;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
    
    
}
