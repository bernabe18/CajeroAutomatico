import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class UltimosMovimientos {
    private static final String TRASFERENCIA ="transferencia de ";
    private static final String INGRESO="Ingreso de ";
    private static final String RETIRADA="Retiro de ";
    private static final String PAGO_CON_TARJETA="Pago con tarjeta de ";
    private static final String NOMINA="Ingreso nómina de ";
    private static final String PAGO_RECIBO="Pago de recibo de ";

    ArrayList<String> obtenerMovimientos(int numeroDeMovimiento,String moneda){
        ArrayList<String> movimientos = new ArrayList<>();
        for (int i = 0; i < numeroDeMovimiento; i++) {
            int aleatorioTipo = obtenerIntAleatorio(1, 5);
            String tipoDeMovimiento;
            switch (aleatorioTipo){
                case 1:
                    tipoDeMovimiento=TRASFERENCIA;
                    break;
                case 2:
                    tipoDeMovimiento=INGRESO;
                    break;
                case 3:
                    tipoDeMovimiento=RETIRADA;
                    break;
                case 4:
                    tipoDeMovimiento=PAGO_CON_TARJETA;
                    break;
                case 5:
                    tipoDeMovimiento=NOMINA;
                    break;
                default:
                    tipoDeMovimiento=PAGO_RECIBO;

            }
            double cantidadAleatoria= obtenerDoubleAleatorio(1.0,3000.0);
            String movimiento=tipoDeMovimiento +"" +cantidadAleatoria +" $ "+moneda;
            movimientos.add(movimiento);
        }
        return movimientos;
    }


    private int obtenerIntAleatorio(int min ,int max){
        return ThreadLocalRandom.current().nextInt(min,max + 1);
    }

    private double obtenerDoubleAleatorio(double min ,double max){
        return ThreadLocalRandom.current().nextDouble(min,max + 1.0);
    }


}
