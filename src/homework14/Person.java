package homework14;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation){
        this.name = name;
        this.designation = designation;
    }
    public Person(){

    };
    void walk(){
        System.out.println("I can walk");
    }
    void learn(){
        System.out.println("I can learn");
    }
    void eat(){
        System.out.println("I can eat");
    }
    String getName(){
        return name;
    }
    String getDesignation(){
        return designation;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
