package com.ermr.mongodb.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student implements Serializable {
        @Id
        private String _id;
        private String name;
        private String lastname1;
        private String lastname2;
        private String gender;
        private String email;
        private String phone;
        private String phone_aux;
        private int birth_year;
}
