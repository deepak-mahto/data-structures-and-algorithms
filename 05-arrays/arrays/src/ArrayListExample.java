import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//        input - 1st approach
//        list.add(23);
//        list.add(45);
//        list.add(34);
//        list.add(67);
//        list.add(12);
//
//        output

//        System.out.println(list);
//        list.set(2, 55);
//        System.out.println(list);

//        input - 2nd approach
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

//        output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
    }
}
