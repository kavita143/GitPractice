package com.hexaware.courses.dao;

import com.hexaware.courses.entities.Instructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InstructorDAO {

    public Instructor addInstructor(int instructorId, String name) {
        return null;
    }


    public Instructor getInstructorDetails(int instructorId) {
        return null;
    }


    public static String assignCourseToInstructor(int courseId, int instructorId) {


        Connection con = DBConnection.getConnection();
        PreparedStatement stmt = null;
        try {
            String query="update course set instructor_id=? where course_id=?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, instructorId);
            stmt.setInt(2, courseId);
            int count = stmt.executeUpdate();

            return "course successfully assigned ";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
