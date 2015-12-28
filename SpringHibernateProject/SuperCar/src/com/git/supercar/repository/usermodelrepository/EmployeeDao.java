package com.git.supercar.repository.usermodelrepository;

import java.util.List;

import com.git.supercar.model.usermodel.Employee;

public interface EmployeeDao {



	public int save(final Employee employee);
	public boolean update (final Employee employee);
	public boolean delete (final Employee employee);
	public Employee find (final int id);
	public List<Employee> findAll();
	
}
