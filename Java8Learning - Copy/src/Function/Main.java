package Function;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<childClass> list = new ArrayList<>();
        list.add(new childClass());
        list.stream().map(c-> c.a + " "+c.b).forEach(System.out::println);
    }
}
