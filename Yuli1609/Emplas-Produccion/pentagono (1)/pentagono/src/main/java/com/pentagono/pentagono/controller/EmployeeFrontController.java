package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")/*llama al HOME*/
public class EmployeeFrontController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }



}