package com.example.appdevf1.epansept27.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "units", nullable = false)
    private int units;

    public CourseEntity() {}

    public CourseEntity(String description, int units) {
        this.description = description;
        this.units = units;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}
