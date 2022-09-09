package com.pentagono.pentagono.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.RoleName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {

    @Min(1)
    @Max(999)
    private Long idUser;

    private Enterprise enterprise;

    private RoleName rolename;
}
