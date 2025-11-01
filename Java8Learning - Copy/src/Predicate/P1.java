package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P1 {

    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() > 4 ;
        System.out.println(predicate.test("taksh"));

        System.out.println("Using Method Reference (When Applicable)");
        Predicate<String> isEmpty = String ::isEmpty;
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("Helooo"));

        System.out.println("Combining Predicates with and(), or(), negate()");

        Predicate<String> predicate1 = string -> string.startsWith("t");
        Predicate<String> predicate2 = string -> string.endsWith("l");

        Predicate<String> check = predicate1.and(predicate2);
        System.out.println(check.test("takshal"));

        System.out.println("Using Predicate with Collections (Practical Use Case)");
        List<String> names = Arrays.asList("Ram","Sham","Jam","Kaam","thaamb");

        Predicate<String> longName = naam->naam.length()>3;
        List<String> list = names.stream().filter(longName).toList();
        System.out.println("Long Name "+list);
        names.stream().filter(longName).forEach(System.out::println);
        String input = "TechMahindrA";
        Check(input, string->string.equalsIgnoreCase(input) && string.endsWith("a"));
        Check("Tech", string->string.endsWith("h"));

        System.out.println("Predicate with Complex Objects");

        List<Person> personList = Arrays.asList(
                new Person(28),
                new Person(14),
                new Person(74)
        );
        Predicate<Person> isAdult = p -> p.getAge() >= 25;

        personList.stream().filter(isAdult).toList().forEach(age -> System.out.println(age.getAge()));

    }
        public static void Check(String input, Predicate<String> predicate)
        {
           System.out.println("Result " +predicate.test(input));
        }
}

class Person{
    private int age;

    Person(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }
}
