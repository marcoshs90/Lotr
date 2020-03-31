import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoNoturnoTest {

    @Test
    public void elfoNoturnoGanha3XpAoAtirarFlecha() {
        Elfo elfoNoturno = new ElfoNoturno("Noturno");
        elfoNoturno.atirarFlecha(new Dwarf("Gimli"));
        assertEquals(3, elfoNoturno.getExperiencia());
    }
    
    @Test
    public void elfoNoturnoAtiraFlechaEPerde15() {
        Elfo elfoNoturno = new ElfoNoturno("Noturno");
        elfoNoturno.atirarFlecha(new Dwarf("Gimli"));
        assertEquals(85.0, elfoNoturno.getVida(), 1e-9 );
        assertEquals(Status.SOFREU_DANO, elfoNoturno.getStatus());
    }

    @Test
    public void elfoNoturnoAtira7FlechasEMorre() {
        Elfo elfoNoturno = new ElfoNoturno("Noturno");
        elfoNoturno.getFlecha().setQuantidade(1000);
        elfoNoturno.atirarFlecha(new Dwarf("Gimli"));
        elfoNoturno.atirarFlecha(new Dwarf("Gimli"));
        elfoNoturno.atirarFlecha(new Dwarf("Gimli"));
        elfoNoturno.atirarFlecha(new Dwarf("Gimli"));
        elfoNoturno.atirarFlecha(new Dwarf("Gimli"));
        elfoNoturno.atirarFlecha(new Dwarf("Gimli"));
        elfoNoturno.atirarFlecha(new Dwarf("Gimli"));
        assertEquals(0.0, elfoNoturno.getVida(), 1e-9 );
        assertEquals(Status.MORTO, elfoNoturno.getStatus());
    }

}