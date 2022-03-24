package ComparatorAndComparable;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerMain {
    public static void main(String[] args) {

        List<Player> list = new ArrayList();
        list.add(new Player("jot", 25));
        list.add(new Player("Manu", 28));
        list.add(new Player("Batman", 15));
        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());
    }

}
