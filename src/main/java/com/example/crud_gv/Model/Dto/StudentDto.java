package com.example.crud_gv.Model.Dto;

import com.example.crud_gv.Model.Entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Integer id;
    private String nameStudent;
    private String email;
    private String name_Gv;

}
