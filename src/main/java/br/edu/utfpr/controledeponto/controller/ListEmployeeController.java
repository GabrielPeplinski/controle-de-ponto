package br.edu.utfpr.controledeponto.controller;

import br.edu.utfpr.controledeponto.model.domain.Employee;
import br.edu.utfpr.controledeponto.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListEmployeeController", value = "/ver-funcionarios")
public class ListEmployeeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeeService employeeService = new EmployeeService();
        List<Employee> employeeList = employeeService.findAll();

        getServletContext().setAttribute("employeeList", employeeList);

        request.getRequestDispatcher("/WEB-INF/view/list-employees-view.jsp").forward(request, response);
    }
}
