package com.example.crud_gv.Controller;

import com.example.crud_gv.Model.Entity.Teacher;
import com.example.crud_gv.Model.In.TeacherIn;
import com.example.crud_gv.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")

public class TeacherController {
    @Autowired
     public TeacherService teacherService;
    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return  new ResponseEntity<>(teacherService.getAll(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody TeacherIn teacherIn){
        return new ResponseEntity<>(teacherService.create(teacherIn), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return new ResponseEntity<>(teacherService.delete(id), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody TeacherIn teacherIn){
        return new ResponseEntity<>( teacherService.update(id, teacherIn), HttpStatus.OK);
    }
}
