package company.ryzhkov.servlet;

import company.ryzhkov.api.ProductRepository;
import company.ryzhkov.entity.Product;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    @Inject
    private ProductRepository productRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Product product = productRepository.findById(id);
        req.setAttribute("product", product);
        if (product == null) {
            req.getRequestDispatcher("/error.html").forward(req, resp);
        } else {
            req.getRequestDispatcher("/WEB-INF/views/product.jsp").forward(req, resp);
        }
    }
}
