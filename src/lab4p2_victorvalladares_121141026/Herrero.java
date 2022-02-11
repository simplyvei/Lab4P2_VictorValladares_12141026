package lab4p2_victorvalladares_121141026;

import java.util.Random;

public class Herrero extends Personas{
    private int ataque;
    Random r = new Random();

    public Herrero() {
        super();
    }

    public Herrero(int ataque, String nombre, String apellido, String edad, int vida) {
        super(nombre, apellido, edad, (int)Math.round(vida * 1.5));
        this.ataque = r.nextInt(500)+200;
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
        return 0;
    }
    
}
