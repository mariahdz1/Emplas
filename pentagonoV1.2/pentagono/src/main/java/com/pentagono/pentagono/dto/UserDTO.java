package com.pentagono.pentagono.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @Size(min =3, max=80)
    private Integer idUser;

    @NotNull
    @NotEmpty
    @Size(min =3, max=12)
    private String password;

    private Date createdAt;

    private Date updateAt;
}
