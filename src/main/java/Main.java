
import java.util.*;

public class Main {
    public static void main(String[] args){
// ASLIST METHOD
        //        String[] arr = {"Hello", "my friend", "how are you"};
//        List<String> list = Arrays.asList(arr);
//        for (String s : list) System.out.print(s + " ");
//FILL THE ARRAY
        int[] arr = new int[5];
        Arrays.fill(arr, 100);
        for (Integer i : arr)
            System.out.print(i + " ");
    }

}
