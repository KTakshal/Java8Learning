package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(213);
        list.add(312);
        list.add(132);
        list.add(231);
        list.add(321);

        Collections.sort(list, (a,b) -> (b-a));//it will print list in descending order
        System.out.println(list);
    }
}
