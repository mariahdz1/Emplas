package com.pentagono.pentagono.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.model.TransactionDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDTO {

    @Min(1)
    @Max(999)
    private long idTransaction;

    private Employee employee;

    private String concept;

    private boolean enabled;

    private List<TransactionDetailDTO> details;

}
