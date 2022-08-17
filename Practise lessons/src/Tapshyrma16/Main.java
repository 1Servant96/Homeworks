package Tapshyrma16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();

        Animal[] animals = { shark, turtle, eagle };
        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];
        int index = 0;
        for (Animal i:animals) {
           if(i instanceof Shark){
               ((Shark) i).attack();
               sharks[0] = ((Shark) i);
           }
           else if(i instanceof Turtle){
               ((Turtle) i).swim();
               turtles[0] = ((Turtle)i);
           }
           else if(i instanceof Eagle) {
           ((Eagle) i).fly();
           eagles[0] = ((Eagle)i);
           }


        }

        //System.out.println(Arrays.toString(animals));
        animal.function();
        Arrays.toString(eagles);
        Arrays.toString(turtles);

        System.out.println(animals);
        System.out.println(eagle.function());
        System.out.println(shark.function());
        System.out.println(turtle.function());

    }
}
