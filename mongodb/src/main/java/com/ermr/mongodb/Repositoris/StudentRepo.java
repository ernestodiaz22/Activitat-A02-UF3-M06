package com.ermr.mongodb.Repositoris;

import com.ermr.mongodb.Model.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableReactiveMongoRepositories
public interface StudentRepo extends ReactiveMongoRepository<Student, String> {

}
