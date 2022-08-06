package com.example.crud_gv.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Stu")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String nameStudent;
    @Column
    private String email;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="id_GV")
    private Teacher teacher;
}
