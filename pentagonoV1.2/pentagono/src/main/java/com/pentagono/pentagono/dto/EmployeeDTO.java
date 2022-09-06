package com.pentagono.pentagono.dto;

import com.pentagono.pentagono.model.ERoleName;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {


    private Long idEmployee;

    private Enterprise enterprise;

    private Transaction transaction;

    private String identification;

    private String email;

    private String phone;

    private String name;

    private String image;

    private Date createdAt;

    private Date updateAt;

    private ERoleName rolename;


}
