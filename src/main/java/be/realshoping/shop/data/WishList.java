package be.realshoping.shop.data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "wish_list")
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDate dateOfAdd;

    @ManyToOne
    private User user;

    @OneToOne
    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateOfAdd() {
        return dateOfAdd;
    }

    public void setDateOfAdd(LocalDate dateOfAdd) {
        this.dateOfAdd = dateOfAdd;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
