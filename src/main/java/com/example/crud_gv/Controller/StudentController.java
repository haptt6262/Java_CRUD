package com.example.crud_gv.Controller;

import com.example.crud_gv.Model.In.StudentIn;
import com.example.crud_gv.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(studentService.getAll(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody StudentIn studentIn){
        System.out.println("studentIn: " + studentIn);
        return new ResponseEntity<>(studentService.createStudent(studentIn), HttpStatus.OK);
    }
    @PutMapping("/update/{id_student}")
    public ResponseEntity<?> update(@PathVariable Integer id_student, @RequestBody StudentIn studentIn){
        return new ResponseEntity<>(studentService.updateStudent(id_student, studentIn), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id_student}")
    public ResponseEntity<?> delete(@PathVariable Integer id_student){
        return new ResponseEntity<>(studentService.deleteStudent(id_student), HttpStatus.OK);
    }
}
