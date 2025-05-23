package com.ermr.mongodb.Serveis;

import com.ermr.mongodb.DTO.StudentDTO;
import com.ermr.mongodb.Model.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentServei {
    Mono<Student> save(StudentDTO studentDTO);
    Mono<Student> findById(String id);
    Flux<Student> findAll();
    Mono<Student> update(StudentDTO studentDTO);
    Mono<Void> delete(String id);

}
