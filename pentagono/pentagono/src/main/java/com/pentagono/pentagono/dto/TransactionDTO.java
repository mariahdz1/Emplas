package com.pentagono.pentagono.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {

    @NotNull
    @NotEmpty
    @Size(min =3, max=80)
    private long id;

    @NotNull
    @NotEmpty
    @Size(min =3, max=100)
    private String concept;

    @NotNull
    @NotEmpty
    @Size(min =2, max=20)
    private float amount;

    @NotNull
    @NotEmpty
    @Size(min =2, max=20)
    private float balance;
}
