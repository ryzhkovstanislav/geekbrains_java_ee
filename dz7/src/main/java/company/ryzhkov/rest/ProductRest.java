package company.ryzhkov.rest;

import company.ryzhkov.api.ProductRepository;
import company.ryzhkov.entity.Product;
import company.ryzhkov.event.AsyncEvent;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/products")
public class ProductRest {

    @Inject
    private ProductRepository productRepository;

    @Inject
    private Event<AsyncEvent> asyncEvent;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducts() {
        asyncEvent.fire(new AsyncEvent()); // запуск асинхронной задачи
        List<Product> products = productRepository.findAll();
        return Response.ok(products).build();
    }
}
