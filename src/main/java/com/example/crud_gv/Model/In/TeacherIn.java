package com.example.crud_gv.Model.In;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherIn {
    private Integer id;
    private String name;
    private String phone;
    private String address;
}
