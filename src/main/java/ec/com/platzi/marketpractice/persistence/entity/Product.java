package ec.com.platzi.marketpractice.persistence.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="products")
public class Product {
    /*Good practice: Use @Column annotation for make diference between table's fields name and attributes name
    @Column(name="theNameYouWantInTheTable")*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Long productId;

    private String name;

    @Column(name="category_id")
    private Long categoryId;

    private String barcode;

    @Column(name="sale_price")
    private Double salePrice;

    private Integer stock;

    private Boolean status;



}
