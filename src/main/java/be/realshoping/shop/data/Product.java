package be.realshoping.shop.data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String category;
    private String productModel;
    private String productName;
    private Double price;
    private LocalDate productDataAdd;
    private LocalDate modified;
    private Boolean available;
    private Boolean status;             // show or don't show in the Shop
    private Integer countOfProduct;
    private String description;
    private String extraInfo;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinColumn(name = "productId")
    private List<ProductImage> productImages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getProductDataAdd() {
        return productDataAdd;
    }

    public void setProductDataAdd(LocalDate productDataAdd) {
        this.productDataAdd = productDataAdd;
    }

    public LocalDate getModified() {
        return modified;
    }

    public void setModified(LocalDate modified) {
        this.modified = modified;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(Integer countOfProduct) {
        this.countOfProduct = countOfProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public List<ProductImage> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImage> productImages) {
        this.productImages = productImages;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", productModel='" + productModel + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", productDataAdd=" + productDataAdd +
                ", modified=" + modified +
                ", available=" + available +
                ", status=" + status +
                ", countOfProduct=" + countOfProduct +
                ", description='" + description + '\'' +
                ", extraInfo='" + extraInfo + '\'' +
                '}';
    }
}
