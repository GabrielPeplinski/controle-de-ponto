package br.edu.utfpr.controledeponto.controller;

import br.edu.utfpr.controledeponto.model.domain.EmployeePoint;
import br.edu.utfpr.controledeponto.service.EmployeePointService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListEmployeePointsController", value = "/ver-registros")
public class ListEmployeePointsController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeePointService employeePointService = new EmployeePointService();
        List<EmployeePoint> employeePointList = employeePointService.findAll();

        getServletContext().setAttribute("employeePointList", employeePointList);

        request.getRequestDispatcher("/WEB-INF/view/list-employees-points-view.jsp").forward(request, response);
    }
}
