package com.pentagono.pentagono.dto;

import com.pentagono.pentagono.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {

    @Min(1)
    @Max(999)
    private long idTransaction;

    private Employee employee;

    private String concept;
}
