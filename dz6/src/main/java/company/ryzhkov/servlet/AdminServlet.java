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
import java.util.List;

@WebServlet(urlPatterns = "/admin")
public class AdminServlet extends HttpServlet {

    @Inject
    private ProductRepository productRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = productRepository.findAll();
        req.setAttribute("products", products);
        req.getRequestDispatcher("/WEB-INF/views/admin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String vendorCode = req.getParameter("vendorCode");
        String category = req.getParameter("category");
        int price = Integer.parseInt(req.getParameter("price"));
        String image = req. getParameter("image");
        String description = req.getParameter("description");
        Product product = new Product(vendorCode, category, price, image, description);
        productRepository.persist(product);
        resp.sendRedirect("admin");
    }
}
