package com.mycompany;

import java.util.Date;
import java.util.Scanner;

public class Transaction {
    private long id;
    private String concept;
    private float amount;
    private User user;
    private Enterprise enterprise;
    private Date createdAt;
    private Date updatedAt;

    public Transaction(long id, String concept, float amount) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static void main(String[] args) {
        Transaction transacion1 = new Transaction(112, "Primera Transacción", 1200000);

        System.out.println("El concepto es: " + transacion1.concept);
        System.out.println("La identificación de la transacción es: " + transacion1.id);
        System.out.println("El monto de la transacción es: " + transacion1.amount);


        Scanner lecturaTransaccion = new Scanner(System.in);
        System.out.println("Introduce el concepto de la transacción:");
        String nuevaTransaccion =lecturaTransaccion.nextLine();

        System.out.println("Introduce el monto de la transacción:");
        String nuevoMonto =lecturaTransaccion.nextLine();


        System.out.println("El nuevo concepto de la transacción es: "+nuevaTransaccion);
        //Se pueden crear montos negativos y positivos
        System.out.println("El nuevo monto de la transacción es: "+nuevoMonto);

    }
}
