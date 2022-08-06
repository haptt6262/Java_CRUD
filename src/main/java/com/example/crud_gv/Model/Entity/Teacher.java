package com.example.crud_gv.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nameTeacher;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Collection<Student> student;
    @PreRemove
    private void preRemove(){
        student.forEach(student -> student.setTeacher(null));
    }
}
