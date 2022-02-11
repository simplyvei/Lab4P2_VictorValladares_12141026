package lab4p2_victorvalladares_121141026;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab4P2_VictorValladares_121141026 {

    public static Scanner lea = new Scanner (System.in);
    
        public static ArrayList <Familias> familias = new ArrayList();
        //Montesco
        public static Familias Montesco = new Familias ("Montesco");

        public static Personas herrero = new Herrero("Victor", "Montesco", 18, 400);
        
        public static Personas Romeo = new SuperGranjero ("Romeo", "Montesco", 21, 1000);
        
        public static Personas agronomo = new Agronomo ("Juan", "Montesco", 29, 320);
       
        
        
        //Capuleto
        public static Familias Capuleto = new Familias("Capuleto");
        
        public static Personas Julieta = new Normales ("Julieta", "Capuleto", 21, 500);
        
        public static Personas pacifista = new Pacifista ("No peleen", "James", "Capuleto", 20, 300);
        
        public static Personas normal = new Normales ("Daniel", "Capuleto", 20, 300);
        
        
        
        //Familia #3
        public static Familias Rodriguez = new Familias ("Rodriguez");
        
        public static Personas explosivo = new Explosivo ("Diego", "Rodriguez", 38, 100);
        
        
    
    public static void main(String[] args) {
        //Montescos
        familias.add(Montesco);
        familias.get(0).getFamilias().add(herrero);
        familias.get(0).getFamilias().add(Romeo);
        familias.get(0).getFamilias().add(agronomo);
        
        
        //Capuletos
        familias.add(Capuleto);
        familias.get(1).getFamilias().add(Julieta);
        familias.get(1).getFamilias().add(pacifista);
        familias.get(1).getFamilias().add(normal);
        
        //Familia #3
        familias.add(Rodriguez);
        familias.get(2).getFamilias().add(explosivo);
        
        //Menu
        do{
            realizar( menu() );
        }while(true);
    }
    public static int menu(){
        System.out.println("-----------------------------------------------");
        System.out.println("0. Salir");
        System.out.print("1. Crear familia\n" +
                        "2. Crear persona\n" +
                        "3. Imprimir familias\n" +
                        "4. Pelea\n" +
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        System.out.println("-----------------------------------------------");
        return op;
    }
    public static void realizar(int op){
        if (op == 0){
            System.exit(0);
        }else if (op == 1){
            crearFamilia();
        }else if (op == 2){
           crearPersona();
        }else if (op == 3){
           
        }else if (op == 4){
            
        }
    }
    public static void crearFamilia(){
        System.out.print("Ingrese un apellido para la familia: ");
        String apellido = lea.next();
        for(Familias lista : familias){
            if (lista.getApellido().equalsIgnoreCase(apellido)){
                System.out.print("Este aperllido ya existe, intente de nuevo: ");
                apellido = lea.next();
            }
        }
        familias.add(new Familias(apellido));
    }
    public static void crearPersona(){
        System.out.print("Ingrese el nombre: ");
        String nombre = lea.next();
        System.out.print("Ingrese el apellido: ");
        String apellido = lea.next();
        int val = -1;
        for(Familias lista : familias){
            if (lista.getApellido().equalsIgnoreCase(apellido)){
                val = familias.indexOf(apellido);
            }
        }
        if (val == -1){
            System.out.println("NO EXISTE ESE APELLIDO");
        }else{
            System.out.print("Ingrese su edad: ");
            int edad = lea.nextInt();
            System.out.print("Ingrese su cantidad de vida: ");
            int vida = lea.nextInt();
            System.out.print("1. Normal\n"+
                        "2. Pacifista\n"+
                        "3. Herrero\n"+
                        "4. Agronomo\n"+
                        "5. Explosivo\n"+
                        "Ingrese una opcion: ");
            int op = lea.nextInt();
            if (op == 1){
                familias.get(val).getFamilias().add(new Normales(nombre, apellido, edad, vida));
            }else if (op == 2){
                System.out.print("Ingrese el discurso pacifista: ");
                String discurso = lea.nextLine();
                discurso = lea.nextLine();
                familias.get(val).getFamilias().add(new Pacifista(discurso, nombre, apellido, edad, vida));
            }else if (op == 3){
                familias.get(val).getFamilias().add(new Herrero(nombre, apellido, edad, vida));
            }else if (op == 4){
                familias.get(val).getFamilias().add(new Agronomo(nombre, apellido, edad, vida));
            }else if (op == 5){
                familias.get(val).getFamilias().add(new Explosivo(nombre, apellido, edad, vida));
            }
        }
    }
}
