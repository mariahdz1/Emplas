/*Código Lina*/

public class User {
    private long id;
    private String email;
    private String password;

    public User(long id, String email, String password){
        this.email=email;
        this.id=id;
        this.password=password;

    }
/*aca volvi a crear los get y set porque estaban void*/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
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
