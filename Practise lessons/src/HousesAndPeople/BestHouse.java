package HousesAndPeople;

import java.util.Arrays;

public class BestHouse extends House{
    public BestHouse(int id, String firstName, String lastName, String email, int age, String phoneNumber, int id1, String nameOfHouse, String address, int price, int year,Person[] persons, Person[] persons2) {

        super(id, firstName, lastName, email, age, phoneNumber, id1, nameOfHouse, address, price, year, persons, persons2);

    }
    public

    @Override
    void city() {
        System.out.println("In "+getClass().getSimpleName()+" live "+ Arrays.toString(getPersons2()) );

    }
//    Aibek, Atabek, Uson, Almazbek, Davlet
//Arrays.toString(getPersons())
    @Override
    void electricity() {
        System.out.println("They pay 400$ per month for electricity");
    }




    public void bestHouseAdvantages(){
        System.out.println("This house has a perfect view on river");
    }

}
