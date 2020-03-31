
/* Classe elfo */
public class Elfo extends Personagem {
    private int indiceFlecha;
    private static int qtdElfos;
    
    {
        indiceFlecha = 0;
    }
    
    public Elfo( String nome ){
        super(nome);
        this.vida = 100.0;
        this.inventario.adicionar( new Item(2, "Flecha") );
        this.inventario.adicionar( new Item(1, "Arco") );
        Elfo.qtdElfos++;
    }
    
    protected void finalize() throws Throwable {
        Elfo.qtdElfos--;
    }
    
    public static int getQtdElfos() {
        return Elfo.qtdElfos;
    }
    
    public Item getFlecha() {
        return this.inventario.obter(indiceFlecha);
    }
    
    public int getQtdFlecha() {
        return this.getFlecha().getQuantidade();
    }
    
    public boolean podeAtirarFlecha() {
        return this.getQtdFlecha() > 0;
    } 
    
    public void atirarFlecha( Dwarf dwarf ){
        if( podeAtirarFlecha() ) {
            this.getFlecha().setQuantidade( this.getQtdFlecha() - 1 );
            //this.experiencia = experiencia + 1;
            this.aumentarXp();
            dwarf.sofrerDano();
            this.sofrerDano();
        }
    }
    
    public String imprimirResumo(){
        return "Elfo";
    }
    
    
    
    
    
    
}
