package lab4p2_victorvalladares_121141026;

import java.util.Random;

public class Herrero extends Personas{  
    
    Random r = new Random();
    private int ataque = r.nextInt(500)+200;

    public Herrero() {
        super();
    }

    public Herrero(String nombre, String apellido, int edad, int vida) {
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
        return "Herrero{" + super.toString() + "ataque=" + ataque + '}';
    }

    @Override
    public int damage(Personas atacar) {
        if (atacar instanceof Agronomo) return (int)Math.round(getAtaque()*1.1);
        if (atacar instanceof Pacifista) return (int)Math.round(getAtaque()*1.05);
        int fallar = 1+ r.nextInt(100);
        if (fallar <= 10){
            setAtaque(0);
        }
        return getAtaque();
    }
    
}
