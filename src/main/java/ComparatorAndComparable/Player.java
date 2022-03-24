package ComparatorAndComparable;

import java.util.Comparator;

public class Player {
    String name;
    int age;
    public Player(String name , int age){
        this.name = name ;
        this.age = age;
    }


    @Override
    public String toString() {
        return '['+
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}
