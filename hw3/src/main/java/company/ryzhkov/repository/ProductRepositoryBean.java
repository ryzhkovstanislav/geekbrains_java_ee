package company.ryzhkov.repository;

import company.ryzhkov.api.ProductRepository;
import company.ryzhkov.entity.Product;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@ApplicationScoped
public class ProductRepositoryBean implements ProductRepository {

    @NotNull
    private Map<String, Product> products = new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        merge(new Product("L001", "Ткань кожа", "001sm.jpg", 3000, "Китай"));
        merge(new Product("E001", "Ткань вышивка", "003sm.jpg", 3500, "Китай"));
        merge(new Product("E002", "Ткань вышивка", "004sm.jpg", 4000, "Индонезия"));
    }

    @Override
    @NotNull
    public Collection<Product> findAll() {
        return products.values();
    }

    @Override
    @Nullable
    public Product findById(@Nullable String id) {
        if (id == null || id.isEmpty()) return null;
        return products.get(id);
    }

    @Override
    @Nullable
    public Product merge(@Nullable Product product) {
        if (product == null) return null;
        @Nullable String id = product.getId();
        if (id == null || id.isEmpty()) return null;
        products.put(id, product);
        return product;
    }

    @Override
    public void removeById(@Nullable String id) {
        if (id == null || id.isEmpty()) return;
        if (!products.containsKey(id)) return;
        products.remove(id);
    }

    @Override
    public void removeAll() {
        products.clear();
    }
}
