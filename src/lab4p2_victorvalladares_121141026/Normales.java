package lab4p2_victorvalladares_121141026;

public class Normales extends Personas{
    private int ataque = 50;

    public Normales() {
        super();
    }

    public Normales(String nombre, String apellido, int edad, int vida) {
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
        return "Normales{" + super.toString() +"ataque=" + ataque + '}';
    }
    
    
    @Override
    public int damage(Personas atacar) {
        if (atacar instanceof Pacifista) return (int)Math.round(getAtaque()*1.05);
        return getAtaque();
    }
    
}
