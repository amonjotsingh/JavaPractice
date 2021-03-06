package ComparatorAndComparable;

import java.util.*;

public class PlayerMain {
    public static void main(String[] args) {
//
//        List<Player> list = new ArrayList();
//        list.add(new Player("jot", 25));
//        list.add(new Player("Manu", 28));
//        list.add(new Player("Batman", 15));
//        System.out.println(list.toString());
        Comparator<Player> com = new Comparator<Player>() {
            public int compare(Player o1, Player o2) {
                return o1.getAge() - o2.getAge();
            }
        };
//        Collections.sort(list, com);
        //Defining the comparator inside the calling func
//        Collections.sort(list, (Player player1, Player player2) -> {
//
//            if(player1.getAge()> player2.getAge()){
//            return 1;}
//            else return -1;
//        });
//        System.out.println(list.toString());

        Set<Player> set = new TreeSet<>(com);
        set.add(new Player("jot", 25));
        set.add(new Player("Superman", 28));
        set.add(new Player("Batman", 15));
        set.add(new Player("Batman", 15));
        System.out.println();
//        Player p1 = new Player("Jot", 25);
//        Player p2 = new Player("Jot", 25);
//        System.out.println("If two objects are equal: " + p1.equals(p2));
//        System.out.println(p1.hashCode() == p2.hashCode());

//        System.out.println(set.toString());

    }

}

