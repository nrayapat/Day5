package com.capgemini.exceptionalhandling.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exceptionalhandling.Student;
import com.capgemini.exceptionalhandling.exception.AgeNotWithinRangeException;
import com.capgemini.exceptionalhandling.exception.NameNotValidException;

class StudentTest {

	
	@Test
	void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
		
		
			assertThrows(AgeNotWithinRangeException.class,()-> new Student(22,"Nikhil",25,"Java"));
			
			assertThrows(NameNotValidException.class,()-> new Student(22,"Nikhil222",20,"Java"));
			assertAll(()-> new Student(22,"Nikhil",21,"Java"));
		try {
			 new Student(22,"Nikhil",21,"Java");
		}
		catch(Exception e)
		{
			fail("Failed Statement");
		}
		
	}
}