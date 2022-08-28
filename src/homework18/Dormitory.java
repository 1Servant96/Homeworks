package homework18;

import java.util.Arrays;

public class Dormitory extends House implements Action {
    private Person[] dormitoryFamily;

    public Person[] getDormitoryFamily() {
        return dormitoryFamily;
    }

    public void setDormitoryFamily(Person[] dormitoryFamily) {
        this.dormitoryFamily = dormitoryFamily;
    }

    public Dormitory(Person[] dormitoryFamily) {
        super(dormitoryFamily);
        this.dormitoryFamily = dormitoryFamily;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "dormitoryFamily=" + Arrays.toString(dormitoryFamily) +
                '}';
    }

    @Override
    public void zhashoo() {
        System.out.println("We live in "+getClass().getSimpleName());

    }

    @Override
    public void payForLive() {
        Action.super.payForLive();
    }
}
