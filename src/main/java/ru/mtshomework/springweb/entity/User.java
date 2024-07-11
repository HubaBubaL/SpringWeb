package ru.mtshomework.springweb.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    @NotNull(message = "Name is null!")
    @NotBlank(message = "Name is null!")
    @Size(min=5, message="Name must be at least 5 characters long")
    String name;

    @Email(message = "Email not valid")
    @NotBlank(message = "email is null!")
    String email;
}
