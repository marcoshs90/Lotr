import java.util.*;

public class Inventario{
    private ArrayList<Item> itens;
    
    public Inventario( int quantidade ) {
        this.itens = new ArrayList<Item>(quantidade);
    }
    
    public ArrayList<Item> getItens() {
        return this.itens;
    }
    
    public Item obter( int posicao ) {
        if( posicao >= this.itens.size() ) {
            return null;
        }
        return this.itens.get(posicao);
    }
    
    public void remover( Item item ) {
        this.itens.remove(item);
    }
    
    public void adicionar( Item item ){
        this.itens.add(item);
    }
    
    public String getDescricoesItens() {
        StringBuilder descricoes = new StringBuilder();
        for ( int i = 0; i < this.itens.size(); i++ ){
            Item item = this.itens.get(i);
            if ( item != null){
                descricoes.append(item.getDescricao());
                descricoes.append(",");
            }
        }
        
        return (descricoes.length() > 0 ?
        descricoes.substring(0, (descricoes.length() - 1)) :
        descricoes.toString()
        );
    }
    
    public Item getItemComMaiorQuantidade(){
        int indice = 0, maiorQuantidade = 0;
        
        for ( int i = 0; i < this.itens.size(); i++ ){
            Item item = this.itens.get(i);
            if ( item != null){
                if ( item.getQuantidade() > maiorQuantidade ) {
                    maiorQuantidade = item.getQuantidade();
                    indice = i;
                }
            }
        }
        
        return this.itens.size() > 0 ? this.itens.get(indice) : null;
    }
    
    
    public Item buscar( String descricao ){
        for ( Item itemAtual : this.itens ) {
            boolean encontrei = itemAtual.getDescricao().equals(descricao);
            if( encontrei ){
                return itemAtual;
            }
        }
        return null;
    }
    
    public ArrayList<Item> inverter(){
        ArrayList<Item> listaInvertida = new ArrayList<>(this.itens.size());
        
        for ( int i = this.itens.size() - 1; i >= 0; i--){
            listaInvertida.add(this.itens.get(i));
        }
        
        return listaInvertida;
    }
    
    public void ordenarItens(){
        this.ordenarItens(TipoOrdenacao.ASC);
    }
    
    public void ordenarItens(TipoOrdenacao ordenacao){
        for ( int i = 0; i < this.itens.size(); i++ ){
            for ( int j = 0; j < this.itens.size() - 1; j++){
                Item atual = this.itens.get(j);
                Item proximo = this.itens.get(j + 1);
                
                boolean deveTrocar = ordenacao == TipoOrdenacao.ASC ? 
                atual.getQuantidade() > proximo.getQuantidade() :
                atual.getQuantidade() < proximo.getQuantidade();
                
                if( deveTrocar ){
                    Item itemTrocado = atual;
                    this.itens.set(j, proximo);
                    this.itens.set(j + 1, itemTrocado);
                }
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}