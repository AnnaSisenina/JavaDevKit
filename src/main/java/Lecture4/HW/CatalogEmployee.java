package Lecture4.HW;
//������� ���������� �����������
//����������:
//������� ����� ���������� �����������, ������� �������� ������
//��������� �����������
//�������� �����, ������� ���� ���������� �� ����� (����� ���� ������)
//�������� �����, ������� ���������� ����� �������� ���������� �� ����� (����� ���� ������)
//�������� �����, ������� ���� ���������� �� ���������� ������
//�������� ����� ���������� ������ ���������� � ����������

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
     * �����, ������� ���� ���������� �� ���������� ������
     * @param number ��������� ��������� ����� ����������
     * @return ��������� � ��������� ��������� �������
     */
    public Employee searchEmployeeByPersonnelNumber(int number){
        return employees.stream().filter(x -> x.getPersonnelNumber() == number).findFirst().orElse(null);
    }

    /**
     * �����, ������� ���� ���������� �� ����� (����� ���� ������)
     * @param experience, ��������� ���� ����������
     * @return ���������� ���������� (������ �����������) � ��������� ������
     */
    public List<Employee> searchEmployeeByExp(int experience){
        return employees.stream().filter(x -> x.getExperience() == experience).collect(Collectors.toList());
    }

    /**
     * �����, ������� ���������� ����� �������� ���������� �� ����� (����� ���� ������)
     * @param name,surname ��� � ������� �������������������
     * @return ����� �������� ����������
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
