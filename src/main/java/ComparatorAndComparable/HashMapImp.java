package ComparatorAndComparable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapImp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("batman", 70);
        map.put("superman", 80);
        System.out.println(map);
        map.put("flash", 100);
        map.replace("superman", 80, 90);
        map.remove("aquaman");
        map.put("martian", 110);
        System.out.println(map);
        System.out.println(map.get("batman"));
        System.out.println(map.containsKey("superman"));
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

}
