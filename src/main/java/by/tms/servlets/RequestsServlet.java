package by.tms.servlets;

import by.tms.dao.CalculationDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/history")
public class RequestsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder result = new StringBuilder();
        for (String s: CalculationDAO.getRequests()) {
            result.append(s);
        }
        resp.getWriter().print(result);
    }
}
