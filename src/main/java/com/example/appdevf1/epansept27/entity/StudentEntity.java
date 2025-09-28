package com.example.appdevf1.epansept27.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fname", nullable = false)
    private String fname;

    @Column(name = "lname", nullable = false)
    private String lname;

    @Column(name = "program", nullable = false)
    private String program;

    @Column(name = "yearlevel", nullable = false)
    private int yearlevel;

    public StudentEntity() {}

    public StudentEntity(String fname, String lname, String program, int yearlevel) {
        this.fname = fname;
        this.lname = lname;
        this.program = program;
        this.yearlevel = yearlevel;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYearlevel() {
        return yearlevel;
    }

    public void setYearlevel(int yearlevel) {
        this.yearlevel = yearlevel;
    }
}
