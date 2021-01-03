package be.realshoping.shop.data;

import javax.persistence.*;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String username;
    @Column(name="e_mail", nullable = false)
    private String eMail;
    private String phone;
    @Column(name = "img_url")
    private String imgUtl;
    @Column(nullable = false)
    private String password;
    @Column(name = "check_email")
    private String checkEmail;
    @Column(name = "active_user")
    private boolean activeUser;

    public String getImgUtl() {
        return imgUtl;
    }

    public void setImgUtl(String imgUtl) {
        this.imgUtl = imgUtl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
