import persona.Persona;

public class Empleado extends Persona {
    private final double sueldo;  // PROBLEMA CON LA VARIABLE DOUBLE AL DAR LA CANTIDAD


    public Empleado(Integer id, double sueldo) { // PROBLEMA CON LA VARIABLE DOUBLE AL DAR LA CANTIDAD
        super(id);
        this.sueldo = sueldo;
    }
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\n sueldo: "+ getSueldo();
    }
}

