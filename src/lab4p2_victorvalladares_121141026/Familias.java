package lab4p2_victorvalladares_121141026;

import java.util.ArrayList;

public class Familias {
    private String apellido;
    private ArrayList <Personas> familias = new ArrayList ();

    public Familias() {
    }

    public Familias(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Personas> getFamilias() {
        return familias;
    }

    public void setFamilias(ArrayList<Personas> familias) {
        this.familias = familias;
    }

    @Override
    public String toString() {
        return "Familias{" + "apellido=" + apellido + ", miembros=" + familias + '}';
    }
    
    
}
