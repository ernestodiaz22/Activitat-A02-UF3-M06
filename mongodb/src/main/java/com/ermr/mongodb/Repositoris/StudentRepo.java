package com.ermr.mongodb.Repositoris;

import com.ermr.mongodb.Model.Student;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@EnableReactiveMongoRepositories
public interface StudentRepo extends ReactiveMongoRepository<Student, String> {
    @Query("{ 'name': { $regex: ?0, $options: 'i' } }")
    Flux<Student> findByNameRegex(String nombre);
}
