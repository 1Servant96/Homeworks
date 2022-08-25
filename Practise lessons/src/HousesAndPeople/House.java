package HousesAndPeople;

import java.util.Arrays;

public abstract class House extends Person {

    private int id1;
    private String nameOfHouse;
    private String address;
    private int price;
    private int year;
    private Person [] persons ;
    private Person [] persons2 ;

    int indexOfPerson = 0;
    int indexOfPerson2 = 0;



    abstract void city();
abstract void electricity();

    public House(int id, String firstName, String lastName, String email, int age, String phoneNumber, int id1, String nameOfHouse, String address, int price, int year, Person[] persons, Person[] persons2) {
        super(id, firstName, lastName, email, age, phoneNumber);
        this.id1 = id1;
        if (nameOfHouse.startsWith("r") || nameOfHouse.startsWith("o") || nameOfHouse.startsWith("b")
                || nameOfHouse.startsWith("m") || nameOfHouse.startsWith("v") || nameOfHouse.startsWith("h")) {
            this.nameOfHouse = nameOfHouse;
        }
        else{
            System.out.println("Error");
        }
        if (address.length() >= 2) {
            this.address = address;
        } else {
            System.out.println("We don't have this address");
        }
        if (price <= 70000) {
            System.out.println("Error");
        } else {
            this.price = price;
        }
        if (year <= 2015) {
            System.out.println("Error");
        } else {
            this.year = year;
        }

        this.persons = persons;
        this.persons2 = persons2;

    }

public void addPersonsToFirstHouse(Person person){

    this.persons[indexOfPerson] = person;
    indexOfPerson++;

    }
    public void  addPersonsToSecondHouse(Person person2){
        this.persons2[indexOfPerson2] = person2;
        indexOfPerson2++;
    }


    @Override
    public int getId() {
        return id1;
    }

    public String getNameOfHouse() {
        return nameOfHouse;
    }

    public String getAddress() {
        return address;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getId1() {
        return id1;
    }

    public int getIndexOfPerson() {
        return indexOfPerson;
    }

    public Person[] getPersons() {
        return persons;
    }

    public Person[] getPersons2() {
        return persons2;
    }

    @Override
    public String toString() {
        return "House{" +
                "id1=" + id1 +
                ", nameOfHouse='" + nameOfHouse + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", persons=" + Arrays.toString(persons) +
                ", persons2=" + Arrays.toString(persons2) +
                ", indexOfPerson=" + indexOfPerson +
                ", indexOfPerson2=" + indexOfPerson2 +
                '}';
    }
}
