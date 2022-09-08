package lesson24SET.tapshyrma1;

import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int sumOfHashset = 0;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 400; i++) {
        int r = random.nextInt(0,21);
        list.add(r);
        sum+= r;
        }
        System.out.println("The elements of list:\n" + list);
        System.out.println("The size of list:\n" + list.size());
        System.out.println("The sum of list:\n" + sum);
        hashSet.addAll(list);
        for (Integer i:hashSet) {
            sumOfHashset+=i;
        }
        System.out.println(hashSet);
        System.out.println("The sum of hashSet:\n"+sumOfHashset);
    }
    }

