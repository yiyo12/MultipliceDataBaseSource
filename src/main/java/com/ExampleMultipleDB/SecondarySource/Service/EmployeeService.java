package com.ExampleMultipleDB.SecondarySource.Service;

import com.ExampleMultipleDB.SecondarySource.Entity.Employee;
import com.ExampleMultipleDB.SecondarySource.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getDataSourceEmployee(){

        return employeeRepository.findAll();

    }

}
