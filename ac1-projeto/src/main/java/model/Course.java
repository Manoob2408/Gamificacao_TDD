package model;

import java.util.List;

public class Course {
	private String name;
	private boolean isFinished;
	private Double test1grade;
	private Double test2grade;
	private Double test3grade;
	private Double test4grade;

	public Course(String name) {
		this.name = name;
	}
	
	public Course getCourse() {
		return this;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getTest1grade() {
		return test1grade;
	}

	public void setTest1grade(Double test1grade) {
		this.test1grade = test1grade;
	}

	public Double getTest2grade() {
		return test2grade;
	}

	public void setTest2grade(Double test2grade) {
		this.test2grade = test2grade;
	}

	public Double getTest3grade() {
		return test3grade;
	}

	public void setTest3grade(Double test3grade) {
		this.test3grade = test3grade;
	}

	public Double getTest4grade() {
		return test4grade;
	}

	public void setTest4grade(Double test4grade) {
		this.test4grade = test4grade;
	}

	public boolean getIsFinished() {
		if (null != this.getTest1grade() 
				&& null != this.getTest2grade()
				&& null != this.getTest3grade()
				&& null != this.getTest4grade()) {
			this.isFinished = true;
		} else {
			this.isFinished = false;
		}
		
		return this.isFinished;
	}
	
	public double getSumTestGrades() {
		double sum = this.test1grade + this.test2grade + this.test3grade + this.test4grade;
		return sum;
	}

}
