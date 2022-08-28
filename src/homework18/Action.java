package homework18;

public interface Action {
    void zhashoo ();
    default void payForLive(){
        System.out.println("We pay for rent");
    };



}
