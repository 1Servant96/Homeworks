package homework16;

public class Shark extends Animal{
    void attack(){
        System.out.println("I can attack");

    }
    public String function(){
        Class name = getClass();
        return name.toString();
    }
}
