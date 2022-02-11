package lab4p2_victorvalladares_121141026;

import java.util.ArrayList;


public class Lab4P2_VictorValladares_121141026 {


    public static void main(String[] args) {
        ArrayList <Familias> familias = new ArrayList();
        //Montesco
        Familias Montesco = new Familias ("Montesco");
        familias.add(Montesco);
        Personas herrero = new Herrero("Victor", "Montesco", 18, 400);
        familias.get(0).getFamilias().add(herrero);
        Personas Romeo = new SuperGranjero ("Romeo", "Montesco", 21, 1000);
        familias.get(0).getFamilias().add(Romeo);
        Personas agronomo = new Agronomo ("Juan", "Montesco", 29, 320);
        familias.get(0).getFamilias().add(agronomo);
        
        
        //Capuleto
        Familias Capuleto = new Familias("Capuleto");
        familias.add(Capuleto);
        Personas Julieta = new Normales ("Julieta", "Capuleto", 21, 500);
        familias.get(1).getFamilias().add(Julieta);
        Personas pacifista = new Pacifista ("No peleen", "James", "Capuleto", 20, 300);
        familias.get(1).getFamilias().add(pacifista);
        Personas normal = new Normales ("Daniel", "Capuleto", 20, 300);
        familias.get(1).getFamilias().add(normal);
        
        
        //Familia #3
        Familias Rodriguez = new Familias ("Rodriguez");
        familias.add(Rodriguez);
        Personas explosivo = new Explosivo ("Diego", "Rodriguez", 38, 100);
        familias.get(2).getFamilias().add(explosivo);
        
        
        //Menu
        
    }
    
}
