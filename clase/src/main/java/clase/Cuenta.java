package clase;
public class Cuenta {

    private String nombre;
    private String numeroCuenta;
    private double consignacion;
    private double retiro;
    private double saldo;

    //Constructor por defecto
    public Cuenta() {
    }

    //Constructor con parámetros

    public Cuenta(String nombre, String numeroCuenta, double consignacion, double retiro, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.consignacion = consignacion;
        this.retiro = retiro;
        this.saldo = saldo;
    }


    //Constructor copia
    public Cuenta(final Cuenta c) {
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        consignacion = c.consignacion;
        retiro = c.retiro;
        saldo = c.saldo;
    }

    //getters y setters
    public void setNombre(String s) {
        nombre = s;
    }

    public void setNumeroCuenta(String s) {
        numeroCuenta = s;
    }

    public void setConsignacion(double n) {
        consignacion = n;
    }
    public void setRetiro(double n) {
        retiro=n;
    }
    public void setSaldo(double n) {
        saldo = n;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getConsignacion() {
        return consignacion;
    }

    public double getRetiro() {
        return retiro;
    }

    public double getSaldo() {
        return saldo;
    }


}

