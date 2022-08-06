package com.example.crud_gv.Model.In;

import com.example.crud_gv.Model.Entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentIn {
    private Integer id;
    private String nameStudent;
    private String email;
    private Integer id_teacher;
}
