import java.util.Scanner;
public class Menu extends RecolectorDeDatos {

    public void desplegar(){

        RecolectorDeDatos recolectorDeDatos = new RecolectorDeDatos();
        recolectorDeDatos.obtenerInformacionDelEmpleado();
        //System.out.println(recolectorDeDatos.getEmpleado().toString());
        System.out.println("-----------------------");

        int entrada;
        do {
            System.out.println("QUE DESEA REALIZAR");
            System.out.println("(1) agregar (2) ver info empleado (3) sin funcion (4) salir");
            Scanner sc = new Scanner(System.in);
            entrada = sc.nextInt();
        }while (entrada > 3 || entrada <1);

        switch (entrada) {
            case 1:
                System.out.println(obtenerInformacion());
                break;
            case 2:
                System.out.println(recolectorDeDatos.getEmpleado());
                break;

            }
        }
    }

