package com.pentagono.pentagono.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleName {

    @NotNull
    @NotEmpty
    private Long idRole;

    private String name;

    private boolean enabled;

}
