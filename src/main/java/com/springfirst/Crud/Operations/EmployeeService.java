package com.springfirst.Crud.Operations;
import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee employee);
    List<Employee> readEmployees(); 
    boolean deleteEmployee(Long id);
}
