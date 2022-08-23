package homework17.first;

public class Horse extends Animal{

    private String color;
    public Horse(int age, int weight, String gender, String nickName, String color){
        super(age, weight, gender, nickName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
