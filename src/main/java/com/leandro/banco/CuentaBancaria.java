package com.leandro.banco;
public class CuentaBancaria {
    private String identificador;
    private String contrasena;

    private TipoDecuenta tipoDecuenta;
    private double saldo;

    private final double COMISION=1.2;

        public CuentaBancaria(String identificador, String contrasena,double saldo) {
            this.identificador=identificador;
            this.contrasena=contrasena;
            this.saldo=saldo;
        }

        public void cuentaBancaria(String identificador,double saldo){
            this.identificador=identificador;
            this.saldo=saldo;
            this.tipoDecuenta=TipoDecuenta.CAJA_AHORRO;
        }

        public void cuentaBancaria(){
            this.identificador="";
            this.saldo=0;
            this.tipoDecuenta=TipoDecuenta.CAJA_AHORRO;
        }

        public String getIdentificador() {
            return identificador;
        }

        public void setIdentificador(String identificador) {
            this.identificador = identificador;
        }

        public String getContrasena() {
            return contrasena;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public void ingresarDinero(double cargar){
            this.saldo+=cargar;
        }

        public void sacarDinero(double extraer){
            this.saldo-=extraer;
        }

        private double calcularComision(){
            switch (tipoDecuenta){
                case CAJA_AHORRO :
                    return COMISION;
                case NOMINA:
                    return 0;
                default:
                    return 0;
            }
        }
       public void cambiarTipoDeCuenta(TipoDecuenta nuevoTipo){
            tipoDecuenta=nuevoTipo;
       }

    }



