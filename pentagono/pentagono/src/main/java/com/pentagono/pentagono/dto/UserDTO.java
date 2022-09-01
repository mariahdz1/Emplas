package com.pentagono.pentagono.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @NotNull
    @NotEmpty
    @Size(min =3, max=80)
    private Integer id;

    @NotNull
    @NotEmpty
    @Size(min =3, max=80)
    private String email;

    @NotNull
    @NotEmpty
    @Size(min =3, max=12)
    private String password;
}
