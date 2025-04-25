package com.hexaware.courses.services;

import com.hexaware.courses.dao.InstructorDAO;
import com.hexaware.courses.entities.Instructor;

public class InstructorServiceImpl implements IInstructor{
    @Override
    public Instructor addInstructor(int instructorId, String name) {
        return null;
    }

    @Override
    public Instructor getInstructorDetails(int instructorId) {
        return null;
    }

    @Override
    public String assignCourseToInstructor(int courseId, int instructorId) {
        return InstructorDAO.assignCourseToInstructor(courseId,instructorId);
    }
}
