package HousesAndPeople;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int v = 0;
        int b = 0;
        Person maksat = new Person(3434, "Maksat", "Ylyanov", "aa@qw ", 18, "+996771098756");
        Person asan = new Person(2145, "Asan", "Asanov", "aa@Davidov", 35, "+996557431908");
        Person aizada = new Person(5234, "Aizada", "Alkanov", "as@qwerty", 21, "+996557431278");
        Person aiperi = new Person(2353, "Aiperi", "kemelkyzy", "ss@azanov.05", 32, "+996776235432");
        Person mirbek = new Person(1433, "Mirbek", "Yusupov", "qw@azanov", 77, "+996557324323");

        Person aibek = new Person(3231, "Aibek", "Atabekov", "as@mirbekatabekov.2008", 17, "+996557431278");
        Person atabek = new Person(3143, "Atabek", "Nurbekov", "@nurbekov.02", 20, "+996779308867");
        Person almazbek = new Person(1335, "Asan", "Azanov", "@azanov.95", 56, "+996999151213");
        Person uson = new Person(4522, "Uson", "Azarov", "@azarov.12", 45, "+996999121211");
        Person davlet = new Person(9327, "Davlet", "Davletuulu", "@Davletuulu", 37, "+996557431278");

        Person[] personsOfVillageHouse = {aibek, atabek, almazbek, uson, davlet};
        Person[] personsOfBestHouse = {maksat, asan, aizada, aiperi, mirbek};
        Arrays.toString(personsOfVillageHouse);
        Arrays.toString(personsOfBestHouse);
        VillageHouse house1 = new VillageHouse(7689, "ownerJack", "Jackov", "@village.house", 50, "+996771201726", 7685, "villageHouse", "chuy19", 70_001, 2016, personsOfVillageHouse,personsOfVillageHouse);
        BestHouse house2 = new BestHouse(9870, "ownerSyimyk", "Syimykov", "@best.house", 37, "+996772546576", 8567, "bestHouse", "chuy16", 100_000, 2020, personsOfBestHouse,personsOfBestHouse);

        System.out.println("-----House in village-----");
        for (Person i: personsOfVillageHouse) {
            house1.addPersonsToFirstHouse(i);
        }
        System.out.println("number of people: "+house1.getPersons().length);
        aibek.timeTable(5,3); ;
        aibek.work("taxi\n");
        atabek.timeTable(7,4);
        atabek.work("goverment \n");
        asan.timeTable(7,5);
        asan.work("police \n");
        uson.timeTable(1,2);
        uson.work("singer\n");
        davlet.timeTable(6,4);
        davlet.work("engineer\n");
        house1.city();
        house1.electricity();
        System.out.println("--------------------------------------------");
        System.out.println("-------The Best house-------");
        for (Person i: personsOfBestHouse) {
            house2.addPersonsToSecondHouse(i);
        }
        System.out.println("number of people: "+house2.getPersons().length);
        maksat.timeTable(4,4);
        maksat.work("Peaksoft\n");
        asan.timeTable(4,6);
        asan.work("goverment \n");
        aizada.timeTable(4,4);
        aizada.work("cybersecurity \n");
        aiperi.timeTable(7,4);
        aiperi.work("vocal\n");
        mirbek.timeTable(2,6);
        mirbek.work("politic\n");
        house2.city();
        house2.electricity();
    }
}



