package com.firstwebappln.firstwebappln.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import com.firstwebappln.firstwebappln.model.*;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

    List<Employee>findAll();

}