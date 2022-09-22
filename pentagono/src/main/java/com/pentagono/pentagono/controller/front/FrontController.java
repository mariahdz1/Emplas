package com.pentagono.pentagono.controller.front;

import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.service.IEmployeeService;
import com.pentagono.pentagono.service.IEnterpriseService;
import com.pentagono.pentagono.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class FrontController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }


    /*CODIGO PARA EMPLEADO*/
    @Autowired
    private IEmployeeService iEmployeeService;

    @RequestMapping(value = "/employeeS", method = RequestMethod.GET)
    public String employeeS(Model model) {
        List<Employee> employees = this.iEmployeeService.getAllEmployees();
        model.addAttribute("employeeS", employees);
        return "see_employee";
    }

    /*CODIGO PARA EMPRESA*/

    @Autowired
    private IEnterpriseService iEnterpriseService;

    @RequestMapping(value = "/enterpriseS", method = RequestMethod.GET)/*Ver Empresas*/
    public String enterpriseS(Model model) {
        List<Enterprise> enterprises = this.iEnterpriseService.getAllEnterprises();
        model.addAttribute("enterpriseS", enterprises);
        return "see_enterprise";
    }


    /*CODIGO PARA TRANSACCION*/

    @Autowired
    private ITransactionService iTransactionService;


    @RequestMapping(value = "/transactionS", method = RequestMethod.GET)/*Ver Transacciones*/
    public String transactionS(Model model) {
        List<Transaction> transactions = this.iTransactionService.getAllTransactions();
        model.addAttribute("transactionS", transactions);
        return "see_transaction";

    }
}