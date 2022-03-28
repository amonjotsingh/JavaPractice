package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        Player first = new Player("Batman", 50);
        Player second = new Player("Aquaman", 30);
        Player third = new Player("Superman", 40);
        List<Player> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);
        List<Player> list1 = new ArrayList<>();
        list1 = list.stream()
                .filter(player -> player.getAge() >= 20)
                .sorted(Comparator.comparing(player -> player.getAge()))
                .collect(Collectors.toList());
       list1.forEach(player -> System.out.println(player));
    }
}
