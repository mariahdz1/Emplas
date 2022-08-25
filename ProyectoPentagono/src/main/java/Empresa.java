import java.util.Date;
import java.util.Scanner;

public class Empresa {
    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private User users;
    private Transaction transactions;
    private Date createdAt;
    private Date updatedAt;

    public Empresa(long id, String name, String document, String phone, String address) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String phone) {
        this.phone = address;
    }

    public static void main(String[] args) {
        Empresa empresa1 = new Empresa(126, "Empresa Prueba", "22456", "5555", "Kra22 No9");

        System.out.println("El nombre de la empresa es: " + empresa1.name);
        System.out.println("La identificación de la empresa es: " + empresa1.id);
        System.out.println("El documento de la empresa es: " + empresa1.document);
        System.out.println("El teléfono de la empresa es: " + empresa1.phone);
        System.out.println("La dirección de la empresa es: " + empresa1.address);


        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Introduce el nuevo nombre de la empresa:");
        String nuevoNombre =lecturaDatos.nextLine();

        System.out.println("Introduce la nueva dirección de la empresa:");
        String nuevaDir =lecturaDatos.nextLine();

        System.out.println("El nuevo nombre de la empresa es: "+nuevoNombre);
        System.out.println("La nueva dirección de la empresa es: "+nuevaDir);

    }

}
