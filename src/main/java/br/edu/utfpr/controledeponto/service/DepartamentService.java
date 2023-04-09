package br.edu.utfpr.controledeponto.service;

import br.edu.utfpr.controledeponto.model.dao.DepartamentDAO;
import br.edu.utfpr.controledeponto.model.domain.Departament;

public class DepartamentService extends AbstractService<Long, Departament>{

    public DepartamentService() {
        dao = new DepartamentDAO();
    }
}