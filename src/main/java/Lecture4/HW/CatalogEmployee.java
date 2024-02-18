package Lecture4.HW;
//Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри
//коллекцию сотрудников
//Добавить метод, который ищет сотрудника по стажу (может быть список)
//Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//Добавить метод, который ищет сотрудника по табельному номеру
//Добавить метод добавление нового сотрудника в справочник

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogEmployee {
    ArrayList<Employee> employees;

    CatalogEmployee(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee (Employee employee) {
        employees.add(employee);
    }

    /**
     * метод, который ищет сотрудника по табельному номеру
     * @param number требуемый табельный номер сотрудника
     * @return сотрудник с указанным табельным номером
     */
    public Employee searchEmployeeByPersonnelNumber(int number){
        return employees.stream().filter(x -> x.getPersonnelNumber() == number).findFirst().orElse(null);
    }

    /**
     * метод, который ищет сотрудника по стажу (может быть список)
     * @param experience, требуемый опыт сотрудника
     * @return возвращает сотрудника (список сотрудников) с указанным опытом
     */
    public List<Employee> searchEmployeeByExp(int experience){
        return employees.stream().filter(x -> x.getExperience() == experience).collect(Collectors.toList());
    }

    /**
     * метод, который возвращает номер телефона сотрудника по имени (может быть список)
     * @param name,surname имя и фамилия сотрудникасотрудник
     * @return номер телефона сотрудника
     */
    public String[] getPhoneNumber(String name, String surname){
        String[] phoneNumber = null;
        for (Employee employee : employees) {
            if (employee.getFirstName().equals(name) && employee.getSecondName().equals(surname)) {
                phoneNumber = employee.getPhoneNumber();
            }
        }
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "CatalogEmployee{" +
                "Employees: \n" + employees.toString() +
                '}';
    }
}
