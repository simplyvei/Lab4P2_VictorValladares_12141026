package lab4p2_victorvalladares_121141026;

public abstract class Personas {
    private String nombre;
    private String apellido;
    private String edad;
    private int vida;

    public Personas() {
    }

    public Personas(String nombre, String apellido, String edad, int vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", vida=" + vida + '}';
    }
    
}
