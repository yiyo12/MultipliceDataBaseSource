package com.ExampleMultipleDB.SecondarySource.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

        @GeneratedValue(strategy = GenerationType.AUTO)
        @Id
        private int id;
        private String name;
        private int salary;


}
