package com.oup.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.oup.model.Employee;

@Path("/")
@Produces("application/xml")
@Consumes("application/xml")
public class RestService {
	public RestService() {
		System.out.println("Start #########################");
	}

	@GET
	public String welcomeEmployee() {
		String response = "I am in rest service";
		return response;
	}

	@POST
	public Employee consumeEmployeeXml(Employee employee) {
		// System.out.println("Consuming Employee Xml");
		// final Employee emp = new Employee(employee.getId(), employee.getName(),
		// employee.getAddress());
		// System.out.println("Consumed Employee Xml");
		return null;
	}
}
