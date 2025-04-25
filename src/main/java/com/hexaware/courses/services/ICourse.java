package com.hexaware.courses.services;

import com.hexaware.courses.entities.Course;

public interface ICourse {

    public Course addCourse(int courseId,String courseName);

    public Course getCourseDetails(int courseId);






}
