package ru.emotional.rest_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.emotional.rest_client.entity.Employee;

import java.util.List;

@SpringBootApplication
public class SpringCourseRestClientApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SpringCourseRestClientApplication.class, args);

		Communication communication = context.getBean("communication", Communication.class);

		List<Employee> allEmployees = communication.getAllEmployees();
		System.out.println(allEmployees);
	}

}
