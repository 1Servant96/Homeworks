package homework20;

public class Main {


    public static void main(String[] args) {
try(Car car = new Car()){
car.drive();
System.out.println(5/0);
}catch (Exception e){
}
}}
