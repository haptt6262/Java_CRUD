package com.example.crud_gv.Service.Implement;

import com.example.crud_gv.Mapper.TeacherMapper;
import com.example.crud_gv.Model.Dto.TeacherDto;
import com.example.crud_gv.Model.Entity.Student;
import com.example.crud_gv.Model.Entity.Teacher;
import com.example.crud_gv.Model.In.TeacherIn;
import com.example.crud_gv.Model.Response;
import com.example.crud_gv.Repository.TeacherRepository;
import com.example.crud_gv.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TeacherServiceImplement implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public Response getAll() {
        List<Teacher> list = teacherRepository.findAll();
        List<TeacherDto> resTeacher = list.stream().map(TeacherMapper :: EntityToDto).collect(Collectors.toList());
        return new Response(true, "Get success!", resTeacher);
    }

    @Override
    public Response create(TeacherIn teacherIn) {
        Teacher teacher = TeacherMapper.InToEntity(teacherIn);
        System.out.println("teacher: "+ teacherIn);
         teacherRepository.save(teacher);
         return new Response(true, "Create success!", null);
    }

    @Override
    public Response delete(Integer id) {
        Optional<Teacher> teacher = teacherRepository.findById(id);
        teacherRepository.delete(teacher.get());
        return new Response(true, "Delete success!", null);
    }

    @Override
    public Response update(Integer id, TeacherIn teacherIn) {
        Optional<Teacher> teacher = teacherRepository.findById(id);
        Teacher teacher1 = teacher.get();
        System.out.println("giao vien: "+ teacher1);
        teacher1.setNameTeacher(teacherIn.getNameTeacher());
        teacherRepository.save(teacher1);
        return new Response(true, "Update success!", null);
    }


}
