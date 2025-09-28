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
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService cserv;

    //C
    @PostMapping("/insertCourse")
    public CourseEntity inserCourse(@RequestBody CourseEntity Course) {
        return cserv.insertCourse(Course);
    }
    
    //R
    @GetMapping("/getAllCourses")
    public List<CourseEntity> getAllCourses() {
        return cserv.getAllCourse();
    }

    //U
    @PutMapping("/updateCourse")
    public CourseEntity updateCourse(@RequestParam int cid,@RequestBody CourseEntity newCourseDetails) {
        return cserv.updateCourse(cid, newCourseDetails);
    }

    //D
    @DeleteMapping("/deleteCourse/{cid}")
    public String deleteCourse(@PathVariable int cid) {
        return cserv.deleteCourse(cid);
    }
}
