package by.tms.servlets;

import by.tms.exceptions.OperationTypeException;
import by.tms.dao.CalculationDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            double num1 = Double.parseDouble(req.getParameter("num1"));
            double num2 = Double.parseDouble(req.getParameter("num2"));
            int oType = Integer.parseInt(req.getParameter("action"));
            resp.getWriter().print(CalculationDAO.calc(num1, num2, oType));
        } catch (OperationTypeException | NumberFormatException e) {
            resp.getWriter().print(e.getMessage());
        }
    }
}
