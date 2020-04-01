package com.springboot.RestAPIwithDataJPAandMySQL.service.impl;

import com.springboot.RestAPIwithDataJPAandMySQL.entity.Employee;
import com.springboot.RestAPIwithDataJPAandMySQL.repository.EmployeeRepository;
import com.springboot.RestAPIwithDataJPAandMySQL.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> retrieveEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    public Employee getEmployee(Long employeeId) {
       // Optional<Employee> optEmp = employeeRepository.findById(employeeId);
        Optional<Employee> optEmp = Optional.ofNullable(employeeRepository.findOne(employeeId)); //GR
        return optEmp.get();
    }

    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeId){
       // employeeRepository.deleteById(employeeId);
        employeeRepository.delete(employeeId); //GR
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
