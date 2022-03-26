package ComparatorAndComparable;

import java.util.HashMap;

public class HashMapImp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("batman", 70);
        map.put("superman", 80);
        System.out.println(map);
        map.replace("superman", 80, 90);
        System.out.println(map);
    }
}
