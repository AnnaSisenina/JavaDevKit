package Lecture3.HW.Calculator;
//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
// sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
// над которыми должна быть произведена операция.

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

