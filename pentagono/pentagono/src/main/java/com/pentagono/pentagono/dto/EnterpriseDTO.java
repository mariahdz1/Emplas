package com.pentagono.pentagono.dto;/*jessica 1 sept*/

import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.model.User;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EnterpriseDTO {
    @Min(1)
    @Max(999)
    @NotNull
    @NotEmpty
    private Long idEnterprise;

    @NotNull
    @NotEmpty
    @Size(min =3, max=50)
    private String name;

    @NotNull
    @NotEmpty
    @Size(min=30)
    private String document;

    @Size(min=30)
    private String phone;

    @NotEmpty
    @Size(min=50)
    private String address;

    @NotEmpty
    private User users;

    @Size(min =3, max=50)
    private Transaction transactions;

    @NotEmpty
    private Date createdAt;

    @NotEmpty
    private Date updatedAt;

    /*private boolean enabled;*/

}
