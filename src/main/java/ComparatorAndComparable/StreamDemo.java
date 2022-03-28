package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        Player first = new Player("Batman", 20);
        Player second = new Player("Aquaman", 30);
        Player third = new Player("Superman", 40);
        List<Player> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);
        List<Player> list1 = new ArrayList<>();
        list1 = list.stream().filter(player -> player.getAge() >= 30).collect(Collectors.toList());
        Iterator<Player> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}