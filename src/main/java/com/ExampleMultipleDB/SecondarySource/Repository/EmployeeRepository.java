package com.ExampleMultipleDB.SecondarySource.Repository;

import com.ExampleMultipleDB.SecondarySource.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
