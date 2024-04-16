import java.util.Scanner;
public class Interfaze {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada;

        System.out.println("""
                Elija una de las siguientes opciones
                
                Ecriba 1 para consultar su saldo
                Ecriba 2 para ingresar dinero
                Ecriba 3 para sacar dinero
                Ecriba 4 para consultar su ultimos movimientos
                """);
        opcionSeleccionada= scanner.nextInt();

        switch (opcionSeleccionada){
            case 1:
                System.out.println("consultar su saldo "+opcionSeleccionada);
                break;
            case 2:
                System.out.println("ingresar dinero "+opcionSeleccionada);
                break;
            case 3:
                System.out.println("sacar dinero "+opcionSeleccionada);
                break;
            case 4:
                System.out.println("consultar su ultimos movimientos "+opcionSeleccionada);
                break;
            default:
                System.out.println("opcion incorrecta "+opcionSeleccionada);
        }



    }
}