package company.ryzhkov.api;

import company.ryzhkov.entity.Product;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.ejb.LocalBean;
import java.util.List;

//@LocalBean
public interface ProductRepository {

    @NotNull
    List<Product> findAll();

    @NotNull
    Product findById(@Nullable String id);

    Product persist(@Nullable Product product);

    @Nullable
    Product merge(@Nullable Product product);

    void removeById(@Nullable String id);

    void removeAll();
}
