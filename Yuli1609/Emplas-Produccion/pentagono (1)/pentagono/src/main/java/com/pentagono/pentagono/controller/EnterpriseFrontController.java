package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.service.IEmployeeService;
import com.pentagono.pentagono.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")/*llama al
 roller {

    @Autowired
    private IEnterpriseService iEnterpriseService;


    @RequestMapping(value = "/enterprisesForm", method = RequestMethod.GET)/*Ver Empresas*/
    public String enterprises(Model model) {
        List<Enterprise> enterprises = this.iEnterpriseService.getAllEnterprises();
        model.addAttribute("employees",enterprises);
        return "VerEmpresa";
    }
}
