package com.springboot.RestAPIwithDataJPAandMySQL.service;

import com.springboot.RestAPIwithDataJPAandMySQL.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);
}
