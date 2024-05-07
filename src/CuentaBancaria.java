public class CuentaBancaria {

        String identificador;
        String contrasena;
        double saldo;

        public CuentaBancaria(String identificador, String contraseña,double saldo) {
            this.identificador=identificador;
            this.contrasena=contraseña;
            this.saldo=saldo;
        }

        void cuentaBancaria(){}

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
        void ingresarDinero(double cargar){
            this.saldo+=cargar;
        }

        void sacarDinero(double extraer){
            this.saldo-=extraer;
        }
    }



