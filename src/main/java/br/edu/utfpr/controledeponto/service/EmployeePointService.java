package br.edu.utfpr.controledeponto.service;

import br.edu.utfpr.controledeponto.model.dao.EmployeePointDAO;
import br.edu.utfpr.controledeponto.model.domain.EmployeePoint;

public class EmployeePointService extends AbstractService<Long, EmployeePoint>{

    public EmployeePointService() {
        dao = new EmployeePointDAO();
    }
}