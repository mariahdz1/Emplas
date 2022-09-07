package com.pentagono.pentagono.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDetailDTO {

    @JsonIgnore
    private Long idTransactionDetail;

    private Transaction transaction;

    private User user;

    private Enterprise enterprise;

    private String concept;

    private float amount;
}
