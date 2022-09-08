package com.pentagono.pentagono.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseDTO {

    @Min(1)
    @Max(999)
    private Long IdEnterprise;

    @NotNull
    @NotEmpty
    @Size(min=3,max=50)
    private String name;

}
