package collection.hash;

import java.util.*;

public class HashTable1 {

    //TODO check different map implementation for allow null value

    private static Map<Integer,Integer> hashtable = new Hashtable<>();
    private static Map<Integer,Integer> hashmap = new HashMap<>();
    private static Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
    private static Map<Integer,Integer> treeMap = new TreeMap<>();

    public static void main(String[] args) {

        try {
            hashtable.put(1, null);
            hashmap.put(1, null);
            linkedHashMap.put(1, null);
            treeMap.put(1, null);

            System.out.println(treeMap); //null K -, null V +
            System.out.println(linkedHashMap); //null K +, null V +
            System.out.println(hashmap); //null K +, null V +
            System.out.println(hashtable); // null K -, null V -
        }catch (NullPointerException e) {
            hashmap.put(null, null);
            linkedHashMap.put(null, null);
        }finally {
            System.out.println(hashmap + "\n" + linkedHashMap);
        }





    }
}
