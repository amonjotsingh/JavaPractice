package GeneralPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Difficulty[] values = Difficulty.values();
        for(Difficulty diff : values){
            System.out.println(diff);
        }
        System.out.println(Difficulty.BEGINNNER.timeToReachLevel);

    }


}
