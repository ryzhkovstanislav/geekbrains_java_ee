package company.ryzhkov.controller;


import com.ocpsoft.pretty.faces.annotation.URLMapping;
import company.ryzhkov.api.ProductRepository;
import company.ryzhkov.entity.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
@URLMapping(id = "catalog", pattern = "/catalog", viewId = "/WEB-INF/views/catalog.xhtml")
public class CatalogController implements Serializable {

    @Inject
    private ProductRepository pr;

    public List<Product> getProducts() {
        return pr.findAll();
    }
}
