package homework14;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[]args){
        Programmer programmer = new Programmer("Kadyr", "Adam","junior");

        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("----------------");
        Dancer dancer = new Dancer("Star", "Alex","teacher");
        System.out.println( dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println("----------------");
        Singer singer = new Singer("city312", "Aya","solist");
        System.out.println( singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();




    }
}
