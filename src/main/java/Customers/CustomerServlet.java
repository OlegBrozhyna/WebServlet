package Customers;

import Customers.Customer;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private List<Customer> customers
            = Arrays.asList(new Customer("Rico", "Jamson",
                    "Ukraine", "Lviv",
                    " ferrum ", "GMS", 27_02_2023, 0501231232,
                    05, 7777, 1232, 135),
            new Customer("Josh", "Inovich", "German", "Dresden", "Plastic",
                    "PSVM", 22_05_2023,
                    0502177575, 5, 8575, 8521, 43),
            new Customer("Bodi", "Forester", "USA", "New York", "Trees",
                    "ForIst", 28_03_2023, 825456241, 88,
                    2136, 9986, 225),
            new Customer("Alex", "Bordi", "Kanada", "Toronto", "IceCream",
                    "IceMan", 30_03_2023, 845211587, 54, 4545,
                    8086, 138),
            new Customer("Bojik", "Hecy", "Turkey", "İstanbul", "Cream",
                    "Man", 10_04_2023, 845223587, 45, 4545, 8986,
                    248),
            new Customer("Grogu", "Heny", "Georgia", "Tbilisi", "Aqua",
                    "Broj", 15_05_2023, 846623587, 35, 4123, 8226,
                    58),
            new Customer("Josh", "Werkam", "Germany", "Berlin", "Meet",
                    "MakeBurg", 30_06_2023, 845223387, 15, 0045, 1186,
                    528),
            new Customer("Maria", "Paula", "USA", "Texas", "cucumber",
                    "TexAvary", 23_09_2023, 845223887, 40, 4111, 2226,
                    1000),
            new Customer("Anrea", "Pluto", "Italia", "Rome", "Coffe",
                    "Romul", 25_08_2023, 845223007, 145, 0145, 6686,
                    548),
            new Customer("Georg", "Horen", "USA", "Arizona", "Wood",
                    "WoodMax", 16_02_2023, 845299587, 85, 1098, 1298,
                    945),
            new Customer("Galagan", "Fediron", "Africa", "Nairobi", "Сorn",
                    "AFN", 18_03_2023, 845993587, 95, 6645, 6556,
                    240),
            new Customer("Zhanna", "Zgoretska", "Ukraine", "Kyiv", "Paper",
                    "KyPer", 30_06_2023, 366123587, 34, 41225, 1126,
                    546),
            new Customer("Wayne", "Westeber", "GB", "London", "Anie",
                    "RestBin", 15_02_2023, 841113587, 1233, 7355, 0276,
                    111),
            new Customer("Anjey", "Dori", "Poland", "Krakow", "Wheat",
                    "WheatProf", 10_06_2023, 845223007, 123, 1025, 8006,
                    999));

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customers);
        request.getRequestDispatcher("/customers.jsp").forward(request, response);

    }
}