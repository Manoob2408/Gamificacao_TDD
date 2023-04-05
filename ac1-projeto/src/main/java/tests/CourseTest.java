package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.Course;
import model.Student;

public class CourseTest {
	@Test
	public void shouldCreateStudent() {
		Student student = new Student("Manuzinha");
		
		assertEquals(student.getName(), "Manuzinha");
	}
	
	@Test
	public void addCourseToStudent() {
		Course course = new Course("Adm");
		Student student = new Student("Enzo");
		
		student.addCourse(course);
		
		
		assertTrue(student.getCourses().contains(course));
		
	}
}
