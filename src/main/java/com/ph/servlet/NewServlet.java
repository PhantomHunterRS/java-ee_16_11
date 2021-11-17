package com.ph.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class NewServlet implements Servlet {

    private static Logger logger = LoggerFactory.getLogger(NewServlet.class);
    private transient ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("New request to NewServlet");
        servletResponse.getWriter().println("<h1>My First Servlet</h1>");
    }

    @Override
    public String getServletInfo() {
        return "NewServlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet destroyed");
    }
}
