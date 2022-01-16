package com.vncode.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
