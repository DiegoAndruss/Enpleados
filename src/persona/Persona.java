package persona;

public class Persona {
    private final Integer id;       // numero de identificacion

    //Constructor
    public Persona(Integer id) {
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    @Override
    public String toString() {
        return "Empleado"
                + "\n Id: " + getId();


    }}