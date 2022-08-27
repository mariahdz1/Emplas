import java.util.Date;
/*codigo Alexander*/
public class Employee {
    private String name;
    private long id;
    private String email;
    private Profile profile;
    private Enum_RoleName role;
    private Enterprise enterprise;
    private Transaction[] transactions;
    private Date createdAt;
    private Date updatedAt;

    public Employee(String name, String email, Enum_RoleName role) {
        this.email = email;
        this.role = role;
        this.name = name;
    }

    public String getName() { return name;}

    public void setName(String name) {this.name = name;}

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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RoleName getRole() {
        return role;
    }

    public void setRole(Enum_RoleName role) {
        this.role = role;
    }

    public String getEnterprise() {
        return this.enterprise.getName();
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
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

}
