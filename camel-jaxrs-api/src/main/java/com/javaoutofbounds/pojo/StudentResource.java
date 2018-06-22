package com.javaoutofbounds.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class StudentResource {

	public Map<String, StudentDetails> studentMap = new HashMap<String, StudentDetails>();

	StudentResource(){

		final StudentDetails sd1 = new StudentDetails();
		sd1.setId("101");
		sd1.setName("Sam Wood");
		sd1.setGrade("B");
		sd1.setMarks(65.78);
		studentMap.put("101", sd1);

		final StudentDetails sd2 = new StudentDetails();
		sd2.setId("102");
		sd2.setName("Anna Ellis");
		sd2.setGrade("A");
		sd2.setMarks(85.78);
		studentMap.put("102", sd2);

		final StudentDetails sd3 = new StudentDetails();
		sd3.setId("103");
		sd3.setName("Peter Russel");
		sd3.setGrade("D");
		sd3.setMarks(0.0);
		studentMap.put("103", sd3);
	}
	
	@GET
	@Path("/welcome1")
	@Produces(MediaType.APPLICATION_JSON)
	public String welcomeStudent(){
		return "Welcome to Student Rest Service";
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public StudentDetails getStudent(@PathParam("id")String id){
		StudentDetails sd1 = new StudentDetails();
		sd1.setId("101");
		sd1.setName("Sam Wood");
		sd1.setGrade("B");
		sd1.setMarks(65.78);
		System.out.println("Student details returned =================== "+sd1.toString());
		return sd1;
	}
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentDetails> getAllStudents() {
		return new ArrayList<StudentDetails>(studentMap.values());
	}
	
	@POST
	@Path("/saveStudent1")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public StudentDetails saveStudent(StudentDetails inputDetail) {
		System.out.println("Student details returned =================== "+inputDetail.toString());
		return inputDetail;
	}
}
