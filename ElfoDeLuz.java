import java.util.*;

public class ElfoDeLuz extends Elfo{

    private int qtdAtaques;
    private final double QTD_VIDA_GANHA = 10;
    
    {
        qtdAtaques = 0;
    }
    
    private final ArrayList<String> DESCRICOES_OBRIGATORIAS = new ArrayList<>(
        Arrays.asList(
            "Espada de galvorn"
        )
    );
    
    public ElfoDeLuz( String nome ){
        super(nome);
        super.ganharItem(new ItemSempreExistente(1, DESCRICOES_OBRIGATORIAS.get(0)));
    }
    
    public boolean devePerderVida(){
        return qtdAtaques % 2 == 1;
    }
    
    public void ganharVida(){
        vida += QTD_VIDA_GANHA;
    }
    
    public void perderItem( Item item ){
        boolean possoPerder = !DESCRICOES_OBRIGATORIAS.contains(item.getDescricao());
        if (possoPerder){
            super.perderItem(item);
        }
    }
    
    public void atacarComEspada( Dwarf dwarf ){
        if( this.getStatus() != Status.MORTO ){
            dwarf.sofrerDano();
            this.aumentarXp();
            qtdAtaques++;
            if(devePerderVida()){
                this.qtdDano = 21.0;
                this.sofrerDano();
                this.qtdDano = 0.0;
            }else{
                this.ganharVida();
            }
        }
    }
    
    
    
    
    
    
    
}