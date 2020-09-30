import persona.Persona;

import java.util.InputMismatchException;
import java.util.Scanner;
public class RecolectorDeDatos {
    private final Scanner scanner = new Scanner(System.in);
    private Empleado empleado;


    public void obtenerInformacionDelEmpleado(){
        System.out.println("---EMPLEADO---");
        Persona obtenerInformacion = obtenerInformacion();
        System.out.println("INGRESE SUELDO:");
        double sueldo = scanner.nextDouble();

        empleado = new Empleado(
                obtenerInformacion.getId(), sueldo
                );
    }

    public Persona obtenerInformacion(){

        Integer id= 0;                                   // VALIDACION DE DATOS EN EL ID
        do {
            try {
                System.out.println("INGRESE ID:");
                id = scanner.nextInt();

            }catch (InputMismatchException exception){   // CONTROL DE LA EXCEPCION
                System.out.println("<--Id no valido ingrese numero entero-->");
                scanner.nextLine();
            }
        }while (id==0 || id<0);
        scanner.nextLine();
        return new Persona(id);

    }
    public Empleado getEmpleado() {
        return empleado;
    }
}
