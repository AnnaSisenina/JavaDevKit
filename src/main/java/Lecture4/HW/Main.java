package Lecture4.HW;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, new String []{"12345"}, "Ivan", "Ivanov", 5);
        Employee employee2 = new Employee(2, new String[]{"22345", "34567"}, "Petr", "Petrov", 5);
        Employee employee3 = new Employee(3, new String[]{"32345"}, "Sidor", "Sidorov", 7);
        CatalogEmployee employees = new CatalogEmployee(new ArrayList<Employee>());
        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(employee3);
        System.out.println(employees);
        System.out.println(Arrays.toString(employees.getPhoneNumber("Petr", "Petrov")));
        System.out.println(employees.searchEmployeeByExp(5));
        System.out.println(employees.searchEmployeeByPersonnelNumber(3));
    }
}
