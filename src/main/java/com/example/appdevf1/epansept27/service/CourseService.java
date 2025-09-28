package com.example.appdevf1.epansept27.service;

import com.example.appdevf1.epansept27.repository.*;
import com.example.appdevf1.epansept27.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository crepo;

    //C
    public CourseEntity insertCourse (CourseEntity course) {
        return crepo.save(course);
    }

    //R
    public List<CourseEntity> getAllCourse() {
        return crepo.findAll();
    }

    //U
    public CourseEntity updateCourse(int cid, CourseEntity newCourseDetails) {
        CourseEntity course = new CourseEntity();
        try {
            course = crepo.findById(cid).get();
            course.setDescription(newCourseDetails.getDescription());
            course.setUnits(newCourseDetails.getUnits());
        } catch(NoSuchElementException ex) {
            throw new NoSuchElementException( "Course " + cid + "does not exist!");
        } finally {
            return crepo.save(course);
        }
    }

    //D
    public String deleteCourse(int cid) {
        String msg = "";
        Optional<CourseEntity> courseOpt = crepo.findById(cid);

        if(courseOpt.isPresent()) {
            crepo.deleteById(cid);
            msg = "Course " + cid + " is successfully deleted!";
        } else {
            msg = "Course " + cid + " does not exist.";
        } return msg;
    }

}
