package com.example.appdevf1.epansept27.repository;

import com.example.appdevf1.epansept27.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
}
