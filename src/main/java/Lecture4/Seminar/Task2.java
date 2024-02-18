package Lecture4.Seminar;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {

    public static String firstItemByAlphabet (Set <String> names) {
        return names.stream().min(String::compareTo).orElseGet(null);
    }

    public static String maxElement (Set <String> names) {
        return names.stream().min(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }).orElseGet(null);
    }
    public static Set<String> withoutA (Set <String> names) {
        Set<String> newSet = new HashSet<>();
        for (String item : names) {
            if (!item.toUpperCase().contains("А")) {
                newSet.add(item);
            }
        }
        return newSet;
    }

    public static void removeElementsWith(Set<String> set, String targetForDel) {
        set.removeIf(x -> x.contains(targetForDel));
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Сергей", "Дмитрий", "Дмитрий", "Ольга", "Иван", "Ольга", "Александр"));
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);
        System.out.println(firstItemByAlphabet(uniqueNames));
        System.out.println(maxElement(uniqueNames));
        //removeElementsWith(uniqueNames, "А");
        //System.out.println(uniqueNames);

        System.out.println(uniqueNames.stream().filter(x -> !x.contains("А") && !x.contains("а")).collect(Collectors.toSet()));
    }
}