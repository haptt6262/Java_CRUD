package com.example.crud_gv.Mapper;

import com.example.crud_gv.Model.Dto.StudentDto;
import com.example.crud_gv.Model.Entity.Student;
import com.example.crud_gv.Model.In.StudentIn;

import javax.transaction.Transactional;

@Transactional
public class StudentMapper {
    public static Student InToEntity(StudentIn studentIn){
        Student student = new Student();
        student.setNameStudent(studentIn.getNameStudent());
        student.setEmail(studentIn.getEmail());
        return student;
    }

    public static StudentDto EntityToDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setNameStudent(student.getNameStudent());
        studentDto.setEmail(student.getEmail());
//       System.out.println("Sss"+ student.getTeacher());
        if(student.getTeacher()==null){
            studentDto.setName_Gv(null);
        }else{
            studentDto.setName_Gv(student.getTeacher().getNameTeacher());
        }
        return studentDto;
    }
}
