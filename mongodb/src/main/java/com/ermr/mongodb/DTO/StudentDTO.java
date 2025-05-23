package com.ermr.mongodb.DTO;

public record StudentDTO(
         String _id,
         String name,
         String lastname1,
         String lastname2,
         String gender,
         String email,
         String phone,
         String phone_aux,
         int birth_year
) { }
