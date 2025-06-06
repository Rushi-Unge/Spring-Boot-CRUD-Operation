package com.springfirst.Crud.Operations;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

       @Autowired
       private EmployeeRepository employeeRepository;


       List<Employee> employees = new ArrayList<>();
       @Override
       public String createEmployee(Employee employee){
              EmployeeEntity employeeEntity = new EmployeeEntity();
              BeanUtils.copyProperties(employee, employeeEntity);
              employees.add(employee);
              return "Saved Successfully";
       }

       @Override
       public List<Employee> readEmployees(){
              return employees;
       }


       @Override
       public boolean deleteEmployee(Long id){
              return employees.removeIf(emp -> emp.getId().equals(id)); 
       }

}
