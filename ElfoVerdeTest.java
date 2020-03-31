import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoVerdeTest{
    
    @Test
    public void elfoVerdeGanha2XPorFlecha(){
        ElfoVerde celebron = new ElfoVerde("Celebron");
        celebron.atirarFlecha(new Dwarf("Balin"));
        assertEquals(2, celebron.getExperiencia());
    }
    
    @Test
    public void elfoVerdeadicionarItemComDescricaoValida(){
        ElfoVerde celebron = new ElfoVerde("Celebron");
        Item arcoDeVidro = new Item(1, "Arco de vidro");
        celebron.ganharItem(arcoDeVidro);
        Inventario inventario = celebron.getInventario();
        assertEquals(new Item(2, "Flecha"), inventario.obter(0));
        assertEquals(new Item(1, "Arco"), inventario.obter(1));
        assertEquals(arcoDeVidro, inventario.obter(2));
    }
    
    @Test
    public void elfoVerdeadicionarItemComDescricaoInvalida(){
        ElfoVerde celebron = new ElfoVerde("Celebron");
        Item arcoDeMadeira = new Item(1, "Arco de madeira");
        celebron.ganharItem(arcoDeMadeira);
        Inventario inventario = celebron.getInventario();
        assertEquals(new Item(2, "Flecha"), inventario.obter(0));
        assertEquals(new Item(1, "Arco"), inventario.obter(1));
        assertNull(inventario.buscar("Arco de madeira"));
    }
    
    @Test
    public void elfoVerdePerdeItemComDescricaoValida(){
        ElfoVerde celebron = new ElfoVerde("Celebron");
        Item arcoDeVidro = new Item(1, "Arco de vidro");
        celebron.ganharItem(arcoDeVidro);
        celebron.perderItem(arcoDeVidro);
        Inventario inventario = celebron.getInventario();
        assertEquals(new Item(2, "Flecha"), inventario.obter(0));
        assertEquals(new Item(1, "Arco"), inventario.obter(1));
        assertNull(inventario.buscar("Arco de vidro"));
    }
    
    @Test
    public void elfoVerdePerdeItemComDescricaoInvalida(){
        ElfoVerde celebron = new ElfoVerde("Celebron");
        Item arco = new Item(1, "Arco");
        celebron.perderItem(arco);
        Inventario inventario = celebron.getInventario();
        assertEquals(new Item(2, "Flecha"), inventario.obter(0));
        assertEquals(new Item(1, "Arco"), inventario.obter(1));
    }
    
    
    
    
    
    
    
    
    
    
    
}