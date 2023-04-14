package br.edu.utfpr.controledeponto.controller;

import br.edu.utfpr.controledeponto.model.domain.Departament;
import br.edu.utfpr.controledeponto.service.DepartamentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DepartamentController", value = "/setores")
public class DepartamentController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/create-departament-view.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String code =  request.getParameter("code");

        List<Departament> departamentList = (List<Departament>) getServletContext().getAttribute("departaments");

        if (departamentList == null) {
            departamentList = new ArrayList<>();
            getServletContext().setAttribute("departaments", departamentList);
        }

        Departament departament = new Departament(name, code);
        DepartamentService service = new DepartamentService();
        service.save(departament);

        response.sendRedirect("/controle-de-ponto");
    }
}
