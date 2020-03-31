public class ItemSempreExistente extends Item {
    
    public ItemSempreExistente( int quantidade, String descricao ){
        super( quantidade, descricao );
    }
    
    @Override
    public void setQuantidade( int novaQuantidade ){
        boolean podeAlterar = novaQuantidade > 0;
        this.quantidade = podeAlterar ? novaQuantidade : 1;
    }
}