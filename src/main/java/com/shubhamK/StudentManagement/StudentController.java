package com.shubhamK.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
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
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    // Getting the data from the Database
    @GetMapping("/get_student/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }


    @PutMapping("/update_student")
    public String updateStudent(@RequestParam("id") int id, @RequestParam("age") int age){
        return studentService.updateStudent(id, age);
    }

    @DeleteMapping("/delete_mapping/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        return studentService.deleteStudent(id);
    }
}
