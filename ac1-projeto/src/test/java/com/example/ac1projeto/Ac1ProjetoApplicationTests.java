package com.example.ac1projeto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import model.Course;
import model.Student;

@SpringBootTest
class Ac1ProjetoApplicationTests {
	
	//private static final Logger LOGGER = LoggerFactory.class(Ac1ProjetoApplicationTests.);

	@Test
	public void shouldAddOnlyOneCourseToNewStudent() {
		Student student = new Student("Joãozinho");
		Course course = new Course("Javascript");
			
		student.addCourse(course);
		
		assertEquals(student.getCourses().size(), 1);
		
		assertThrows(Error.class, () -> student.addCourse(new Course("Java")), "User cannot add more courses!");
	}
	
	
	@Test
	public void shouldGetGradeAverage() {
		Student student = new Student("Maria");
		Course course = new Course("NodeJS");
	
		student.addCourse(course);
		
		Course courseExample = student.getCourseByName(course.getName());
		
		courseExample.setTest1grade(7.0d);
		courseExample.setTest2grade(7.0d);
		courseExample.setTest3grade(7.0d);
		courseExample.setTest4grade(7.0d);
		
		assertEquals(courseExample.getGradesAverage(), 7d, 0.0);	
	}
	
	@Test
	public void shouldBeAbleToAddThreeMoreCoursesWhenOneIsFinished() {
		Student student = new Student("Maria");
		Course course = new Course("NodeJS");
	
		student.addCourse(course);
		
		Course courseExample = student.getCourseByName(course.getName());
		
		courseExample.setTest1grade(7.0d);
		courseExample.setTest2grade(7.0d);
		courseExample.setTest3grade(7.0d);
		courseExample.setTest4grade(7.0d);
		
		Course course2 = new Course("course2");
		Course course3 = new Course("course3");
		Course course4 = new Course("course4");
		
		student.addCourse(course2);
		student.addCourse(course3);
		student.addCourse(course4);
		
		assertTrue(student.getCourses().size() == 4);
	}

}
