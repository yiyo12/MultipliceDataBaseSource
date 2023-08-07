package com.ExampleMultipleDB.PrimarySource.Repository;

import com.ExampleMultipleDB.PrimarySource.Entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
