package homework16;

public class Eagle extends Animal{
    void fly(){
        System.out.println("I can fly");
    }
    public String function(){
        Class name = getClass();
        return name.toString();
    }
}
