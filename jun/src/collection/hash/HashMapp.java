package collection.hash;

import collection.model.Employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapp {
/*
    public static void main(String[] args) {
      Map<String,Employee> map = new HashMap<>();
      Employee dima = new Employee("Dima",22,"manager");
      map.put("+380979327796",dima);

        for(Map.Entry<String,Employee> employee : map.entrySet()) {
            System.out.println("Phone:" +  employee.getKey() + "\n" + employee.getValue());
        }
    }*/

    public static void main(String[] args) {
        int[] array = {1, 6, 3, 7, 2, 1, 6, 3, 34, 12, 6, 1, 4213, 31212, 51, 5123, 3};

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }
        }
    }
}



