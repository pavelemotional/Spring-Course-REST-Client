package ru.emotional.rest_client.entity;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private int id;
    private String name;
    private String surname;
    private String department;
    private int salary;


    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

}
