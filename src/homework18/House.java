package homework18;

public abstract class House {


    private Person[] numberOfPersons;
    private int index = 0;

    public House() {

    }


    void addPerson(Person person){
        numberOfPersons[index] = person;
        index++;
    }

    public House(Person[] numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public int getIndex() {
        return index;
    }
}
