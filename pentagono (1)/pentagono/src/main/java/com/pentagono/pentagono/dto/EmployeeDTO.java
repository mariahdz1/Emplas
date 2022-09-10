package com.pentagono.pentagono.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDTO {

    private Long IdEmployee;
    private EnterpriseDTO Enterprise;
    private String identification;
    private String email;
    private String phone;
    private String name;
    private String image;
    private Date createdAt;
    private Date updateAt;
    private boolean enabled;


}
