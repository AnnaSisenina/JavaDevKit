package Lecture3.HW.Pair;
//�������� ���������� ����� Pair, ������� ������������ ����� ���� �������� ������� ����. ����� ������ ����� ������
// getFirst(), getSecond() ��� ��������� �������� ������� �� ������������ ����,
// � ����� ��������������� ������ toString(), ������������ ��������� ������������� ����.

public class Main {

    public static void main(String[] args) {
        Integer number = 5;
        String string = "Hello World";
        Pair<Integer, Integer> pair1 = new Pair<>(number, number);
        System.out.println(pair1.toString());
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());

    }


}

