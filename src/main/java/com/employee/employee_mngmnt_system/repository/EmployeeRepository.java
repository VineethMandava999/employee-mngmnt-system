package com.employee.employee_mngmnt_system.repository;

import com.employee.employee_mngmnt_system.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
