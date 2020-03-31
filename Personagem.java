public abstract class Personagem {
    protected String nome;
    protected Status status;
    protected Inventario inventario;
    protected double vida, qtdDano;
    protected int experiencia, qtdExperienciaPorAtaque;
    
    {
        status = Status.RECEM_CRIADO;
        inventario = new Inventario(0);
        experiencia = 0;
        qtdDano = 0.0;
        qtdExperienciaPorAtaque = 1;
    }
    
    public Personagem( String nome ){
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome( String nome ) {
        this.nome = nome;
    }
    
    public Status getStatus() {
        return this.status;
    }
    
    public Inventario getInventario() {
        return this.inventario;
    }
    
    public double getVida() {
        return this.vida;
    }
    
    public int getExperiencia() {
        return this.experiencia;
    }
    
    public void ganharItem( Item item ){
        this.inventario.adicionar(item);
    }
    
    public void perderItem( Item item ){
        this.inventario.remover(item);
    }
    
    public void aumentarXp() {
        experiencia = experiencia + qtdExperienciaPorAtaque;
    }

    public boolean podeSofrerDano() {
        return this.vida > 0;
    }
    
    public void sofrerDano() {
        if( this.podeSofrerDano() && this.qtdDano > 0.0 ) {
            //comparacao ? verdadeiro : falso;
            this.vida = this.vida >= this.qtdDano ?
            this.vida - this.qtdDano : 0.0;
            
            if( this.vida == 0.0 ){
                this.status = Status.MORTO;
            }else{
                this.status = Status.SOFREU_DANO;
            }
        }
    }
    
    public abstract String imprimirResumo();
    
    
    
    
    
    
    
    
    
    
}