package homework17.first;

import java.util.Arrays;

public class Farm {
    private String address;
    private Horse horse;
    private Cow cow;
    private Sheep sheep;
    private Animal[] animals;

    private String ownerName;
    public Farm(String address, String ownerName, Animal[] animals) {
        this.address = address;
        this.ownerName = ownerName;
        this.animals = animals;

    }

    public Farm(String farmTown11, String jack, Horse horse3, Sheep sheep4, Cow cow6){

    }

    public Animal[] getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", horse=" + horse +
                ", cow=" + cow +
                ", sheep=" + sheep +
                ", animals=" + Arrays.toString(animals) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
