package com.git.supercar.repository.bo.userbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.git.supercar.model.usermodel.Employee;
import com.git.supercar.model.usermodel.User;
import com.git.supercar.repository.usermodelrepository.EmployeeDao;

@Service
@Transactional
public class EmployeeBoImpl implements EmployeeBo {

	@Autowired
	private EmployeeDao dao;

	
	public int createEmployee(Employee employee) throws Exception {
		return dao.save(employee);
	}

	
	public boolean updateEmployee(Employee employee) throws Exception {
		
		return dao.update(employee);
	}

	
	public boolean deleteEmployee(Employee employee) throws Exception {
		return dao.delete(employee);
	}

	
	public User selectEmployee(int id) throws Exception {
		return dao.find(id);
	}

	
	public List<Employee> selectAllEmployee() throws Exception {
		return dao.findAll();
	}
	
	
}
