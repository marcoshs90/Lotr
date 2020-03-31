import java.util.*;

public class ComparadorDePerformance{

    public void comparar(){
        ArrayList<Elfo> arrayElfos = new ArrayList<>();
        HashMap<String, Elfo> hashMapElfos = new HashMap<>();
        int qtdElfos = 1500000;
        for ( int i = 0; i < qtdElfos; i++ ){
            String nome = "Elfo "+ i;
            Elfo elfo = new Elfo(nome);
            arrayElfos.add(elfo);
            hashMapElfos.put(nome, elfo);
        }
        
        String nomeBusca = "Elfo 100000";
        
        long mSeqInicio = System.currentTimeMillis();
        Elfo elfoSeq = buscaSequencial(arrayElfos, nomeBusca);
        long mSeqFim = System.currentTimeMillis();
        
        long mHashInicio = System.currentTimeMillis();
        Elfo elfoMap = buscaMap(hashMapElfos, nomeBusca);
        long mHashFim = System.currentTimeMillis();
        
        String tempoSeq = String.format("%.10f", (mSeqFim - mSeqInicio) / 1000.0);
        String tempoHash = String.format("%.10f", (mHashFim - mHashInicio) / 1000.0);
        
        System.out.println("ArrayList: " + tempoSeq);
        System.out.println("HashMap: " + tempoHash);
        
    }
    
    private Elfo buscaSequencial( ArrayList<Elfo> lista, String nome ){
        for ( Elfo elfo : lista ){
            if( elfo.getNome().equals(nome) ){
                return elfo;
            }
        }
        return null;
    }
    
    private Elfo buscaMap(HashMap<String, Elfo> lista, String nome){
        return lista.get(nome);
    }
    
    
    
    
    
    
    
    
    
    
}