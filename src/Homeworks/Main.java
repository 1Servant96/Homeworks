package Homeworks;



public class Main {
    public static void main(String[] args) {
        Fish chebak = new Fish();
        chebak.setAge(3);
        chebak.setColor("grey");
        chebak.setName("lunch");
        System.out.println(chebak.getAge());
        System.out.println(chebak.getColor());
        System.out.println(chebak.getName());
        System.out.println(chebak.toString());
        System.out.println();

        Cat egyptian = new Cat();
        egyptian.setAge(4);
        egyptian.setColor("white");
        egyptian.setName("Kitty");
        System.out.println(egyptian.getAge());
        System.out.println(egyptian.getColor());
        System.out.println(egyptian.getName());
        System.out.println(egyptian.toString());
        System.out.println();

        Dog germanShepherd = new Dog();
        germanShepherd.setAge(5);
        germanShepherd.setColor("black and tan");
        germanShepherd.setName("Rex");
        System.out.println(germanShepherd.getAge());
        System.out.println(germanShepherd.getColor());
        System.out.println(germanShepherd.getName());
        System.out.println(germanShepherd.toString());
        System.out.println();

        Parrot paradisal = new Parrot();
        paradisal.setColor("blue");
        paradisal.setAge(6);
        paradisal.setName("Rio");
        System.out.println(paradisal.getAge());
        System.out.println(paradisal.getColor());
        System.out.println(paradisal.getName());
        System.out.println(paradisal.toString());
    }

}

