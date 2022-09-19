package Homework22;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int r = random.nextInt(0,101);
            arrayList.add(r);
        }
        System.out.println(arrayList);

        ArrayList even = new ArrayList<>();
        ArrayList odd = new ArrayList<>();
        for (int r:arrayList) {
            if(r%2==0){even.add(r);
            }
            else {odd.add(r);
            }
        }
        System.out.println("Even arraylist:\n"+even);
        System.out.println("Odd arraylist:\n"+odd);
    }
}
