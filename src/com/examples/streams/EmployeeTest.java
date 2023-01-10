package com.examples.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();
        System.out.println(getMaleAndFemaleEmployee(employees));
    }

//How many male and female employees are there in the organization
/**
 * For queries such as above where you need to group the input elements, use the Collectors.groupingBy() method.
 * In this query, we use Collectors.groupingBy() method which takes two arguments.
 * We pass Employee::getGender as first argument which groups the input elements based on gender and Collectors.
 * counting() as second argument which counts the number of entries in each group.
 */
    public static Map<String, Long> getMaleAndFemaleEmployee(List<Employee> employees){
         return employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    }

//Print the name of all the department in the organization

    /**
     * Use distinct() method after calling map(Employee::getDepartment) on the stream. It will return unique departments.
     *
     */
    public static void printAllDepartments(List<Employee> employees){
        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }
//What is the average age of male and female employees

    /**
     * Use same method as query 3.1
     * but pass Collectors.averagingInt(Employee::getAge) as the second argument to Collectors.groupingBy().
     * @param employees
     * @return
     */
    public static Map<String, Double> getAvgAgeOfMaleAndFemale(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
    }

//Get the details of highest paid employee in the organization

    /**
     * Use Collectors.maxBy() method which returns maximum
     * element wrapped in an Optional object based on supplied Comparator.
     * @param employees
     * @return
     */
    public static Optional<Employee> getHighestPaidEmployee(List<Employee> employees){
        return employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
    }

//Get the name of all the  employees who have joined after 2015
    /**
     * For such queries which require filtering of input elements,
     * use Stream.filter() method which filters input elements according to supplied Predicate.
     */
    public static List<String> getEmployeeAfter2015(List<Employee> employees){
        return employees.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
    }
//Count the number of employees in each department

//What is the average salary of each department
//Get the details of youngest male employee in the product development department
//Who has the most working experience in the organization
//How many male and female employees are there in the sales and marketing team
//What is the average salary of male and female employees
//List down the names of all the employees in each department
//What is the average salary and total salary of the whole organization
//Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
//Who is the oldest employee in the organization? What is his age and which department he belongs to

}
