package com.example.appdevf1.epansept27.service;

import com.example.appdevf1.epansept27.repository.*;
import com.example.appdevf1.epansept27.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository srepo;

    //C
    public StudentEntity insertStudent (StudentEntity student) {
        return srepo.save(student);
    }

    //R
    public List<StudentEntity> getAllStudents() {
        return srepo.findAll();
    }

    //U
    public StudentEntity updateStudent(int sid, StudentEntity newStudentDetails) {
        StudentEntity student = new StudentEntity();
        try {
            student = srepo.findById(sid).get();
            student.setFname(newStudentDetails.getFname());
            student.setLname(newStudentDetails.getLname());
            student.setProgram(newStudentDetails.getProgram());
            student.setYearlevel(newStudentDetails.getYearlevel());
        } catch(NoSuchElementException ex) {
            throw new NoSuchElementException( "Student " + sid + "does not exist!");
        } finally {
            return srepo.save(student); 
        }
    }

    //D
    public String deleteStudent(int sid) {
        String msg = "";
        Optional<StudentEntity> studentOpt = srepo.findById(sid);

        if(studentOpt.isPresent()) {
            srepo.deleteById(sid);
            msg = "Student " + sid + " is successfully deleted!";
        } else {
            msg = "Student " + sid + " does not exist.";
        } return msg;
    }
}