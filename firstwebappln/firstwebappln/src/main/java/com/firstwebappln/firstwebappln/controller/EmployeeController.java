package com.firstwebappln.firstwebappln.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.firstwebappln.firstwebappln.model.Employee;
import com.firstwebappln.firstwebappln.service.EmployeeService;

@Controller
public class EmployeeController {
	 @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String listAll(Model model) {
        List<Employee> listEmployees = employeeService.getAllEmployees();
        model.addAttribute("listEmployees",listEmployees);
        return "index";
    }
}
