package task30Stream.second;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
List<String> list = new ArrayList<>();
        String name = "helper";
        while (!(name.equals(""))) {
            name = scanner.nextLine();
            list.add(name);
            }
        list.forEach(x-> System.out.print(x+" "));
        System.out.println("\nThe names which started by letter A: ");
        list.stream().filter(x->x.toUpperCase().startsWith("A")).toList().forEach(System.out::println);
        System.out.println("The number of names which started with 'A'\n"+list.stream().filter(x -> x.toUpperCase().startsWith("A")).count());
    }
}
