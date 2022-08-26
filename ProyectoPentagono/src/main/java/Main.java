import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*instancia de la clase Enterprise*/
        Enterprise enterprise1 = new Enterprise(126, "Enterprise Prueba", "22456", "5555", "Kra22 No9");
        System.out.println("El nombre de la empresa es: " + enterprise1.getName());
        System.out.println("La dirección de la empresa es: " + enterprise1.getAddress());
        System.out.println("****************************************************************");


        /*Ingreso de datos para cambiar de la instancia enterprise1*/
        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Introduce el nuevo nombre de la empresa:");
        String nuevoNombre = lecturaDatos.nextLine();
        System.out.println("Introduce la nueva dirección de la empresa:");
        String nuevaDir = lecturaDatos.nextLine();
        System.out.println("*****************************************************");

        /*Salida de datos empresa:*/
        System.out.println("El nuevo nombre de la empresa es: " + nuevoNombre);
        System.out.println("La nueva dirección de la empresa es: " + nuevaDir);
    }
}
