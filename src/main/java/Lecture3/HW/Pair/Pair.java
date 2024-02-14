package Lecture3.HW.Pair;

public class Pair <T1, T2>{
    T1 firstObject;
    T2 secondObject;

    public Pair(T1 firstObject, T2 secondObject) {
        if (firstObject.getClass().equals(secondObject.getClass())) {
            throw new IllegalArgumentException("Типы объектов не должны совпадать");
        }
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public T1 getFirst() {
        return firstObject;
    }

    public T2 getSecond() {
        return secondObject;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstObject: " + firstObject.getClass() + ", " + firstObject +
                ", secondObject: " + secondObject.getClass() + ", " + secondObject +
                '}';
    }

}