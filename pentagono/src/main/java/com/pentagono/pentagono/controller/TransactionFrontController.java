package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.service.IEmployeeService;
import com.pentagono.pentagono.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
@RequestMapping("/")
public class TransactionFrontController {

    @Autowired
    private ITransactionService iTransactionService;

    @RequestMapping(value = "/transactionsf", method = RequestMethod.GET)/*Ver Transacciones*/
    public String transactions(Model model) {
        List<Transaction> transactions = this.iTransactionService.getAllTransactions();
        model.addAttribute("transactionsf",transactions);
        return "see_transaction";
    }


}
