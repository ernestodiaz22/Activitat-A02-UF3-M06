package com.ermr.mongodb.Serveis;


import com.ermr.mongodb.DTO.StudentDTO;
import com.ermr.mongodb.Mappers.StudentMapper;
import com.ermr.mongodb.Model.Student;
import com.ermr.mongodb.Repositoris.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentServeiImp implements StudentServei {
    private StudentRepo studentRepo;
    private StudentMapper studentMapper;

    @Autowired
    public StudentServeiImp(StudentRepo studentRepo, StudentMapper studentMapper){
        this.studentRepo = studentRepo;
        this.studentMapper = studentMapper;
    }

    @Override
    public Mono<Student> save(StudentDTO studentDTO){
        return studentRepo.save(studentMapper.studentDTOToStudent(studentDTO));
    }

    @Override
    public Mono<Student> update(StudentDTO studentDTO) {
        return studentRepo.findById(studentDTO._id())
                .flatMap(std -> {
                    Student student = studentMapper.studentDTOToStudent(studentDTO);
                    return studentRepo.save(student);
                });
    }

    @Override
    public Flux<Student> findByName(String name){
        return studentRepo.findByNameRegex(name);
    }

    @Override
    public Flux<Student> findAll(){
        return studentRepo.findAll();
    }

    @Override
    public Mono<Void> delete(String id){
        return studentRepo.deleteById(id);
    }


    @Override
    public Mono<Student> findById(String id){
        return this.studentRepo.findById(id);
    }

}
