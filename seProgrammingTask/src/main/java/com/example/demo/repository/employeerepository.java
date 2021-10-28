/*
 The UK DRI Care Research and Technology Centre Programming Task
 
 Spring Data Repository 
 
 Employee Repository
 
 Developed by: Neeta Patel
 Date: 28/10/2021
 */

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.employee;

@Repository

public interface employeerepository extends JpaRepository<employee, Long>{

}
