package com.hexaware.courses.services;

import com.hexaware.courses.entities.Instructor;

public interface IInstructor {

    public Instructor addInstructor(int instructorId, String name);

    public Instructor getInstructorDetails(int instructorId);

    public String assignCourseToInstructor(int courseId, int instructorId);

}
