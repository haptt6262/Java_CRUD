package com.example.crud_gv.Service;

import com.example.crud_gv.Model.Entity.Student;
import com.example.crud_gv.Model.In.StudentIn;
import com.example.crud_gv.Model.Response;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Response getAll();
    Response createStudent(StudentIn studentIn);
    Response updateStudent(Integer id_student, StudentIn studentIn);
    Response deleteStudent(Integer id_student);
}
