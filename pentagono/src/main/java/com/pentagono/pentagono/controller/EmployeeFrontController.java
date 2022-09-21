package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class EmployeeFrontController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @RequestMapping(value = "/employeesf", method = RequestMethod.GET)
    public String employees(Model model) {
        List<Employee> employees =this.iEmployeeService.getAllEmployees();
        model.addAttribute("employeesf",employees);
        return "see_employee";
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){return iEmployeeService.createEmployee(employee);}


}