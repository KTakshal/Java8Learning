package Consumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Combination {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
//        System.out.println(predicate.test(100));
        Function<Integer, Integer> function = x -> x * x;
//        System.out.println(function.apply(5));
        Consumer<Integer> integerConsumer = t -> System.out.println(t);
//        integerConsumer.accept(9);
        Supplier<Integer> integerSupplier = () -> 100;
//        System.out.println(integerSupplier.get());
        if (predicate.test(integerSupplier.get())) {
            Integer value = integerSupplier.get();
            Integer result = function.apply(value);
            integerConsumer.accept(result);
        }
    }
}