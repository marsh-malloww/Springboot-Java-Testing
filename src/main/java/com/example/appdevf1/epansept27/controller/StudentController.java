package com.example.appdevf1.epansept27.controller;

import com.example.appdevf1.epansept27.entity.*;
import com.example.appdevf1.epansept27.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService sserv;

    @GetMapping("/test")
    public String print() {
        return "Test";
    }
    

    //C
    @PostMapping("/insertStudent")
    public StudentEntity inserStudent(@RequestBody StudentEntity student) {
        return sserv.insertStudent(student);
    }
    
    //R
    @GetMapping("/getAllStudents")
    public List<StudentEntity> getAllStudents() {
        return sserv.getAllStudents();
    }

    //U
    @PutMapping("/updateStudent")
    public StudentEntity updateStudent(@RequestParam int sid,@RequestBody StudentEntity newStudentDetails) {
        return sserv.updateStudent(sid, newStudentDetails);
    }

    //D
    @DeleteMapping("/deleteStudent/{sid}")
    public String deleteStudent(@PathVariable int sid) {
        return sserv.deleteStudent(sid);
    }
}
