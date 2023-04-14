package br.edu.utfpr.controledeponto.controller;

import br.edu.utfpr.controledeponto.model.domain.Departament;
import br.edu.utfpr.controledeponto.model.domain.Employee;
import br.edu.utfpr.controledeponto.service.DepartamentService;
import br.edu.utfpr.controledeponto.service.EmployeeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeeController", value = "/funcionarios")
public class EmployeeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DepartamentService departamentService = new DepartamentService();
        List<Departament> departamentList = departamentService.findAll();

        getServletContext().setAttribute("departaments", departamentList);

        request.getRequestDispatcher("/WEB-INF/view/create-employee-view.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String cpf =  request.getParameter("cpf");
        String setor = request.getParameter("setor");

        List<Employee> employeeList = (List<Employee>) getServletContext().getAttribute("employees");

        if (employeeList == null) {
            employeeList = new ArrayList<>();
            getServletContext().setAttribute("employees", employeeList);
        }

        DepartamentService departamentService = new DepartamentService();
        Departament departament = departamentService.getById(Long.parseLong(setor));

        Employee employee = new Employee(name, cpf, departament);
        EmployeeService service = new EmployeeService();
        service.save(employee);
    }
}
