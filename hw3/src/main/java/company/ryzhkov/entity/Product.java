package company.ryzhkov.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.Nullable;


@Getter
@Setter
@NoArgsConstructor
public class Product extends AbstractEntity {

    @Nullable
    private String vendorCode;

    @Nullable
    private String category;

    @Nullable
    private String image;

    private int price;

    @Nullable
    private String description;

    public Product(
            @Nullable String vendorCode,
            @Nullable String category,
            @Nullable String image,
            int price,
            @Nullable String description
    ) {
        this.vendorCode = vendorCode;
        this.category = category;
        this.image = image;
        this.price = price;
        this.description = description;
    }
}
