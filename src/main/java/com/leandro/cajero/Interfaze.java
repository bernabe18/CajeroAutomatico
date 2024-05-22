package com.leandro.cajero;
import java.util.Scanner;
public class Interfaze {
    public static void main(String[] arg){
        String identificador;
        String contrasena;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su número de identificación");
        identificador=scanner.nextLine();
        System.out.println("Ingrese su contraseña");
        contrasena=scanner.nextLine();
        CajeroAutomatico cajeroAutomatico=new CajeroAutomatico(identificador,contrasena);

        int opcionSeleccionada;
        do {

            System.out.println("""
                *****************************************
                Elija una de las siguientes opciones
                
                Ecriba 1 para consultar su saldo
                Ecriba 2 para ingresar dinero
                Ecriba 3 para sacar dinero
                Ecriba 4 para consultar su ultimos movimientos
                Escriba  cualquier otro numero para salir
                
                ********************************************
                """);
            opcionSeleccionada= scanner.nextInt();
            switch (opcionSeleccionada) {
                case 1:
                    cajeroAutomatico.mostrarSaldo();
                    break;
                case 2:
                    cajeroAutomatico.ingresarDinero();
                    break;
                case 3:
                    cajeroAutomatico.sacarDinero();
                    break;
                case 4:
                    cajeroAutomatico.consultarUltimosMovimientos();
                    break;
                default:
                    cajeroAutomatico.salir();
            }
        }
        while (opcionSeleccionada > 0 && opcionSeleccionada < 5) ;
    }
}