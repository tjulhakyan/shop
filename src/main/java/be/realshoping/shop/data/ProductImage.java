package be.realshoping.shop.data;

import javax.persistence.*;

@Entity(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String imgUrl;

    @ManyToOne
    private Product product;

    public ProductImage() {
    }

    public ProductImage(String imgUrl, Product product){
        this.imgUrl=imgUrl;
        this.product=product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {

        return "ProductImage{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", product=" + product +
                '}';
    }
}
