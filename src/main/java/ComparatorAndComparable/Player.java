package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        return '[' + "name='" + name + '\'' + ", age=" + age + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return age == player.age && Objects.equals(name, player.name);
    }


    @Override
    public int compareTo(Player o) {
        return this.age - o.age;
    }

}
