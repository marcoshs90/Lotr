import java.util.*;

public class ExercitoDeElfos {
    
    private final ArrayList<Class> TIPOS_PERMITIDOS = new ArrayList<>(
        Arrays.asList(
            ElfoVerde.class,
            ElfoNoturno.class
        )
    );
    
    private ArrayList<Elfo> elfos = new ArrayList<>();
    private HashMap<Status, ArrayList<Elfo>> porStatus = new HashMap<>();
    
    public void alistar( Elfo elfo ){
        boolean podeAlistar = TIPOS_PERMITIDOS.contains(elfo.getClass());
        if ( podeAlistar ){
            elfos.add(elfo);
            ArrayList<Elfo> elfoDoStatus = porStatus.get( elfo.getStatus() );
            if ( elfoDoStatus == null ){
                elfoDoStatus = new ArrayList<>();
                porStatus.put(elfo.getStatus(), elfoDoStatus);
            }
            elfoDoStatus.add(elfo);
        }
    }
    
    public ArrayList<Elfo> getElfos(){
        return this.elfos;
    }
    
    public ArrayList<Elfo> buscar( Status status ){
        return this.porStatus.get(status);
    }
    
    
    
    
    
    
    
    
    
    
    
}