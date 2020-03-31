import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest {
    
    /*@Test
    public void criarInventarioSemQuantidadeInformada(){
        Inventario inventario = new Inventario();
        assertEquals(99, inventario.getItens().length);
    }
    
    @Test
    public void criarInventarioComQuantidadeInformada(){
        Inventario inventario = new Inventario(42);
        assertEquals(42, inventario.getItens().length);
    }*/
    
    @Test
    public void adicionarUmItem() {
        Inventario inventario = new Inventario(11);
        Item espada = new Item(1, "Espada");
        inventario.adicionar(espada);
        assertEquals(espada, inventario.getItens().get(0));
        //assertEquals(espada, inventario.obter(0));
    }
    
    @Test
    public void adicionarDoisItens() {
        Inventario inventario = new Inventario(11);
        Item espada = new Item(1, "Espada");
        Item escudo = new Item(1, "Escudo");
        inventario.adicionar(espada);
        inventario.adicionar(escudo);
        assertEquals(espada, inventario.getItens().get(0));
        //assertEquals(espada, inventario.obter(0));
        assertEquals(escudo, inventario.getItens().get(1));
        //assertEquals(escudo, inventario.obter(1));
    }
    
    @Test
    public void obterItem() {
        Inventario inventario = new Inventario(11);
        Item espada = new Item(1, "Espada");
        inventario.adicionar(espada);
        assertEquals(espada, inventario.obter(0));
    }
    
    @Test
    public void removerItem() {
        Inventario inventario = new Inventario(11);
        Item espada = new Item(1, "Espada");
        Item escudo = new Item(1, "Escudo");
        inventario.adicionar(espada);
        inventario.adicionar(escudo);
        inventario.remover(espada);
        assertEquals(1, inventario.getItens().size());
    }
    
    @Test
    public void getDescricoesVariosItens(){
        Inventario inventario = new Inventario(11);
        Item espada = new Item(1, "Espada");
        Item lanca = new Item(1, "Lança");
        Item escudo = new Item(1, "Escudo");
        inventario.adicionar(espada);
        inventario.adicionar(lanca);
        inventario.adicionar(escudo);
        assertEquals("Espada,Lança,Escudo", inventario.getDescricoesItens());
    }
    
    @Test
    public void getDescricoesNenhumItem(){
        Inventario inventario = new Inventario(11);
        assertEquals("", inventario.getDescricoesItens());
    }
    
    @Test
    public void getItemMaiorQuantidade(){
        Inventario inventario = new Inventario(11);
        Item espada = new Item(1, "Espada");
        Item lanca = new Item(5, "Lança");
        Item escudo = new Item(3, "Escudo");
        inventario.adicionar(espada);
        inventario.adicionar(lanca);
        inventario.adicionar(escudo);
        assertEquals(lanca , inventario.getItemComMaiorQuantidade());
    }
    
    @Test
    public void getItemMaiorQuantidadeQuantidadesIguais(){
        Inventario inventario = new Inventario(11);
        Item espada = new Item(1, "Espada");
        Item lanca = new Item(1, "Lança");
        Item escudo = new Item(1, "Escudo");
        inventario.adicionar(espada);
        inventario.adicionar(lanca);
        inventario.adicionar(escudo);
        assertEquals(espada , inventario.getItemComMaiorQuantidade());
    }
    
    @Test
    public void buscarItemDescricao(){
        Inventario inventario = new Inventario(11);
        Item celular = new Item(1, "Celular");
        inventario.adicionar(celular);
        assertEquals( celular, inventario.buscar("Celular") );
    }
    
    @Test
    public void buscarItemDescricaoMesmaDescricao(){
        Inventario inventario = new Inventario(11);
        Item celular = new Item(1, "Celular");
        Item celular1 = new Item(1, "Celular");
        inventario.adicionar(celular);
        inventario.adicionar(celular1);
        assertEquals( celular, inventario.buscar("Celular") );
    }
    
    @Test
    public void inverterInventarioVazio(){
        Inventario inventario = new Inventario(1);
        assertTrue(inventario.inverter().isEmpty());
    }
    
    @Test
    public void inverterInventarioUmItem(){
        Inventario inventario = new Inventario(1);
        Item arco = new Item(1, "Arco");
        inventario.adicionar(arco);
        assertEquals(arco, inventario.inverter().get(0));
        assertEquals(1, inventario.inverter().size());
    }
    
    @Test
    public void inverterInventarioDoisItens(){
        Inventario inventario = new Inventario(1);
        Item arco = new Item(1, "Arco");
        Item flecha = new Item(1, "Flecha");
        inventario.adicionar(arco);
        inventario.adicionar(flecha);
        assertEquals(flecha, inventario.inverter().get(0));
        assertEquals(arco, inventario.inverter().get(1));
        assertEquals(2, inventario.inverter().size());
    }
    
    
    
    
    
    
    
    
}