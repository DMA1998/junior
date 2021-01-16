package collection.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap2 {

    private static Map<String, List<Integer>> map = new HashMap<>();
    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();
    private static List<Integer> list3 = new ArrayList<>();

    public static void fillLists() {
        for (int i = 1; i <= 5; i++) {
            int randomNumber = (int) (Math.random() * 100);
            list1.add(randomNumber);
        }

        for (int i = 1; i <= 10; i++) {
            int randomNumber = (int) (Math.random() * 100);
            list2.add(randomNumber);
        }

        for (int i = 1; i <= 15; i++) {
            int randomNumber = (int) (Math.random() * 100);
            list3.add(randomNumber);
        }
    }

    public static void printLists() {
        for (Map.Entry<String, List<Integer>> list : map.entrySet()) {
            System.out.println("key of list: " + list.getKey() + ", List: " + list.getValue());
        }
    }

    public static void main(String[] args) {
        map.put("first list", list1);
        map.put("second list", list2);
        map.put("third list", list3);

        printLists();
        fillLists();
        System.out.println();

        printLists();
    }
}