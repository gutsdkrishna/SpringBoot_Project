package com.course_management_app.course_app.dao;

import com.course_management_app.course_app.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseDao extends JpaRepository<Course, Long> {
}
