package com.hexaware.courses.tests;

import static org.junit.jupiter.api.Assertions.*;

import com.hexaware.courses.entities.Instructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InstructorTest {


    @BeforeEach
    public void testBefore(){
        System.out.println("testing before annotations");
    }
    @AfterEach
    public void testAfter(){
        System.out.println("testing after annotations");
    }
    @Test
    public void test1(){
        Instructor obj = new Instructor();
        assertNotNull(obj);
        obj.setId(1000);
        assertEquals(1001,obj.getId());
      //  assertEquals("Hello","Hello");
        System.out.println("testing 1");
    }

    @Test
    public void test2(){
        assertEquals("Hello","Hello");
        System.out.println("testing 2");
    }
}
