package company.ryzhkov.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Product extends AbstractEntity {
    private String vendorCode;
    private String category;
    private String image;
    private int price;
    private String description;

    public Product(String vendorCode, String category, String image, int price, String description) {
        this.vendorCode = vendorCode;
        this.category = category;
        this.image = image;
        this.price = price;
        this.description = description;
    }
}
