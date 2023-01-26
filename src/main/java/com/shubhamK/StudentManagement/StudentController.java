package com.shubhamK.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.security.PublicKey;
import java.util.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    // API for adding the data to the database
    @PostMapping("/add_student")
    public ResponseEntity addStudent(@RequestBody Student student){
        String student1 = studentService.addStudent(student);
        return new ResponseEntity <> (student1, HttpStatus.ACCEPTED);
    }

    // Getting the data from the Database
    @GetMapping("/get_student/{id}")
    public ResponseEntity getStudent(@PathVariable("id") int id){
        Student student = studentService.getStudent(id);
        return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
    }


    @PutMapping("/update_student")
    public ResponseEntity updateStudent(@RequestParam("id") int id, @RequestParam("age") int age){
        String temp = studentService.updateStudent(id, age);
        if(temp.equals("Invalid ID")){
            return new ResponseEntity <> (temp, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(temp, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete_mapping/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") int id){
        String temp = studentService.deleteStudent(id);
        if(temp.equals( "Wrong student id")){
            return new ResponseEntity<>(temp, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity <> (temp, HttpStatus.FOUND);
    }
}
