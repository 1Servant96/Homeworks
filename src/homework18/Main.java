package homework18;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        Person saikal = new Person();
        Person ikal = new Person();
        Person saika = new Person();
        Person [] apartmentFamily = {saika,saikal,ikal};
        Apartment apartment = new Apartment(apartmentFamily);

        Person akyl =  new Person();
        Person aida =  new Person();
        Person adam =  new Person();
        Person kamila = new Person();
        Person [] otelFamily = {akyl, aida, adam, kamila};
        Otel otel = new Otel(otelFamily);

        Person zhibek = new Person();
        Person astralbek = new Person();
        Person nurbek = new Person();
        Person aibek = new Person();
        Person zhyrgal = new Person();
        Person [] dormitoryFamily = {zhibek, astralbek, nurbek, aibek, zhyrgal};
        Dormitory dormitory = new Dormitory(dormitoryFamily);

        apartment.zhashoo();
        apartment.payForLive();
        System.out.println("Number of people in apartmentFamily:");
        for (Person i:apartmentFamily) {
            apartment.addPerson(i);
        }
        System.out.println(apartment.getIndex());

        System.out.println();
        otel.zhashoo();
        otel.payForLive();
        for (Person q : otelFamily) {
            otel.addPerson(q);
        }
        System.out.println("Number of people in otelFamily:");
        System.out.println(otel.getIndex());
        System.out.println();

        dormitory.zhashoo();
        dormitory.payForLive();
        for (Person w : dormitoryFamily) {
            dormitory.addPerson(w);
        }
        System.out.println("Number of people in dormitoryFamily:");
        System.out.println(dormitory.getIndex());
    }
}
