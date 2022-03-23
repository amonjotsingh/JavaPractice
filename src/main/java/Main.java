
import java.util.*;

public class Main {
    public static void main(String[] args) {
// ASLIST METHOD
        //        String[] arr = {"Hello", "my friend", "how are you"};
//        List<String> list = Arrays.asList(arr);
//        for (String s : list) System.out.print(s + " ");
//FILL THE ARRAY and Copy the array
//        int[] arr = new int[5];
//        Arrays.fill(arr, 100);
//        int[] arr1 = Arrays.copyOf(arr , arr.length);
//        for (Integer i : arr1)
//            System.out.print(i + " ");
//    }

        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(String.valueOf(list));
        list.remove(2);
        System.out.println(String.valueOf(list));
        list.set(4, 4);
        System.out.println(list.get(5));
        System.out.println(String.valueOf(list));
        System.out.println(list.indexOf(7));
        System.out.println("Last index of 4 is " + list.lastIndexOf(4));
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
