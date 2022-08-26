package com.mycompany.sprint2;

public class Main {

    public static void main(String[] args) {



        Employee empleado1 = new Employee ("Simón Bolivar","empleadi1@gmail.com", Enum_RoleName.Admin);

        System.out.println("El nombre del empleado es: " + empleado1.getNombre());
        System.out.println("el correo electronico es: " + empleado1.getEmail());
        System.out.println("el rol del usuario es: " + Enum_RoleName.Admin);

        empleado1.setNombre("Julio Cesar");
        System.out.println("el nuevo nombre es: " + empleado1);

        empleado1.setEmail("employ1@rocketmail.com");
        System.out.println("el nuevo email es: " + empleado1);

        empleado1.setRole(Enum_RoleName.Operario);
        System.out.println("El nuevo rol del usuario es: " + empleado1);


        Enterprise empresa1 = new Enterprise("Bavaria");
        System.out.println("La empresa es: " + empresa1);

        empresa1.setName("CocaCola");
        System.out.println("La nueva empresa es: " + empresa1);


    }


}
