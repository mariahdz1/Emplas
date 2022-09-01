package com.pentagono.pentagono.dto;/*Jessica 1 sept*/

import com.pentagono.pentagono.model.Enum_RoleName;
import com.pentagono.pentagono.model.Profile;
import com.pentagono.pentagono.model.Transaction;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {


    private Long idEmployee;

    @NotNull
    private String name;
    private Profile profile;
    private Enum_RoleName rol;
    private Transaction transaction;
    @NotNull
    private Date createdAt;
    @NotNull
    private Date updateAt;


}
