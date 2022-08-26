import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /*instancia de la clase Empresa*/
        Empresa empresa1 = new Empresa(126, "Empresa Prueba", "22456", "5555", "Kra22 No9");
        System.out.println("El Nit de la empresa es: " + empresa1.getId());
        System.out.println("El teléfono de la empresa es: " + empresa1.getPhone());
        

        /*Ingreso de datos para cambiar de la instancia empresa1*/
        Scanner lecturaDatos = new Scanner(System.in);
                System.out.println("Introduce el nuevo teléfono de la empresa:");
        String nuevoTel =lecturaDatos.nextLine();
        System.out.println("IntroduceEl nuevo Nit de la empresa: ");
        long nuevoId =lecturaDatos.nextInt();
        
        /*Salida de datos empresa:*/
             
        System.out.println("El nuevo teléfono de la empresa es: "+nuevoTel);
        System.out.println("El nuevo NIT de la empresa es: "+nuevoId);
       