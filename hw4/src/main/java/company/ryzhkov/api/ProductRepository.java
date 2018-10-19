package company.ryzhkov.api;


import company.ryzhkov.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    Product findById(String id);

    Product merge(Product product);

    void removeAll();
}
