package lab4p2_victorvalladares_121141026;

public class SuperGranjero extends Personas{
    private int ataque;

    public SuperGranjero() {
        super();
    }

    public SuperGranjero(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, 1000);
    }

    public SuperGranjero(int ataque) {
        this.ataque = 1000;
    }

    
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "SuperGranjero{" + super.toString() +"ataque=" + ataque + '}';
    }
    
    
    @Override
    public int damage(Personas atacar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
