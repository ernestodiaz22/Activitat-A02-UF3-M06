package com.ermr.mongodb.Mappers;


import com.ermr.mongodb.DTO.StudentDTO;
import com.ermr.mongodb.Model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {
    StudentDTO studentToStudentDTO(Student student);
    Student studentDTOToStudent(StudentDTO studentDTO);

}
