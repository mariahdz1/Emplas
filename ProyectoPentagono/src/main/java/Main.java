import java.util.Scanner;

/*codigo completo equipo Pentagono*/
public class Main {

    public static void main(String[] args) {

        /*Lectura de datos*/
        Enterprise enterprise1 = new Enterprise("Enterprise Prueba", "22456", "5555", "Kra22 No9");
        System.out.println("******************CLASE EMPRESA**********************************");
        System.out.println("El nombre de la empresa es: " + enterprise1.getName());
        System.out.println("La dirección de la empresa es: " + enterprise1.getAddress());
        System.out.println("El teléfono de la empresa es: " + enterprise1.getPhone());
        System.out.println("El NIT de la empresa es: " + enterprise1.getDocument());
        System.out.println("******************************************************************");
        /*Ingreso de datos para cambiar de la instancia enterprise1*/
        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Introduce el nuevo nombre de la empresa: ");
        enterprise1.setName(lecturaDatos.nextLine());
        System.out.println("Introduce la nueva dirección de la empresa: ");
        enterprise1.setAddress(lecturaDatos.nextLine());
        System.out.println("Introduce el nuevo teléfono de la empresa: ");
        enterprise1.setPhone(lecturaDatos.nextLine());
        System.out.println("Introduce el nuevo NIT de la empresa: ");
        enterprise1.setDocument(lecturaDatos.nextLine());
        System.out.println("*******************************************************************");
        /*Salida de datos empresa:*/
        System.out.println("El nuevo nombre de la empresa es: " + enterprise1.getName());
        System.out.println("La nueva dirección de la empresa es: " + enterprise1.getAddress());
        System.out.println("El nuevo teléfono de la empresa es: " + enterprise1.getPhone());
        System.out.println("El nuevo NIT de la empresa es: " + enterprise1.getDocument());
        /*Lectura de datos*/
        System.out.println("******************CLASE EMPLEADO**********************************");
        Employee empleado1 = new Employee("Carlos Gonzalez", "empleadi1@gmail.com", Enum_RoleName.Admin);
        System.out.println("El nombre del empleado es: " + empleado1.getName());
        System.out.println("el correo electronico es: " + empleado1.getEmail());
        System.out.println("La empresa es: "+enterprise1.getName());
        System.out.println("el rol del usuario es: " + Enum_RoleName.Admin);
        /*Ingreso de datos para cambiar de la instancia employee*/
        System.out.println("*******************************************************************");
        System.out.println("Introduce nombre del nuevo empleado: ");
        empleado1.setName(lecturaDatos.nextLine());
        System.out.println("Introduce el correo del nuevo empleado: ");
        empleado1.setEmail(lecturaDatos.nextLine());
        System.out.println("Introduce la empresa del nuevo empleado: ");
        String nuevaEmpresa = (lecturaDatos.nextLine());
        Enterprise enterprise2 = new Enterprise(nuevaEmpresa, "2464", "5545589", "Kra10 No8");
        empleado1.setEnterprise(enterprise2);
        System.out.println("Elige el nuevo rol del empleado: (Admin - Operario) ");
        String cambioRol = lecturaDatos.nextLine();
        switch (cambioRol.toLowerCase()) {
            case "admin":
                empleado1.setRole(Enum_RoleName.Admin);
                break;
            case "operario":
                empleado1.setRole(Enum_RoleName.Operario);
                break;
        };

        /*Salida de datos empresa:*/
        System.out.println("El nombre del nuevo empleado es: " + empleado1.getName());
        System.out.println("El nuevo correo del empleado es: " + empleado1.getEmail());
        System.out.println("la nueva empresa del empleado es: " + empleado1.getEnterprise());
        System.out.println("El nuevo Rol del empleado en la empresa es: " + empleado1.getRole());
        System.out.println("******************CLASE TRANSACCIÓN**********************************");
        /*Lectura de datos*/
        User usuario1 = new User(1, "linzhz@gmail.com", "12555556");
        Profile perfil1 = new Profile("1", "imagen1", usuario1);
        Transaction transaccion1 = new Transaction("Transaccion 1", 1200000, usuario1, enterprise1);
        System.out.println("El concepto de la transacción es:" + transaccion1.getConcept());
        System.out.println("El valor de la transacción:" + transaccion1.getAmount());
        System.out.println("El usuario que hizo el registro fue: " + usuario1.getEmail());
        /*Ingreso informacion*/
        System.out.println("*******************************************************************");
        Scanner lecturaTransaccion = new Scanner(System.in);
        System.out.println("Introduce el concepto de la transacción:");
        String transaccion = lecturaTransaccion.nextLine();
        System.out.println("Introduce el monto de la transacción:");
        float monto = Float.valueOf(lecturaTransaccion.nextLine());
        /*Lectura Nuevos datos*/
        System.out.println("*******************************************************************");
        Transaction transaccion2 = new Transaction(transaccion, monto, usuario1, enterprise1);
        System.out.println("El concepto de la transacción es:" + transaccion2.getConcept());
        System.out.println("El usuario que hizo el registro fue: " + usuario1.getEmail());
        System.out.println("El valor de la transacción:" + transaccion2.getAmount());
        System.out.println("****************METODO GASTO***************************************");
        transaccion2.Gasto(monto, transaccion1.getAmount());
        System.out.println("El saldo es: " + transaccion2.getBalance());
        System.out.println("****************METODO INGRESO***************************************");
        transaccion2.ingreso(monto, transaccion1.getAmount());
        System.out.println("El saldo es: " + transaccion2.getBalance());
    }
}

