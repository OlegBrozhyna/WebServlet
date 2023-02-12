package com.example.webservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {

    private List<Customer> customers;

    {
        customers = Arrays.asList(new Customer("Rico", "Jamson",
                "Ukraine", "Lviv",
                " Car ", "GMS", 27_02_2023, 0501231232,
                05, 7777, 1232, 35),
                new Customer("Anje", "Jakson", "German", "Dresden", "Phones",
                        "GS", 22_02_2023 , 0507522526 , 02, 8957, 45));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customers);
        request.setAttribute("customers", getCusomerTable());
        request.getRequestDispatcher("/customers.jsp").forward(request,response);


    }

    private Object getCusomerTable() {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers) {
            sb.append("<tr><td>")
                    .append("<td><td>")
                    .append(customer.getAdres())
                    .append("<td><tr>");


        }
        return sb.toString();


    }
}