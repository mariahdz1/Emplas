package com.pentagono.pentagono.dto;

import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {

    private long idTransaction;

    private Employee employee;

    private User user;

    private Enterprise enterprise;

    private String concept;

    private float amount;

    private Date createdAt;

    private Date updatedAt;

    private float balance;
}
