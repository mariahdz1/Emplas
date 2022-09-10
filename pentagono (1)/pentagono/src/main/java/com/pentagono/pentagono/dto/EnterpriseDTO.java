package com.pentagono.pentagono.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseDTO {

    @Min(1)
    @Max(999)
    private Long IdEnterprise;

    @NotNull
    @NotEmpty
    @Size(min=3,max=100)
    private String name;

    @NotNull
    @NotEmpty
    private String nit;


    private String phone;


    private String address;


    private Date createdAt;


    private Date updatedAt;

    private boolean enabled;


}
