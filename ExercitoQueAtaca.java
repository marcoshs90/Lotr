import java.util.*;

public class ExercitoQueAtaca extends ExercitoDeElfos {
    private EstrategiaDeAtaque estrategia;
    
    public ExercitoQueAtaca( EstrategiaDeAtaque estrategia ){
        this.estrategia = estrategia;
    }
    
    public void trocarEstrategia( EstrategiaDeAtaque estrategia ){
        this.estrategia = estrategia;
    }
    
    public void atacar(ArrayList<Dwarf> dwarves) {
        ArrayList<Elfo> ordem = this.estrategia.getOrdemAtaque(this.getElfos());
        for (Elfo elfo : ordem) {
            for (Dwarf dwarf : dwarves) {
                elfo.atirarFlecha(dwarf);
            }
        }
    }
    
    
    
    
    
    
    
    
}
