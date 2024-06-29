package com.uno.ecommerce.costomer;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest (
    String id,

    @NotNull(message = "Customer firstname is required")
    String firstName,
    @NotNull(message = "Customer lastName is required")
    String lastName,
    @NotNull(message = "Customer email is required")
    @Email(message = "Not valid email address")
    String email,
    Address address
)
{

}
