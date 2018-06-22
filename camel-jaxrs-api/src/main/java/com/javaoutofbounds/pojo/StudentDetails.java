package com.javaoutofbounds.pojo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/*@JsonPropertyOrder({ "id", "grade", "name" })
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)*/
public class StudentDetails {

	String id;
	String name;
	String grade;
	double marks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", grade=" + grade + ", marks=" + marks + "]";
	}
}
