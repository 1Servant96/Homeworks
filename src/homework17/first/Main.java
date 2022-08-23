package homework17.first;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow(1, 520, "male","COW1");
        Cow cow2 = new Cow(3,640,"female","COW2");
        Cow cow3 = new Cow(4,860,"female","COW3");
        Cow cow4 =new Cow(6,1080,"female","COW4");
        Cow cow5 =new Cow(4,1454,"male","COW5");
        Cow cow6 =new Cow(3,1424,"male","I am sixth COW");

        Horse horse1 = new Horse(3,800,"male","Akhiles HORSE","brown");
        Horse horse2 = new Horse(4,346,"female","Aku HORSE","white");
        Horse horse3 = new Horse(2,845,"female","Atlas HORSE","dark");

        Sheep sheep1 = new Sheep(1,50,"male","Ak SHEEP");
        Sheep sheep2 = new Sheep(2,58,"female","Kara SHEEP");
        Sheep sheep3 = new Sheep(3,70,"male","Akuv SHEEP");
        Sheep sheep4 = new Sheep(4,45,"male","Can SHEEP");

        Animal[] animalsOfFirstFarm = {cow1, cow2, cow3, cow4, cow5, sheep1, sheep2, sheep3,horse1,horse2};
        Animal[] animalsOfSecondFarm = {cow6,sheep4,horse3};

        System.out.println("-------FIRST FARM--------");
        Farm firstFarm = new Farm("farmTown19","James",animalsOfFirstFarm);
        Farm secondFarm = new Farm("farmTown11","Jack",animalsOfSecondFarm);

        System.out.println(firstFarm.getAddress()+"\n"+firstFarm.getOwnerName()+"\n");
        System.out.println("Animals: \n"+Arrays.toString(firstFarm.getAnimals()));
        System.out.print("P.S. the Akhiles`s color is "+horse1.getColor());
        System.out.println(" and Aku`s color is "+horse2.getColor()+".");
        System.out.println("-------SECOND FARM-------");
        System.out.println("\n"+secondFarm.getAddress()+"\n"+secondFarm.getOwnerName()+"\n");
        System.out.println("Animals: \n"+ Arrays.toString(secondFarm.getAnimals()));
        System.out.println("color of Atlas is dark.");
    }
}
