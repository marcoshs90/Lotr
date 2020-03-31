import java.util.*;

public class Filmes {
    
    public void indicar() {
        ArrayList<String> filmes = new ArrayList<>();
        filmes.add("VINGADORES");
        filmes.add("CONSTANTINE");
        filmes.add("STAR WARS");
        filmes.add("DURO DE MATAR 4.0");
        filmes.add("UM SONHO DE LIBERDADE");
        filmes.add("INTERSTELLAR");
        filmes.add("OS 8 ODIADOS");
        filmes.add("PULP FICTION");
        filmes.add("DE VOLTA PARA FUTURO");
        filmes.add("UM DIA");
        filmes.add("JOHN WICK");
        filmes.add("O IRLANDES");
        filmes.add("A VIAGEM DE CHIRIRO");
        filmes.add("O PODEROSO CHEFÃO");
        filmes.add("CORINGA");
        filmes.add("SHREK");
        filmes.add("LARANJA MECANICA");
        filmes.add("MATRIX");
        filmes.add("SENHOR DOS ANEIS");
        filmes.add("ESTOMAGO");
        filmes.add("DIDI, O FANTASMA TRAPALHÃO");
        
        //System.out.println(filmes.get(13));
        
        for(int i = 0; i < filmes.size(); i++) {
            System.out.println(filmes.get(i));
        }
        
        
        
        
    }
    
    
    
    /*public void indicar() {
        String[] filmes = new String[21];
        filmes[0] = "VINGADORES";
        filmes[1] = "CONSTANTINE";
        filmes[2] = "STAR WARS";
        filmes[3] = "DURO DE MATAR 4.0";
        filmes[4] = "UM SONHO DE LIBERDADE";
        filmes[5] = "INTERSTELLAR";
        filmes[6] = "OS 8 ODIADOS";
        filmes[7] = "PULP FICTION";
        filmes[8] = "DE VOLTA PARA FUTURO";
        filmes[9] = "UM DIA";
        filmes[10] = "JOHN WICK";
        filmes[11] = "O IRLANDES";
        filmes[12] = "A VIAGEM DE CHIRIRO";
        filmes[13] = "O PODEROSO CHEFÃO";
        filmes[14] = "CORINGA";
        filmes[15] = "SHREK";
        filmes[16] = "LARANJA MECANICA";
        filmes[17] = "MATRIX";
        filmes[18] = "SENHOR DOS ANEIS";
        filmes[19] = "ESTOMAGO";
        filmes[20] = "DIDI, O FANTASMA TRAPALHÃO";
        
        //System.out.println(filmes[13]);
        
        /*for(int i = 0; i < filmes.length; i++) {
            System.out.println(filmes[i]);
        }
        
        int i = 0;
        while( i < filmes.length ) {
            System.out.println(filmes[i++]);
        }
        
        
    }*/
    
}
