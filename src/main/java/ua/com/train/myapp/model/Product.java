package ua.com.train.myapp.model;


import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Integer productId;
    @Column
    private String productName;
    @Column
    private double productCost;
    @Column
    private String productDescription;
    @Column
    private String productManufacturer;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer priductId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCost=" + productCost +
                ", productDescription='" + productDescription + '\'' +
                ", productManufacturer='" + productManufacturer + '\'' +
                '}';
    }
}
