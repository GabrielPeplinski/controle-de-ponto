package br.edu.utfpr.controledeponto.service;

import br.edu.utfpr.controledeponto.domain.Employee;
import br.edu.utfpr.controledeponto.model.dao.EmployeeDAO;

public class EmployeeService extends AbstractService<Long, Employee>{

    public EmployeeService() {
        dao = new EmployeeDAO();
    }
}