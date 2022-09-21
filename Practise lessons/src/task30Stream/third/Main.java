package task30Stream.third;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> AL = List.of("abcd", "bcfk", "def", "jklmn", "jprst",
                "lfc", "ambn", "kmk", "qrbd", "just");
        AL.stream().forEach(System.out::println);
        System.out.println("Ascending order:");
        AL.stream().sorted().forEach(System.out::println);
        System.out.println("Descending order:");
        AL.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
