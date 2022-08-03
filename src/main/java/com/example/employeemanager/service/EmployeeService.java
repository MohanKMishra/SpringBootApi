package com.example.employeemanager.service;

import com.example.employeemanager.model.Employee;
import com.example.employeemanager.repo.EmployeeRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
//@Deprecated
public class EmployeeService {
    private final EmployeeRepo employeeRepo;


//    public EmployeeService(EmployeeRepo employeeRepo) {
//        this.employeeRepo = employeeRepo;
//    }
    public Employee addEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployees(){

        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findById(id).orElse(null);
    }

    public void deleteEmployee(Employee id){
        employeeRepo.delete(id);
    }
}

