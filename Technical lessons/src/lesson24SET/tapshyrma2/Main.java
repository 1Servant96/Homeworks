package lesson24SET.tapshyrma2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
Student student1 = new Student("bek", 18);
Student student2 = new Student("bek", 18);
Student student3 = new Student("bek", 18);
Student student4 = new Student("bek", 18);
Student student5 = new Student("bek", 18);
Student[] students = {student1,student2,student3,student4,student5};

  HashSet<Student> hashSet = new HashSet<>();
 hashSet.addAll(List.of(students));
        System.out.println(hashSet);
    }
}
