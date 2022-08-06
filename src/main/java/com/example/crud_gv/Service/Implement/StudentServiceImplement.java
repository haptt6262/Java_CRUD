package com.example.crud_gv.Service.Implement;

import com.example.crud_gv.Mapper.StudentMapper;
import com.example.crud_gv.Model.Dto.StudentDto;
import com.example.crud_gv.Model.Entity.Student;
import com.example.crud_gv.Model.Entity.Teacher;
import com.example.crud_gv.Model.In.StudentIn;
import com.example.crud_gv.Model.Response;
import com.example.crud_gv.Repository.StudentRepository;
import com.example.crud_gv.Repository.TeacherRepository;
import com.example.crud_gv.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class StudentServiceImplement implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public Response getAll() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> listStudentsDto= students.stream().map(StudentMapper::EntityToDto).collect(Collectors.toList());
        return new Response(true, "success", listStudentsDto);
    }

    @Override
    public Response createStudent(StudentIn studentIn) {
        Student student = StudentMapper.InToEntity(studentIn);
        Teacher teacher = teacherRepository.getById(studentIn.getId_teacher());
        student.setTeacher(teacher);
        studentRepository.save(student);
        return new Response(true, "success", null);
    }

    @Override
    public Response updateStudent(Integer id_student, StudentIn studentIn) {
        Optional<Student> student = studentRepository.findById(id_student);
        Student student1 = student.get();
        Optional<Teacher> teacher = teacherRepository.findById(studentIn.getId_teacher());
        Teacher teacher1 = teacher.get();
        student1.setNameStudent(studentIn.getNameStudent());
        student1.setEmail(studentIn.getEmail());
        student1.setTeacher(teacher1);
        studentRepository.save(student1);
        return new Response(true, "success", null);
    }

    @Override
    public Response deleteStudent(Integer id_student) {
        Optional<Student> student = studentRepository.findById(id_student);
        studentRepository.delete(student.get());
        return new Response(true, "success", null);
    }
}
