package company.ryzhkov.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends AbstractEntity {

    @Column(nullable = false, unique = true)
    private String vendorCode;

    @Column
    private String category;

    @Column
    private int price;

    @Column
    private String image;

    @Column
    private String description;
}
