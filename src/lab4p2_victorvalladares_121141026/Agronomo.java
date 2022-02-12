package lab4p2_victorvalladares_121141026;

import java.util.Random;

public class Agronomo extends Personas{
    Random r = new Random();
    private int ataque = 100;

    public Agronomo() {
        super();
    }

    public Agronomo(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
    }
    
    
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Agronomo{" + super.toString() + "ataque=" + ataque + '}';
    }
    
    
    @Override
    public int damage(Personas atacar) {
        if (atacar instanceof Pacifista) return (int)Math.round(getAtaque()*1.05);
        if (atacar instanceof Normales) return (int)Math.round(getAtaque()*1.1);
        int fallar = 1+ r.nextInt(100);
        if (fallar <= 15){
            setAtaque(0);
        }
        return getAtaque();
    }
    
}
