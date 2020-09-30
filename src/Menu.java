import java.util.LinkedList;
import java.util.Scanner;



public class Menu  {
        LinkedList <String> desplegar;
        private Empleado empleado;

        public void leerOpcion(){
            Scanner teclado = new Scanner(System.in);
            int opcion;
            do {
                System.out.println("           <--MENU-->");
                System.out.println("(1)AGREGAR (2)BUSCAR (3)MODIFICAR");
                System.out.println("(4)ELIMINAR (5)INSERTAR (6)MOSTRAR");
                System.out.println("(7)SALIR");
                opcion=teclado.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("----------------------");
                        RecolectorDeDatos recolectorDeDatos = new RecolectorDeDatos();
                        recolectorDeDatos.obtenerInformacionDelEmpleado();
                        ingresarValor();
                        break;
                    case 2:
                        System.out.println("----------------------");
                        buscarValor();
                        break;
                    case 3:
                        System.out.println("----------------------");
                        modificarValor();
                        break;
                    case 4:
                        System.out.println("----------------------");
                        eliminarValor();
                        break;
                    case 5:
                        System.out.println("----------------------");
                        insertarValor();
                        break;
                    case 6:
                        System.out.println("----------------------");
                        mostrarLista();

                        break;
                    case 7:


                }
            }while (opcion !=7);

    }


    public void  ingresarValor(){

        Scanner teclado = new Scanner(System.in);
        String valor;
        System.out.println("INGRESE NOMBRE:");
        valor = teclado.nextLine();
        desplegar.add(valor);

        Scanner teclado2 = new Scanner(System.in);
        String valor2;
        System.out.println("INGRESE APELLIDO:");
        valor2 = teclado2.nextLine();
        desplegar.add(valor2);
    }
    public void buscarValor(){
            Scanner teclado = new Scanner(System.in);
            String valor;
            int indice;
        System.out.println("BUSCAR USUARIO");
        valor=teclado.nextLine();
        indice=desplegar.indexOf(valor);
        if (indice !=-1){
            System.out.println("dato se encuenta en posicion"+indice);
        }else {
            System.out.println("dato no se encuentra");
        }
    }
    public void modificarValor(){
        Scanner teclado = new Scanner(System.in);
        String valor, nuevoValor;
        int indice;
        System.out.println("USUARIO A MODIFICAR");
        valor=teclado.nextLine();
        indice=desplegar.indexOf(valor);
        if (indice !=-1){
            System.out.println("NUEVO USUARIO");
            nuevoValor = teclado.nextLine();
            desplegar.set(indice,nuevoValor);
        }else {
            System.out.println("dato no se encuentra");
    }

} public void eliminarValor() {
        Scanner teclado = new Scanner(System.in);
        String valor;
        int indice;
        System.out.println("USUARIO A ELIMINAR");
        valor = teclado.nextLine();
        indice = desplegar.indexOf(valor);
        if (indice != -1) {
            desplegar.remove(indice);
            System.out.println("dato eliminado");
        } else {
            System.out.println("dato no se encuentra");
        }
    }public void insertarValor(){
        Scanner teclado = new Scanner(System.in);
        String valor;
        int indice;
        System.out.println("INSERTAR USUARIO");
        valor=teclado.nextLine();
        System.out.println("posicion donde desea insertar");
       indice= teclado.nextInt();
       desplegar.add(indice, valor);
    }
public void mostrarLista(){
    if (!desplegar.isEmpty()){
        System.out.println("LISTADO");
        for (int i =0; i < desplegar.size(); i++){
            System.out.println(desplegar.get(i));
            //System.out.println(empleado.getSueldo()); // no retorna valor!!
            //System.out.println(empleado.getId());
        }
    }else {
        System.out.println("no existe valores en la lista");
    }
}
}


