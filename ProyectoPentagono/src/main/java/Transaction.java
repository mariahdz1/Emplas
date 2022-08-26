import java.util.Date;
public class Transaction {
    private long id;
    private String concept;
    private float amount;
    private Enterprise enterprise;
    private Date createdAt;
    private Date updatedAt;

    public Transaction(long id, String concept, float amount, Enterprise enterprise, Date createdAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.enterprise = enterprise;
        this.createdAt = createdAt;


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




}


