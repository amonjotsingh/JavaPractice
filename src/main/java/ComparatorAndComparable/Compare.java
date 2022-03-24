package ComparatorAndComparable;

import java.util.Comparator;

public class Compare implements Comparator <Player>
{
    @Override
    public int compare(Player a, Player b) {
        return Integer.compare(a.age,b.age);
    }
}
