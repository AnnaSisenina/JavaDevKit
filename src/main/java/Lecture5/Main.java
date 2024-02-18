package Lecture5;
/*
запустить три потока (первый печатает цифру 1, второй - 2, трети1 - 3), сделать так, чтобы потоки печатали цифры по порядку, т.е. 123123123
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
