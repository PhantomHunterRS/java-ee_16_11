package com.ph.servlet;

import com.ph.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductHttpServlet", urlPatterns = "/products" )
public class ProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);

    private final ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Products");
        req.setAttribute("products",productService.getProductList());
        getServletContext().getRequestDispatcher("/products.jsp").forward(req,resp);
    }

    @Override
    public void init() throws ServletException {
        logger.info("Products init");
        productService.init();
    }
}
