package task30Stream.first;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
            public static void main(String[] args) {
                LinkedList linkedList = new LinkedList<>();
                Random random = new Random();
                System.out.println("All numbers:");
                List<Integer> list = random.ints(0,21).limit(20).boxed().collect(Collectors.toList());
                list.stream().forEach(x-> System.out.print(x + "   "));
                System.out.println();
                System.out.println("Even numbers:");
                list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
                System.out.println("Size:");
                System.out.println(list.stream().filter(x -> x % 2 == 0).count());
            }
}
