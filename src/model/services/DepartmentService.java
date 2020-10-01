package model.services;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class DepartmentService {

    private final DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findaAll(){
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj){
        if (obj.getId() == null)
            dao.insert(obj);
        else
            dao.update(obj);
    }
}
