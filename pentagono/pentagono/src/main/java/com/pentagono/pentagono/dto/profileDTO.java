package com.pentagono.pentagono.dto;

import com.pentagono.pentagono.model.User;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class profileDTO {

    @NotNull
    @NotEmpty
    private Long idProfile;
    @NotNull
    @NotEmpty
    @Size(min =5, max=30)
    private String phone;
    private String image;
    private User user;
    @NotNull
    private Date createAt;
    @NotNull
    private Date updateAt;
}
