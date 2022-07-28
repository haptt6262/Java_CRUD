package com.example.crud_gv.Service;

import com.example.crud_gv.Model.Dto.TeacherDto;
import com.example.crud_gv.Model.Entity.Teacher;
import com.example.crud_gv.Model.In.TeacherIn;
import com.example.crud_gv.Model.Response;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public interface TeacherService {
    Response getAll();
    Response create(TeacherIn teacherIn);
    Response delete(Integer id);
    Response update(Integer id, TeacherIn teacherIn);

}
