
package com.mycompany.sprint2;

public class User {

    private int id;
    private String email;
    private String password;

    public User(int id, String email, String password){
        this.email=email;
        this.id=id;
        this.password=password;

    }

    public void getId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getEmail(String email) {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

