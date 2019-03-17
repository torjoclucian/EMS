package com.employment.training.employeemanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    //TODO this bellow will be a new entity(nu baga in seama comentul asta)
    private String department;
    private Double salary;
    private String currency;
    private String role;
    private Integer experience;
}
