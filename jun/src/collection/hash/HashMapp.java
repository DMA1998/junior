package collection.hash;

import collection.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class HashMapp {

    public static void main(String[] args) {
      Map<String,Employee> map = new HashMap<>();
      Employee robert = new Employee("Robert",35,"manager");
      map.put("Robert's key",robert);

      Employee liza = new Employee(null,0,null);
      liza = map.get("Robert's key");
      map.put("Liza's key",liza);

        for(Map.Entry<String,Employee> employee : map.entrySet()) {
            System.out.println(employee.getKey() + "\n" + employee.getValue());
            System.out.println();
        }

        System.out.println("Employees into map: " + map.size());
    }
}



