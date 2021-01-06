package be.realshoping.shop.data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;
    private String role;

    @OneToMany/*(mappedBy = "role", cascade = CascadeType.PERSIST)*/
    private List<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
