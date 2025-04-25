package com.hexaware.courses.main;

import com.hexaware.courses.services.IInstructor;
import com.hexaware.courses.services.InstructorServiceImpl;

public class Demo {

    public static void main(String args[]){
        IInstructor service = new InstructorServiceImpl();
        service.assignCourseToInstructor(10901,1091);
    }
}
