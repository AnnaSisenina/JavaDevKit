package Lecture4.Seminar;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("seminar four");
        /*
    � ������ ���������� ������ ����������:
    1. �������� ��������� ������� � ������� ���� � ������� ���������� List
    2. ������������ ��������� � ���������� �������
    3. ������������ ��������� �� ���������� ���� � �����
    4. ���������� ���������
     */

        List<String> names = new ArrayList<>(Arrays.asList("Roma","Alexey","Konstantin","Olga"));
        sortByWordLength(names);
        System.out.println(names);
        sortByAlphabeticalOrder(names);
        System.out.println(names);
        System.out.println(sortByWordLengthStream(names));
        revert(names);
        System.out.println(names);


    }

    public static void sortByAlphabeticalOrder(List<String> list) {
        Collections.sort(list);
    }

    public static void sortByWordLength(List<String> list) {
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
    }

    public static List<String> sortByWordLengthStream(List<String> list) {
        return  list.stream().sorted((x,y) -> x.length() - y.length()).toList();
    }

    public static void revert(List<String> list) {
        Collections.reverse(list);
    }

}