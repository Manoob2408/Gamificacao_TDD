package com.example.ac1projeto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import model.Course;
import model.Student;

@SpringBootTest
class Ac1ProjetoApplicationTests {
	
	//private static final Logger LOGGER = LoggerFactory.class(Ac1ProjetoApplicationTests.);

	@Test
	public void shouldCreateStudent() {
		Student student = new Student("Manuzinha");
		
		assertEquals(student.getName(), "Manuzinha");
	}
	
	@Test
	public void addCourseToStudent() {
		Course course = new Course("Engenharia da Computacao");
		Student student = new Student("Enzo");
		
		student.addCourse(course);
		
		System.out.println(student.getCourses().toString());
		
;		assertTrue(student.getCourses().contains(course));
		
	}
	
	@Test
	public void shouldAddOnlyOneCourseToNewStudent() {
		Student student = new Student("Joãozinho");
		Course course = new Course("Javascript");
		
		if(student.getCourses().isEmpty()) {
			
			student.addCourse(course);
		}
		
		assertEquals(student.getCourses().size(), 1);
	}
	
	
	@Test
	public void shouldGetGradeAverage() {
		Student student = new Student("Maria");
		Course course = new Course("NodeJS");
		
		student.addCourse(course);
		student.getCourseByName(course.getName()).setTest1grade(7.0d);
		student.getCourseByName(course.getName()).setTest2grade(7.0d);
		student.getCourseByName(course.getName()).setTest3grade(7.0d);
		student.getCourseByName(course.getName()).setTest4grade(7.0d);
		
		double sum = student.getCourseByName(course.getName()).getSumTestGrades();
		
		assertEquals(sum/4, 7.0d, 0.001);
		
	}
	
	@Test
	public void shouldAddThreeMoreCourses() {
		Student student = new Student("Maria");
		Course course = new Course("NodeJS");
	
		System.out.println("Linha com o resultado " + student.getCourses().size());
		
	}
	

}
