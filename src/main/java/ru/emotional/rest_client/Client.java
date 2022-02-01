package ru.emotional.rest_client;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.emotional.rest_client.configuration.MyConfig;
import ru.emotional.rest_client.entity.Employee;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployee = communication.getAllEmployees();
//        System.out.println(allEmployee);

//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

//            communication.saveEmployee(
//                    new Employee("test", "test", "test", 500));

        communication.deleteEmployee(19);
    }
}
