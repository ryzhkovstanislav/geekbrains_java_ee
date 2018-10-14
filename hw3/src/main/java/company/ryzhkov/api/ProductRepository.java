package company.ryzhkov.api;

import company.ryzhkov.entity.Product;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;


public interface ProductRepository {

    @NotNull
    Collection<Product> findAll();

    @Nullable
    Product findById(@Nullable String id);

    @Nullable
    Product merge(@Nullable Product product);

    void removeById(@Nullable String id);

    void removeAll();
}
