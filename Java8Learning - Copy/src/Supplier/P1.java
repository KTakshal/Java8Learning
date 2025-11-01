package Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class P1 {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Hello from Maharashtra";
        System.out.println(stringSupplier.get());

        System.out.println("Using Supplier with Collections ");

        Supplier<List<String>> listSupplier = ArrayList::new;

        List<String> names = listSupplier.get();
        names.add("Alice");
        names.add("Bob");
        names.forEach(System.out::println);
        names.stream().filter(string -> string.startsWith("A") && string.endsWith("e")).forEach(System.out::println);
        System.out.println(names);

        System.out.println("Custom Utility Method Accepting Supplier");

        doPrint( () -> "Random messege printing");


        System.out.println("Using Method Reference");
        Supplier<String> stringSupplier1 = P1::getMessage;
        System.out.println(stringSupplier1.get());


    }

    private static void doPrint(Supplier<String> stringSupplier) {
        System.out.println(" Printing Messege recived == " +stringSupplier.get());
    }

    private static String getMessage(){
        return "Getting the meseege from server ";
    }
}
