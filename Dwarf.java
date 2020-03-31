public class Dwarf extends Personagem{
    
    public Dwarf( String nome ) {
        super(nome);
        this.vida = 110.0;
        this.qtdDano = 10.0;
        this.ganharItem(new Item(1, "Escudo"));
    }
    
    public void equiparEscudo(){
        this.qtdDano = 5.0;
    }
    
    public String imprimirResumo(){
        return "Elfo";
    }
    
    
    
    
    
    
    
    
    
}