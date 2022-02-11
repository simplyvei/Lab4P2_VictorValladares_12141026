package lab4p2_victorvalladares_121141026;

public class Pacifista extends Personas{
    private String discurso;

    public Pacifista() {
        super();
    }

    public Pacifista(String discurso, String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        this.discurso = discurso;
    }

    public String getDiscurso() {
        return discurso;
    }

    public void setDiscurso(String discurso) {
        this.discurso = discurso;
    }

    @Override
    public String toString() {
        return "Pacifista{" + super.toString() +"discurso=" + discurso + '}';
    }
    
    
    
    @Override
    public int damage(Personas atacar) {
        return 0;
    }
    
}
