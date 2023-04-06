package model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;

	private List<Course> courses = new ArrayList<>(1);

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public List<Course> getCourses() {
		return this.courses;
	}

	public void addCourse(Course course) {
		
		  Integer finishedCourses = 0;
		  
		  for(Course currentCourse : this.getCourses()) { if
		  (currentCourse.getIsFinished()) { finishedCourses++; } }
		  
		  Integer courseLimit = 1 + (finishedCourses * 3);
		  
		  
		  if (this.getCourses().size() < courseLimit) { this.courses.add(course); }
		  else { throw new Error("User cannot add more courses!"); }
		 
		// ao concluir um curso, aumentar o número de espaços para novos cursos em três
		
	}

	public Course getCourseByName(String courseName) {
		for (Course course : this.courses) {
			if (course.getName() == courseName) {
				return course;
			}
		}

		throw new Error("Course not found!");
	}
}
