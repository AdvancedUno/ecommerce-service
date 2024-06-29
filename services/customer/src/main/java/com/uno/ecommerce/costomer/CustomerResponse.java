package com.uno.ecommerce.costomer;

public record CustomerResponse(
        String id,

        String firstName,
        String lastName,
        String email,
        Address address
) {
}
