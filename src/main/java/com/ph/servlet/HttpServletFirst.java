package com.ph.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(name = "HttpServletFirst", urlPatterns = "http_servlet_first")
public class HttpServletFirst extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(HttpServletFirst.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       logger.info("New get request fot HttpServletFirst ");
       logger.info(req.getContextPath());
       logger.info(req.getServletPath());
       logger.info(req.getQueryString());
       resp.setHeader("content-type","text/html; charset = utf-8");
       resp.getWriter().println("<h1>NEW GET REQUEST</h1>");
       resp.getWriter().printf("<h3>New GET request with parameters param1 = %s; param2 = %s</h3>",
               req.getParameter("param1"),req.getParameter("param2"));
       getServletContext().getRequestDispatcher("/new_servlet")
       .forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New POST request fot HttpServletFirst ");
        resp.getWriter().println("<h1>NEW GET REQUEST</h1>");
        resp.getWriter().printf("<h1>Echo: %s </h1>",readAllLines(req.getReader()));
    }

    private String readAllLines(BufferedReader reader) throws IOException{
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null){
            content.append(line);
            content.append(System.lineSeparator());
        }
        return content.toString();
    }
}
