package com.example.crud_gv.Mapper;

import com.example.crud_gv.Model.Dto.TeacherDto;
import com.example.crud_gv.Model.Entity.Teacher;
import com.example.crud_gv.Model.In.TeacherIn;

public class TeacherMapper {
    public static Teacher InToEntity(TeacherIn teacherIn){
        Teacher teacher = new Teacher();
            teacher.setId(teacherIn.getId());
            teacher.setAddress(teacherIn.getAddress());
            teacher.setName(teacherIn.getName());
            teacher.setPhone(teacherIn.getPhone());
             return teacher;
    }
    public static TeacherDto EntityToDto(Teacher teacher){
        TeacherDto teacherDto = new TeacherDto();
            teacherDto.setId(teacher.getId());
            teacherDto.setName(teacher.getName());
            teacherDto.setAddress(teacher.getAddress());
            return teacherDto;
    }
}
