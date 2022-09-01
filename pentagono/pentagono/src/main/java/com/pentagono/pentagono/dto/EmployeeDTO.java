package com.pentagono.pentagono.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @NotNull
    @NotEmpty
    @Size(min =3, max=80)
    private String name;

    @NotNull
    @NotEmpty
    @Size(min =3, max=80)
    private long id;

    @Size(min =3, max=80)
    private String email;

}
