package Lecture4.Seminar;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> phones = new HashMap<>();
        phones.putIfAbsent("123", "Иван");
        phones.putIfAbsent("456", "Сергей");
        phones.putIfAbsent("789", "Александр");
        phones.putIfAbsent("820", "Марина");
        phones.putIfAbsent("103", "Елена");

//        System.out.println(phones.keySet().stream().min(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.parseInt(o1) - Integer.parseInt(o2);
//            }
//        }).orElse(null));

        System.out.println(phones.keySet().stream().map(Integer::parseInt).min(Comparator.naturalOrder()));

        String name = phones.values().stream().max(String::compareTo).orElseGet(null);
        for (var item : phones.entrySet()) {
            if (item.getValue().equals(name)) {
                System.out.println(item.getKey());
            }
        }

        System.out.println(phones.entrySet()
                .stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).get().getKey());

        System.out.println(phones.entrySet()
                .stream().max(Map.Entry.comparingByValue()).get().getKey());

        }


}