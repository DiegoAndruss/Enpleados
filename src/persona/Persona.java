package persona;

public class Persona {
    private final Integer id;       // numero de identificacion
    private final String nombre;    // nombre del empleado
    private final String apellido;  // apellido del empleado


//Constructor
    public Persona(String nombre, String apellido, Integer id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;

    }
    public Integer getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }


    @Override
    public String toString() {
        return "Empleado"
                + "\n nombre: " + getNombre()
                + "\n apellido: " + getApellido()
                + "\n Id: " + getId();


    }}