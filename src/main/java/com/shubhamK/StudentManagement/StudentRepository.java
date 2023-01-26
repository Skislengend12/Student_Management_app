package com.shubhamK.StudentManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer, Student> db = new HashMap<>();

    public Student getStudent(int id){
        return db.get(id);
    }

    public String addStudent(Student student){
        int id = student.getAdmnNo();
        db.put(id, student);

        return "Student added successfully";
    }

    public String updateStudent(int id, int age){
        if(!db.containsKey(id)){
            return "Invalid ID";
        }
        db.get(id).setAge(age);

        return "Student updated successfully";
    }

    public String deleteStudent(int id){
        if(!db.containsKey(id)){
            return "Wrong student id";
        }
        db.remove(id);
        return "Student deleted successfully";
    }


}
