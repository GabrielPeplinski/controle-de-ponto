package br.edu.utfpr.controledeponto.controller;

import br.edu.utfpr.controledeponto.model.domain.Departament;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DepartamentController", value = "/listar/setores")
public class ListDepartamentsController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Departament> departamentList = (List<Departament>) getServletContext().getAttribute("departaments");

        getServletContext().setAttribute("departaments", departamentList);

        request.getRequestDispatcher("/funcionarios").forward(request, response);
    }
}
