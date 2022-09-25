/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Keith
 * 
 * @version September 22, 2022
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String invalid;
        int result;
        String operation = request.getParameter("operation");
        String first = request.getParameter("first");
        String second = request.getParameter("second");

        request.setAttribute("operation", operation);
        request.setAttribute("first", first);
        request.setAttribute("second", second);

        if (first == null || first.equals("") || second == null || second.equals("")) {
            invalid = "invalid";

            request.setAttribute("result", invalid);
        } else {
            try {
                int firstNum = Integer.parseInt(first);
                int secondNum = Integer.parseInt(second);

                switch (operation) {
                    case "+":
                        result = firstNum + secondNum;
                        request.setAttribute("result", result);
                        break;
                    case "-":
                        result = firstNum - secondNum;
                        request.setAttribute("result", result);
                        break;
                    case "*":
                        result = firstNum * secondNum;
                        request.setAttribute("result", result);
                        break;
                    case "%":
                        result = firstNum % secondNum;
                        request.setAttribute("result", result);
                        break;
                }
            } catch (NumberFormatException e) {
                invalid = "invalid";

                request.setAttribute("result", invalid);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

}