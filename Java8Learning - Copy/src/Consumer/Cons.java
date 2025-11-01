package Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Cons<S> {

    public static void main(String[] args) {
        Consumer<String> stringCons = s -> System.out.println(s);
        stringCons.accept("Takshal");

        Consumer<List<Integer>> listConsumer = li -> {
          for(Integer i : li)
          {
              System.out.println(i);
          }
        };
        Consumer<List<Integer>> listConsumer2 = li -> {
            for(Integer i : li)
            {
                System.out.println(i+100);
            }
        };
        listConsumer.andThen(listConsumer2).accept(Arrays.asList(1,2,3,4,5));
    }
}