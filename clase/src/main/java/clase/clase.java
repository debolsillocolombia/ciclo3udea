package clase;

import java.util.Scanner;

public class clase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double reti, tipo, importe;

        //se crea objeto cuenta1 sin parámetros
        //se ejecuta el constructor por defecto
        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("cantidad a ingresar : ");
        tipo = sc.nextDouble();
        System.out.print("cantidad a retirar : ");
        reti = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setConsignacion(tipo);
        cuenta1.setRetiro(reti);
        cuenta1.setSaldo(importe);



        //mostrar los datos de cuenta1
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("cantidad a consignar: " + cuenta1.getConsignacion());
        System.out.println("cantidad a retirar: " + cuenta1.getRetiro());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        //se realiza un ingreso en cuenta1
        double resultado= cuenta1.getSaldo() + cuenta1.getConsignacion() - cuenta1.getRetiro();

        //mostrar el saldo de cuenta1 después del ingreso
        System.out.println("Saldo: " +resultado);







    }
    }

