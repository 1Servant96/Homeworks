package homework20;

public class Car implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("The car is closing");
    }
    public void drive() {
        System.out.println("car is driving");
    }
}
