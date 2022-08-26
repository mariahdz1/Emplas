import java.util.Date;

public class Empleado {
    private long id;
    private String nombre;
    private String email;
    private Profile profile;
    private Enum_RoleName role;
    private Empresa empresa;
    private Transaction[] transactions;
    private Date createdAt;
    private Date updatedAt;

    public Empleado(long id, String nombre, String email, Profile profile, Enum_RoleName role, Empresa empresa, Transaction[] transactions, Date createdAt, Date updatedAt) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.empresa = empresa;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Empresa getEmpresa() {return empresa;}

    public void setEnterprise(Empresa enterprise) {
        this.empresa = enterprise;
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
