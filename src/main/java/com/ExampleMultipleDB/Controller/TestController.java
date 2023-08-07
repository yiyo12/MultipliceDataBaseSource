package com.ExampleMultipleDB.Controller;

import com.ExampleMultipleDB.SecondarySource.Entity.Employee;
import com.ExampleMultipleDB.PrimarySource.Entity.Manager;
import com.ExampleMultipleDB.SecondarySource.Service.EmployeeService;
import com.ExampleMultipleDB.PrimarySource.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    //Inject Service
    @Autowired
    EmployeeService employeeService;
    @Autowired
    ManagerService managerService;
    @GetMapping("/manager")
    public List<Manager> getDataSource2(){
        return managerService.getDataSourceManager();
    }

    @GetMapping("/employee")
    public List<Employee> getDataSource1(){
       return employeeService.getDataSourceEmployee();
    }

}
