package company.ryzhkov.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product extends AbstractEntity {

    @Column(nullable = false, unique = true)
    private String vendorCode;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int price;

    @Column
    private String image;

    @Column
    private String description;
}
