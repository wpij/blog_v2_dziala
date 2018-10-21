package com.tomaszr.blog.model.forms;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Size;

@Getter
@Setter
@ToString(exclude = "password")
public class RegisterForm {
    @Size(min = 3, message = "Nazwa uzytkownia powinna byc min 3 znaki")
    private String userName;

    @Size(min = 6)
    private String email;

    @Size(min =6 , max = 70)
    private String password;


}
