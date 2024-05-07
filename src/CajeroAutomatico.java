import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
    CuentaBancaria cuantaBancariaActual;
    Scanner sacaner =new Scanner(System.in);


    public CajeroAutomatico(String identificador ,String Contraseña){
        double cantidadCualquiera= ThreadLocalRandom.current().nextDouble(0,50000);
        cuantaBancariaActual=new CuentaBancaria(identificador,Contraseña,cantidadCualquiera);
    }

    void mostrarSaldo(){
        System.out.println( "Tu saldo es : "+cuantaBancariaActual.saldo);
    }
    void ingresarDinero(){
        double cargar;
        System.out.println("Cuanto dinero quiere ingresar");
        cargar=sacaner.nextDouble();
        cuantaBancariaActual.ingresarDinero(cargar);
    }

    void sacarDinero(){
        double extraer;
        System.out.println("Cuanto dinero desea extraer de su cuenta");
        extraer=sacaner.nextDouble();
        cuantaBancariaActual.sacarDinero(extraer);
    }

    void consultarUltimosMovimientos(){

        UltimosMovimientos movimiento= new UltimosMovimientos();
        System.out.println("Cuantos movimientos quiere consultar");
        int numeroDeMovimientos= sacaner.nextInt();
        ArrayList<String> movimientos =movimiento.obtenerMovimientos(numeroDeMovimientos,"Pesos");
        mostrarMovmientos(movimientos);

    }

    void mostrarMovmientos(ArrayList<String> movimientos){
        for(String movimiento:movimientos){
            System.out.println(movimiento);
        }
    }


    void salir(){
        System.out.println("!! MUCHAS GRACIAS POR UTILIZAR NUETROS SERVICIOS ¡¡");
    }
}

