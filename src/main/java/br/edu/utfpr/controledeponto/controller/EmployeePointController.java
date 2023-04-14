package br.edu.utfpr.controledeponto.controller;

import br.edu.utfpr.controledeponto.model.domain.Departament;
import br.edu.utfpr.controledeponto.model.domain.Employee;
import br.edu.utfpr.controledeponto.model.domain.EmployeePoint;
import br.edu.utfpr.controledeponto.service.DepartamentService;
import br.edu.utfpr.controledeponto.service.EmployeePointService;
import br.edu.utfpr.controledeponto.service.EmployeeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeePointController", value = "/registros-funcionarios")
public class EmployeePointController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EmployeeService employeeService = new EmployeeService();
        List<Employee> employeeList = employeeService.findAll();

        getServletContext().setAttribute("employeeList", employeeList);

        request.getRequestDispatcher("/WEB-INF/view/create-employee-point-view.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String employeeId = request.getParameter("employee");

        List<EmployeePoint> employeePointList = (List<EmployeePoint>) getServletContext().getAttribute("employeesPointList");

        if (employeePointList == null) {
            employeePointList = new ArrayList<>();
            getServletContext().setAttribute("employeesPointList", employeePointList);
        }

        EmployeeService employeeService = new EmployeeService();
        Employee employee = employeeService.getById(Long.parseLong(employeeId));

        EmployeePoint employeePoint = new EmployeePoint(employee);
        EmployeePointService service = new EmployeePointService();
        service.save(employeePoint);

        response.sendRedirect("/controle-de-ponto");
    }
}
