public class Item {

    protected int quantidade;
    private String descricao;
    
    public Item(int quantidade, String descricao) {
        this.quantidade = quantidade;
        this.descricao = descricao;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public boolean equals( Object obj ){
        Item outroItem = (Item)obj;
        return this.quantidade == outroItem.getQuantidade() &&
                this.descricao.equals(outroItem.getDescricao());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}