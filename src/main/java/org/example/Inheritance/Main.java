package org.example.Inheritance;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate dateEmployee = LocalDate.of(2023, 2, 1);
        Object objEmployee = new Employee("Vasya", 50_000, dateEmployee);
        Employee employee = (Employee) objEmployee;
        int yearEmployee = dateEmployee.getYear();

        LocalDate dateManager = dateEmployee.plusDays(2);
        Manager manager = new Manager("Arkady", 70_000, dateManager);

        Object objArray = new int[3];
        int[] arrayNumbers = (int[]) objArray;
        System.out.println("Hire day employee: " + employee.getHireDay() + "\nHire day manager: " + manager.getHireDay() + "\nLenght object array: " + arrayNumbers.length);
    }
}
