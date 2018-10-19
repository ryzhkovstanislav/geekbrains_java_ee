package company.ryzhkov.servlets;

import company.ryzhkov.api.ProductRepository;
import company.ryzhkov.entity.Product;
import company.ryzhkov.repository.ProductRepositoryBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/admin")
public class AdminServlet extends HttpServlet {

    @Inject
    private ProductRepository productRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/admin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product newProduct = new Product();
        newProduct.setVendorCode(req.getParameter("vendorCode"));
        newProduct.setCategory(req.getParameter("category"));
        // Вот здесь выдает абракадабру
        System.out.println(req.getParameter("category"));
        newProduct.setPrice(Integer.parseInt(req.getParameter("price")));
        newProduct.setImage(req.getParameter("image"));
        newProduct.setDescription(req.getParameter("description"));
        productRepository.persist(newProduct);
        resp.sendRedirect("admin");
    }
}
