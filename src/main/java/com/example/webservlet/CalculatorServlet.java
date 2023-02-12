package com.example.webservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        calculate(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        calculate(request, response);
    }

    private void calculate(HttpServletRequest request,
                           HttpServletResponse response) throws IOException {
        Integer a = Integer.valueOf(request.getParameter("a"));
        Integer b = Integer.valueOf(request.getParameter("b"));
        String operation = request.getParameter("operation");
        switch (operation) {
            case "plus":
                response.getWriter().println("<H1>" + (a + b) + "</H1>");
                break;
        }
    }
}