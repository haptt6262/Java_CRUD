package com.example.crud_gv.Controller;

import com.example.crud_gv.Model.In.StatusIn;
import com.example.crud_gv.Model.Response;
import com.example.crud_gv.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    private StatusService statusService;
    @GetMapping("")
    public ResponseEntity<?> getAllStatus(){
        return new ResponseEntity<>(statusService.getAllStatus(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody StatusIn statusIn){
        return new ResponseEntity<>(statusService.create(statusIn), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return new ResponseEntity<>(statusService.delete(id), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody StatusIn statusIn){
        return new ResponseEntity<>(statusService.update(id, statusIn), HttpStatus.OK);
    }
}
