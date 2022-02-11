package lab4p2_victorvalladares_121141026;

public class Explosivo extends Personas{
    private int ataque;

    public Explosivo() {
        super();
    }

    public Explosivo(int ataque, String nombre, String apellido, String edad, int vida) {
        super(nombre, apellido, edad, vida);
        this.ataque = 250;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Explosivo{" + super.toString() +"ataque=" + ataque + '}';
    }
    
    
    
    @Override
    public int damage(Personas atacar) {
        return 0;
    }
    
}
