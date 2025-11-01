package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class P1 {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Takshal");

        System.out.println("Using Method Reference ");
        Consumer<Integer> integerConsumer = System.out::println;
        integerConsumer.accept(1);

        System.out.println("Chaining Consumers with andThen() (Intermediate");
        Consumer<String> stringConsumer1 = s-> System.out.print("Hello "+s);
        Consumer<String> stringConsumer2 = s -> System.out.println(" Bye "+s );

        Consumer<String> combined = stringConsumer1.andThen(stringConsumer2);
        combined.accept("Javvaa");

        System.out.println("Using Consumer with Collections (Practical Use Case)");
        List<String> employees = Arrays.asList("mahesh","Ram","sham","kyanaam");

        Consumer<String> printName = name -> System.out.println("employee Name : " + name);
        employees.forEach(printName);

        System.out.println("Using Consumer with Streams (Advanced & Powerful)");
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println); //Consumer used here

        System.out.println("Custom Utility Method Accepting Consumer (Advanced)");
        performAction("Java", s -> System.out.println("Processed: " + s));
    }
    public static void performAction(String input, Consumer<String> consumer) {
        consumer.accept(input);
    }

}
