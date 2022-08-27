import java.util.Date;

/*codigo Yulieth*/
public class Transaction {
    private long id;
    private String concept;
    private float amount;
    private User user;
    private Enterprise enterprise;
    private Date createdAt;
    private Date updatedAt;
    private float balance;

    public Transaction(String concept, float amount, User user, Enterprise enterprise) {
        this.concept = concept;
        this.amount = amount;
        this.user = user;
        this.enterprise = enterprise;
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

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float ingreso(float ingreso, float monto)  {
        float total = ingreso + monto;
        setBalance(total);
        return total;
    }
    public float Gasto(float gasto, float monto)  {
        float total = monto - gasto;
        setBalance(total);
        return total;
    }
}


