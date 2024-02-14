package Lecture3.HW;
//Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
// и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.

public class CompareArrays {
    public static void main(String[] args) {
        Integer [] intArray = new Integer[]{1, 2, 3, 4};
        Integer [] intArray2 = new Integer[]{1, 2, 3, 4};
        Double [] doubleArray = new Double[]{1.0, 2.0, 3.0, 4.0};
        Number [] numberArray = new Number[]{1, 1.0, 4.0};
        Number [] numberArray2 = new Number[]{1, 1.0, 4.0};
        Number [] numberArray3 = new Number[]{1.0, 1.0, 4.0};
        System.out.println(compareArrays(intArray, intArray2));
        System.out.println(compareArrays(intArray, doubleArray));
        System.out.println(compareArrays(numberArray, numberArray2));
        System.out.println(compareArrays(numberArray, numberArray3));

    }

    public static <T1, T2> boolean compareArrays(T1[] array, T2[] array2) {
        if (array.length == array2.length){
            for (int i = 0; i < array.length; i++) {
                if (!array[i].equals(array2[i])  && !array[i].getClass().equals(array2[i].getClass())) return false;
            }
            return true;
        }
        return false;
    }
}
