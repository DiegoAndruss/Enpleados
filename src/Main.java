import java.util.Scanner;
public class Main {

    public static void main(String...args){



        int entrada;
        do {System.out.println("PRECIONE (7) PARA DESPLEGAR MENU");
            Scanner sc = new Scanner(System.in);
            entrada = sc.nextInt();
            Menu menu = new Menu();
            menu.desplegar();
        }while (entrada<5);










    }
}
