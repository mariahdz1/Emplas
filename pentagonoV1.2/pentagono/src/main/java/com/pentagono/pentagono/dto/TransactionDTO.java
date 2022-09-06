package com.pentagono.pentagono.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {

    private long idTransaction;

    private String concept;

    private float amount;

    private Date createdAt;

    private Date updatedAt;

    private float balance;
}
