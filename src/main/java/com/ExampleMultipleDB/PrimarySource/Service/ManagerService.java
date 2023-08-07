package com.ExampleMultipleDB.PrimarySource.Service;

import com.ExampleMultipleDB.PrimarySource.Entity.Manager;
import com.ExampleMultipleDB.PrimarySource.Repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;


    public List<Manager> getDataSourceManager(){
        return managerRepository.findAll();
    }

}
