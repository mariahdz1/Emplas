import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /*instancia de la clase Empresa*/
        Empresa empresa1 = new Empresa(126, "Empresa Prueba", "22456", "5555", "Kra22 No9");
        System.out.println("El nombre de la empresa es: " + empresa1.getName());
        System.out.println("El Nit de la empresa es: " + empresa1.getId());
        System.out.println("El documento de la empresa es: " + empresa1.getDocument());
        System.out.println("El teléfono de la empresa es: " + empresa1.getPhone());
        System.out.println("La dirección de la empresa es: " + empresa1.getAddress());
        System.out.println("****************************************************************");


        /*Ingreso de datos para cambiar de la instancia empresa1*/
        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Introduce el nuevo nombre de la empresa:");
        String nuevoNombre =lecturaDatos.nextLine();
        System.out.println("Introduce la nueva dirección de la empresa:");
        String nuevaDir =lecturaDatos.nextLine();
        System.out.println("Introduce el nuevo teléfono de la empresa:");
        String nuevoTel =lecturaDatos.nextLine();
        System.out.println("IntroduceEl nuevo Nit de la empresa: ");
        long nuevoId =lecturaDatos.nextInt();
        System.out.println("*****************************************************");

        /*Salida de datos empresa:*/
        System.out.println("El nuevo nombre de la empresa es: "+nuevoNombre);
        System.out.println("La nueva dirección de la empresa es: "+nuevaDir);
        System.out.println("El nuevo teléfono de la empresa es: "+nuevoTel);
        System.out.println("El nuevo NIT de la empresa es: "+nuevoId);
        System.out.println("********************************************************");

        /*Información de roles*/
        Enum_RoleName admin1 = Enum_RoleName.Admin;
        System.out.println("Rol Asignado:");
        System.out.println("El rol que tiene actualmente es: "+admin1);

        /*Transacciones*/
        Transaction transaccion1 =new Transaction("C001","consignacion",2500.02,empresa1,25/08/2022);

        /*Instancia de la clase Empleado*/
        Profile administrador1 = new Profile (24372702,"image","55555",admin1,"24/08/2022");
        Empleado empleado1 = new Empleado(24372701,"Jessica Ramirez","inverjessie@gmail.com",administrador1,admin1,empresa1,transaccion1,("24/08/2022"),("24/08/2022"));
        System.out.println("El nombre del empleado es: "+empleado1.getNombre());
        System.out.println("El correo del empleado es: " + empleado1.getEmail());
        System.out.println("la empresa del empleado es: " + empleado1.getEmpresa());
        System.out.println("El rol del empleado es: " + empleado1.getRole());

        /*modificar datos del empleado*/
        System.out.println("Introduce el nuevo nombre del empleado:");
        String nuevoNombreEmpleado =lecturaDatos.nextLine();
        System.out.println("Introduce el nuevo correo del empleado:");
        String nuevoCorreoEmpleado =lecturaDatos.nextLine();
        System.out.println("Introduce la nueva Empresa del empleado:");
        String nuevaEmpresaEmpleado =lecturaDatos.nextLine();
        System.out.println("Introduce el nuevo rol del Empleado:");/*como poner solo las dos opciones*/
        String nuevoRolEmpleado =lecturaDatos.nextLine();

        /*Salida de datos empleado:*/
        System.out.println("El nuevo nombre del empleado es: "+nuevoNombreEmpleado);
        System.out.println("El nuevo correo del empleado es: "+nuevoCorreoEmpleado);
        System.out.println("La nueva Empresa del empleado es: "+nuevaEmpresaEmpleado);
        System.out.println("El nuevo rol del empleado es: "+nuevoRolEmpleado);





    }
}
