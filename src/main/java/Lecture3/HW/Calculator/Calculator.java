package Lecture3.HW.Calculator;
//�������� ����� ����������� (������������), ������� �������� ���������� ����������� ������:
// sum(), multiply(), divide(), subtract(). ��������� ���� ������� � ��� ����� ������� ����,
// ��� �������� ������ ���� ����������� ��������.

public class Calculator {
    public static <T extends Number, U extends Number> double sum (T param1, U param2){
        return param1.doubleValue() + param2.doubleValue();
    }
    public static <T extends Number, U extends Number> double multiply (T param1, U param2){
        return param1.doubleValue() * param2.doubleValue();
    }
    public static <T extends Number, U extends Number> double divide (T param1, U param2){
        return param1.doubleValue() / param2.doubleValue();
    }
    public static <T extends Number, U extends Number> double subtract (T param1, U param2){
        return param1.doubleValue() - param2.doubleValue();
    }

}

