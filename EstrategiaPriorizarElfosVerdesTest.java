import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class EstrategiaPriorizarElfosVerdesTest {

    @Test
    public void exercitoEmbaralhadoPriorizaAtaqueComElfosVerdes() {
        EstrategiaPriorizarElfosVerdes estrategia = new EstrategiaPriorizarElfosVerdes();
        Elfo night1 = new ElfoNoturno("Noturno x-men 1");
        Elfo night2 = new ElfoNoturno("Noturno x-men 2");
        Elfo green1 = new ElfoVerde("Verde 1");
        Elfo night3 = new ElfoNoturno("Noturno x-men 3");
        Elfo green2 = new ElfoVerde("Verde 2");
        Elfo night4 = new ElfoNoturno("Noturno x-men 4");
        ArrayList<Elfo> elfosEnviados = new ArrayList<>(
            Arrays.asList(night1, night2, green1, night3, green2, night4)
        );
        ArrayList<Elfo> elfosEsperados = new ArrayList<>(
            Arrays.asList(green1, green2, night1, night2, night3, night4)
        );
        ArrayList<Elfo> elfosResultado = estrategia.getOrdemAtaque(elfosEnviados);
        assertEquals(elfosEsperados, elfosResultado);
    }

}