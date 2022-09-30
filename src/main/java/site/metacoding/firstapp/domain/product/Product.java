package site.metacoding.firstapp.domain.product;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Product {
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private Integer productQty;
    private Timestamp createdAt;

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    private Product() {

    } // MyBatis에게 필요한 것

    public Product(String productName, Integer productPrice, Integer productQty) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQty = productQty;
    }

    public void update(Product product) { // 수정할 수 있는 것만 넣기
        this.productName = product.getProductName();
        this.productPrice = product.getProductPrice();
        this.productQty = product.getProductQty();
    }

}