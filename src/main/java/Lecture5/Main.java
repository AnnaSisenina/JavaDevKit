package Lecture5;
/*
��������� ��� ������ (������ �������� ����� 1, ������ - 2, �����1 - 3), ������� ���, ����� ������ �������� ����� �� �������, �.�. 123123123
 */

public class Main {
    public static void main(String[] args) {
        Thread number1 = new Thread(new Numbers123("1", 1));
        Thread number2 = new Thread(new Numbers123("2", 2));
        Thread number3 = new Thread(new Numbers123("3", 3));
        number1.start();
        number2.start();
        number3.start();
    }
}
