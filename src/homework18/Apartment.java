package homework18;

import java.util.Arrays;

public class Apartment extends House implements Action {
    private Person[] apartmentFamily;

    public Apartment(Person[] apartmentFamily) {
        super(apartmentFamily);
        this.apartmentFamily = apartmentFamily;
    }
    public Apartment(){
    }




    @Override
    public void zhashoo() {
        System.out.println("We live in "+ getClass().getSimpleName());
    }

    @Override
    public void payForLive() {
        System.out.println("Platim za com uslugi");

    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentFamily=" + Arrays.toString(apartmentFamily) +
                '}';
    }
}
