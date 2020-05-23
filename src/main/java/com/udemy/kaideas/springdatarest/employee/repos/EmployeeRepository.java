package com.udemy.kaideas.springdatarest.employee.repos;

import com.udemy.kaideas.springdatarest.employee.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
