import java.util.*;

public class EstrategiaPriorizarElfosVerdes implements EstrategiaDeAtaque {

    private ArrayList<Elfo> ordenacao(ArrayList<Elfo> elfos){
        //https://www.mkyong.com/java8/java-8-lambda-comparator-example/
        Collections.sort(elfos, new Comparator<Elfo>(){
            public int compare( Elfo elfoAtual, Elfo proximoElfo ){
                boolean mesmoTipo = elfoAtual.getClass() == proximoElfo.getClass();
                
                if ( mesmoTipo ){
                    return 0;
                }
                
                return elfoAtual instanceof ElfoVerde && proximoElfo instanceof ElfoNoturno ?
                -1 : 1;
            }
        });
        return elfos;
    }
    
    public ArrayList<Elfo> getOrdemAtaque(ArrayList<Elfo> atacantes){
        return ordenacao(atacantes);
    }
}