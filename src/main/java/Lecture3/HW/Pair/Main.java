package Lecture3.HW.Pair;
//Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы
// getFirst(), getSecond() для получения значений каждого из составляющих пары,
// а также переопределение метода toString(), возвращающее строковое представление пары.

public class Main {

    public static void main(String[] args) {
        Integer number = 5;
        String string = "Hello World";
        Pair<Integer, Integer> pair1 = new Pair<>(number, number);
        System.out.println(pair1.toString());
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());

    }


}

