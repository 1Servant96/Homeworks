package HousesAndPeople;

import java.util.Arrays;

public class VillageHouse extends House {


    public VillageHouse(int id, String firstName, String lastName, String email, int age, String phoneNumber, int id1, String nameOfHouse, String address, int price, int year,Person[] persons, Person[] persons2) {
        super(id, firstName, lastName, email, age, phoneNumber, id1, nameOfHouse, address, price, year, persons, persons2);
    }

    @Override
     void city() {

        System.out.println("In "+getClass().getSimpleName()+" live "+ Arrays.toString(getPersons()));

    }

    @Override
    void electricity() {
        System.out.println(" They pay 234$ per month for electricity");

    }



    public void villageHouseAdvantage()
    {
        System.out.println("It has a garden with good fruits and vegetables also a lot of different colorly flowers");
    }

    @Override
    public String toString() {
        return "VillageHouse{" +
                "indexOfPerson=" + indexOfPerson +
                ", indexOfPerson2=" + indexOfPerson2 +
                ", counter=" + counter +
                '}';
    }
}
