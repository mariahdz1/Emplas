package com.mycompany;

import java.util.Scanner;

public class DatosEjemplo {
    public static void main(String[] args) {
        /*instancia de la clase Transaction*/
        Transaction transaccion1 = new Transaction(111, "Transaccion 1", 1200000);
        System.out.println("La identificación de la transacción es:" + transaccion1.getId());
        System.out.println("El concepto de la transacción es:" + transaccion1.getConcept());
        System.out.println("El valor de la transacción:" + transaccion1.getAmount());

        /*Ingreso informacion*/
        Scanner lecturaTransaccion = new Scanner(System.in);
        System.out.println("Introduce el concepto de la transacción:");
        String transaccion =lecturaTransaccion.nextLine();
        System.out.println("Introduce el monto de la transacción:");
        float monto =Float.valueOf(lecturaTransaccion.nextLine());

        /*Lectura Nuevos datos*/
        Transaction transaccion2 = new Transaction(222, transaccion, monto);
        transaccion2.ingreso(monto, transaccion1.getAmount());
        System.out.println("La identificación de la transacción es:" + transaccion2.getId());
        System.out.println("El concepto de la transacción es:" + transaccion2.getConcept());
        System.out.println("El valor de la transacción:" + transaccion2.getAmount());
        System.out.println("El saldo es: " + transaccion2.getSaldo());
        transaccion2.Gasto(monto, transaccion1.getAmount());
        System.out.println("El saldo es: " + transaccion2.getSaldo());


    }
}
