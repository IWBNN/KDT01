package secondweek.map;

import java.util.HashMap;
import java.util.Map;

public class CollectionPracticeMain {
    public static void main(String[] args) {
        Map<String, Integer> myIntMap = new HashMap<>();

        myIntMap.put(null, 1);
        myIntMap.put("", 1);
        System.out.println(myIntMap);

        myIntMap.put("A", 1);
        myIntMap.put("A", 1);
        myIntMap.put("A", 1);
        System.out.println(myIntMap);

        myIntMap.put("A", 1);
        myIntMap.put("B", 1);
        myIntMap.put("C", 1);
        myIntMap.put("D", 1);
        myIntMap.put("E", 1);
        System.out.println(myIntMap);
    }
}
