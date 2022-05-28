package com.alkemy.ong.auth.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    @NotNull(message="First name can't be null")
    private String firstName;

    @NotNull(message="Last name can't be null")
    private String lastName;

    @NotNull(message="Email can't be null")
    @Email(message = "Invalid email")
    private String email;

    @NotNull(message="Password can't be null")
    private String password;

    @NotNull
    private String photo;

    private String role;

    @Builder
    public UserDto(String firstName, String lastName, String email, String password, String photo, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.photo = photo;
        this.role = role;
    }
}
