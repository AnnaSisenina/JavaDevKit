package Lecture5.HW;
//���� ���������� ��������� ����� ������ �������� �����, ����� ������ ��������� ����� ������� ��������.
//����� ����� �� ����� ����� ������ ����� ��������� ���������.
//������ ������� ����� ���� ����, ���� ����������.
//������� ����� ���� ������ �����, ����� ������ ��� ����� � ������ ������ � �����.
//������� �� ����� ���� ��� ���� ������, �� ����������� �� ����������� (����� �� ���������)
//������� � ���� ���� ����� ��������. ������ ������� ������ ������ ��� ����


import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        Fork fork1 = new Fork(1);
        Fork fork2 = new Fork(2);
        Fork fork3 = new Fork(3);
        Fork fork4 = new Fork(4);
        Fork fork5 = new Fork(5);

        Sage sage1 = new Sage("firstSage");
        Sage sage2 = new Sage("secondSage");
        Sage sage3 = new Sage("thirdSage");
        Sage sage4 = new Sage("fourthSage");
        Sage sage5 = new Sage("fifthSage");

        EatingThread first = new EatingThread(sage1, fork5, fork1, countDownLatch);
        EatingThread second = new EatingThread(sage2, fork1, fork2, countDownLatch);
        EatingThread third = new EatingThread(sage3, fork2, fork3, countDownLatch);
        EatingThread fourth = new EatingThread(sage4, fork3, fork4, countDownLatch);
        EatingThread fifth = new EatingThread(sage5, fork4, fork5, countDownLatch);

        first.start();
        second.start();
        third.start();
        fourth.start();
        fifth.start();

        countDownLatch.await();
        System.out.println("All sages are full");


    }
}
