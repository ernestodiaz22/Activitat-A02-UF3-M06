package com.ermr.mongodb.Controladors;

import com.ermr.mongodb.DTO.StudentDTO;
import com.ermr.mongodb.Mappers.StudentMapper;
import com.ermr.mongodb.Model.Student;
import com.ermr.mongodb.Serveis.StudentServei;
import com.ermr.mongodb.Serveis.StudentServeiImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/v1/students")
@RequiredArgsConstructor
public class StudentControler {
    private StudentServeiImp studentServei;
    private StudentMapper studentMapper;

    @Autowired
    public  StudentControler(StudentServeiImp studentServiei, StudentMapper studentMapper){
            this.studentServei = studentServiei;
            this.studentMapper = studentMapper;
    }

    @PostMapping("/save")
    public Mono<Student> save(@RequestBody StudentDTO studentDTO){
        return studentServei.save(studentDTO);
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable String id){
        return studentServei.findById(id);
    }

    @GetMapping("/all")
    public Flux<Student> findAll(){
            return studentServei.findAll();
    }

    @PutMapping("/update")
    public Mono<Student> update(@RequestBody StudentDTO studentDTO){
        return studentServei.update(studentDTO);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return studentServei.delete(id);
    }



}
