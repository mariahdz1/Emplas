package com.pentagono.pentagono.dto;

import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EnterpriseDTO {
    @Min(1)
    @Max(999)
    @NotNull
    @NotEmpty
    private Integer idEnterprise;

    @NotNull
    @NotEmpty
    @Size(min =3, max=50)
    private String nameEnterprise;

    @NotNull
    @NotEmpty
    @Size(min=30)
    private String documentEnterprise;

    @Size(min=30)
    private String phoneEnterprise;

    @Size(min=50)
    private String addressEnterprise;

}
