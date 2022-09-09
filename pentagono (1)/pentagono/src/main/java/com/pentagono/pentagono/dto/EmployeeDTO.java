package com.pentagono.pentagono.dto;

import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.RoleName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @Min(1)
    @Max(999)
    private Long IdEmployee;

    @NotNull
    @NotEmpty
    @Size(min=3,max=50)
    private String name;

    private String identification;

    private Enterprise enterprise;

    private RoleName rolename;
}
