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
    private float saldo;

    public Transaction(long id, String concept, float amount, User user, Enterprise enterprise, Date createdAt, Date updatedAt, float saldo) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
        this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.saldo = saldo;
    }

    public Transaction( long id, String concept, float amount) {
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float ingreso(float monto, float amount)  {
        float total = amount + monto;
        setSaldo(total);
        return total;
    }
    public float Gasto(float gasto, float amount)  {
        float total = amount - gasto;
        setSaldo(total);
        return total;
    }

}
