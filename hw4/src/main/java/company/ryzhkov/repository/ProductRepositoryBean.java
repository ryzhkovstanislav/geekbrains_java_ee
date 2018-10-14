package company.ryzhkov.repository;

import company.ryzhkov.api.ProductRepository;
import company.ryzhkov.entity.Product;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.*;

@ApplicationScoped
public class ProductRepositoryBean implements ProductRepository {
    private List<Product> products;

    @PostConstruct
    private void init() {
        products = Arrays.asList(
                new Product("L001", "Ткань кожа", "001sm.jpg", 3000, "Китай"),
                new Product("L002", "Ткань кожа", "002sm.jpg", 3500, "Индия")
        );
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(String id) {
        if (id == null || id.isEmpty()) return null;
        for (Product pr: products) {
            if (pr.getId().equals(id)) return pr;
        }
        return null;
    }

    @Override
    public Product merge(Product product) {
        if (product == null) return null;
        String id = product.getId();
        if (id == null || id.isEmpty()) return null;
        products.add(product);
        return product;
    }

    @Override
    public void removeAll() {
        products.clear();
    }
}
