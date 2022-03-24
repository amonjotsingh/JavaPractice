package ComparatorAndComparable;

import java.util.Comparator;

public class Player implements Comparable<Player> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return '[' +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

    @Override
    public int compareTo(Player one) {
        if (this.age > one.age) return 1;
        else
            return -1;

    }
}
