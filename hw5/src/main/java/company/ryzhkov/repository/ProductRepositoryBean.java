package company.ryzhkov.repository;

import company.ryzhkov.api.ProductRepository;
import company.ryzhkov.entity.Product;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ProductRepositoryBean extends AbstractRepositoryBean implements ProductRepository {
    @Override
    public @NotNull List<Product> findAll() {
        return em.createQuery("SELECT e from Product e", Product.class).getResultList();
    }

    @Override
    public @NotNull Product findById(@Nullable String id) {
        return em.find(Product.class, id);
    }

    public Product persist(Product product) {
        if (product == null) return null;
        em.persist(product);
        return product;
    }

    @Override
    public @Nullable Product merge(@Nullable Product product) {
        if (product == null) return null;
        return em.merge(product);
    }

    @Override
    public void removeById(@Nullable String id) {

    }

    @Override
    public void removeAll() {

    }
}
