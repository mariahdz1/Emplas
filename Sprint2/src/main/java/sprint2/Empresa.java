package sprint2;

import java.util.Date;

public class Empresa {

    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private User[] users;
    private Transaction[] transactions;
    private Date createdAt;
    private Date updatedAt;

    public Empresa() {

    }

    public Empresa(long id, String name, String document, String phone, String address, User[] users, Transaction[] transactions, Date createdAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.users = users;
        this.transactions = transactions;
        this.createdAt = createdAt;       
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

    public void setAddress(String address) {
        this.address = address;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
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
        Empresa empresa1 = new Empresa();
        empresa1.setId(24372701);
        empresa1.setName("Emplas S.A");
        empresa1.setDocument("2437");
        empresa1.setPhone("5550555");
        empresa1.setAddress("Cra1 No 23");

        System.out.println(empresa1.getId());
        System.out.println(empresa1.getName());
        System.out.println(empresa1.getDocument());
        System.out.println(empresa1.getPhone());
        System.out.println(empresa1.getAddress());


    }
}
