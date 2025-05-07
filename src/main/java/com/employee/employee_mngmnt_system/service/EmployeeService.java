package com.employee.employee_mngmnt_system.service;

import com.employee.employee_mngmnt_system.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee createEmployee(Employee employee);
    void deleteEmployee(Long id);
}
