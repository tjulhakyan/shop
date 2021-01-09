package be.realshoping.shop.data;

import javax.persistence.*;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nikName;
    private String name;
    private String surname;
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

    @ManyToOne
    private Role role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNikName() {
        return nikName;
    }

    public void setNikName(String nikName) {
        this.nikName = nikName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUtl() {
        return imgUtl;
    }

    public void setImgUtl(String imgUtl) {
        this.imgUtl = imgUtl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCheckEmail() {
        return checkEmail;
    }

    public void setCheckEmail(String checkEmail) {
        this.checkEmail = checkEmail;
    }

    public boolean isActiveUser() {
        return activeUser;
    }

    public void setActiveUser(boolean activeUser) {
        this.activeUser = activeUser;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nikName='" + nikName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phone='" + phone + '\'' +
                ", imgUtl='" + imgUtl + '\'' +
                ", password='" + password + '\'' +
                ", checkEmail='" + checkEmail + '\'' +
                ", activeUser=" + activeUser +
                '}';
    }
}
