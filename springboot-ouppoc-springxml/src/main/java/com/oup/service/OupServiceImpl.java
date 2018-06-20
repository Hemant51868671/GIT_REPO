package com.oup.service;

import com.oup.model.Employee;

public class OupServiceImpl {

	public String welcome() {
		return "Welcome to OupService";
	}

	public Employee consumeEmployeeXml(Employee employee) {
		System.out.println("Consumed Employee Xml#####################" + employee.toString());
		final Employee emp = new Employee(employee.getId(), employee.getName(), employee.getAddress());
		System.out.println("Consumed Employee Xml ### ===" + employee);
		return emp;
	}
}
