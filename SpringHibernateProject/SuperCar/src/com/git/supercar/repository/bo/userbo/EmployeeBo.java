package com.git.supercar.repository.bo.userbo;

import java.util.List;

import com.git.supercar.model.usermodel.Employee;
import com.git.supercar.model.usermodel.User;

public interface EmployeeBo {

	public int createEmployee(Employee employee)throws Exception;
	public boolean updateEmployee (Employee employee)throws Exception;
	public boolean deleteEmployee (Employee employee)throws Exception;
	public User selectEmployee(int id)throws Exception;
	public List<Employee> selectAllEmployee()throws Exception;
	

}
