package com.mycompany.sprint2;

public class Main {

    public static void main(String[] args) {

        Employee empleado1 = new Employee ("empleadi1@gmail.com");
        System.out.println("el correo electronico es: " + empleado1.getEmail());

        empleado1.setEmail("employ1@rocketmail.com");
        System.out.println("el nuevo email es: " + empleado1);

    }


}
