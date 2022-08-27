import java.util.Date;
/*Codigo Lina*/
public class Profile {
    private long id;/*este dato fuera del constructor por ser unico*/
    private String image;
    private String phone;
    private User user;
    private Date createdAt;/*este dato fuera del constructor por ser unico*/
    private Date updatedAt;/*este dato fuera del constructor por ser unico*/

    public Profile(String image, String phone, User user) {
        this.image = image;
        this.phone = phone;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
