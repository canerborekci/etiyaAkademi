package northwind.business.abstracts;

import java.util.List;

import northwind.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> GetAll();

	void add(Employee employee);
}
