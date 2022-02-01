package ru.emotional.rest_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.emotional.rest_client.entity.Employee;

import java.util.List;

@Component
public class Communication {

    private final String url = "http://localhost:8080/api/employees/";

    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> getAllEmployees() {
        ResponseEntity<List<Employee>> responseEntity =
                restTemplate.exchange(url, HttpMethod.GET, null,
                        new ParameterizedTypeReference<>() {
                        });
        return responseEntity.getBody();
    }

    public Employee getEmployee(int id) {
        return restTemplate.getForObject(url + id, Employee.class);
    }


    public void saveEmployee(Employee employee) {
        if (employee.getId() == 0) {
            restTemplate.postForEntity(url, employee, String.class);
        } else restTemplate.put(url, employee);
        System.out.println("UpdateOrCreate completed");
    }

    public void deleteEmployee(int id) {
        restTemplate.delete(url + id);
        System.out.println("Delete id" + id + " completed");
    }

}
