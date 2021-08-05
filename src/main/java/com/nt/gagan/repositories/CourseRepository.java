package com.nt.gagan.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.gagan.entity.Courses;

public interface CourseRepository extends JpaRepository<Courses, Serializable> {

}
