import java.util.ArrayList;
import java.util.Arrays;

public class ElfoVerde extends Elfo{

    private final ArrayList<String> DESCRICOES_VALIDAS = new ArrayList<>(
        Arrays.asList(
            "Espada de aço valiriano",
            "Arco de vidro",
            "Flecha de vidro"
        )
    );
    
    public ElfoVerde( String nome ){
        super(nome);
        this.qtdExperienciaPorAtaque = 2;
    }
    
    @Override
    public void ganharItem( Item item ){
        boolean descricaoValida = DESCRICOES_VALIDAS.contains(item.getDescricao());
        if (descricaoValida) {
            this.inventario.adicionar(item);
        }
    }
    
    @Override
    public void perderItem( Item item ){
        boolean descricaoValida = DESCRICOES_VALIDAS.contains(item.getDescricao());
        if (descricaoValida) {
            this.inventario.remover(item);
        }
    }
    
    
    
    
    
    
    
}