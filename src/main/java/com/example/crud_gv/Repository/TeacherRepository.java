package com.example.crud_gv.Repository;

import com.example.crud_gv.Model.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
