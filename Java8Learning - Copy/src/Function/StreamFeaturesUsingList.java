package Function;

import java.util.*;
import java.util.stream.Stream;

public class StreamFeaturesUsingList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(24);
        list.removeFirst();
        System.out.println(list); //[]
        list.add(45);
        list.add(35);
        System.out.println(list); // [45,35]
        list.clear();
        System.out.println(list); // []
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list); //[1, 2, 3, 4]

        list.forEach(System.out::println);
        System.out.println("---");
        System.out.println(list.stream().filter(n -> n % 2 == 0).toList());
        System.out.println("---");
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("---");
        list.stream().map(n -> n * n).forEach(System.out::println);
        System.out.println("---");
        list.stream().map(n -> n * n).filter(n -> n % 2 != 0).forEach(System.out::println);
        System.out.println("---");
        List<Integer> try1 = list.stream().map(n -> n * 2).toList();
        System.out.println(try1);
        System.out.println("reverseOrderSorting");
        List<Integer> reverseOrderSorting = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reverseOrderSorting);
        System.out.println("Max number");
        Integer max = list.stream().max(Integer::compare).orElse(0);
        System.out.println(max);
        System.out.println("Min number");
        Integer min = list.stream().min(Integer::compare).orElse(0);
        System.out.println(min);
        System.out.println(" Reducing (Aggregation)");
        System.out.println(list);
        int sum = list.stream()
                .reduce(0, (a, b) -> b + b);

        System.out.println("Sum: " + sum);
        int substract = list.stream()
                .reduce(0, (a, b) -> a - b);

        System.out.println("Sum: " + substract);
        System.out.println("Count");
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("Not Divisible by 3 count");
        long notDivisibleBy3Count = list.stream().filter(n -> n % 3 != 0).count();
        System.out.println(notDivisibleBy3Count);

        System.out.println("DistinctElements");
        List<Integer> list1 = Stream.of(566, 1, 2, 4, 5, 3, 2, 11,1, 566, 34).distinct().sorted(Integer::compare).toList();
        System.out.println(list1);
    }
}
