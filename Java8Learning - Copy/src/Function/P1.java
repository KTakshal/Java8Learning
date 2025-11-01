package Function;

import java.util.function.Function;

public class P1 {
    public static void main(String[] args) {
        Function<String,Integer> function1 = x -> x.indexOf('h');
        System.out.println(function1.apply("Taksh"));

        Function<Integer, String> function2 = a-> a % 2 == 0 ? "Even" : "Odd" ;
        System.out.println(function2.apply(254));
        System.out.println(function2.apply(209));

        Function<Character, String> function3 = ch -> {
          char c = Character.toLowerCase(ch);
            return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? "Vowel" : "Consonant";
        };
        System.out.println(function3.apply('z'));
        System.out.println(function3.apply('e'));
        System.out.println(function3.apply('A'));


    }
}
