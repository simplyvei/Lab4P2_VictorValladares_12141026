package lab4p2_victorvalladares_121141026;

public class Normales extends Personas{
    private int ataque;

    public Normales() {
        super();
    }

    public Normales(int ataque, String nombre, String apellido, String edad, int vida) {
        super(nombre, apellido, edad, vida);
        this.ataque = 50;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Normales{" + super.toString() +"ataque=" + ataque + '}';
    }
    
    
    @Override
    public int damage(Personas atacar) {
        return 0;
    }
    
}
