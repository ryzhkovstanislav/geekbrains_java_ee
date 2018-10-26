package company.ryzhkov.servlet;

import company.ryzhkov.api.ProductRepository;
import company.ryzhkov.entity.Product;
import company.ryzhkov.interceptor.LogInterceptor;

import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/index")
@Interceptors({LogInterceptor.class})
public class IndexServlet extends HttpServlet {

    @Inject
    private ProductRepository pr;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = pr.findAll();
        req.setAttribute("products", products);
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
    }
}
