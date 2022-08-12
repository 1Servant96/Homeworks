package homework14;

public class Dancer extends Person{
    private String groupName;
    public Dancer(String groupName, String name, String designation){
        super(name, designation);
        this.groupName = groupName;
    }
    void dancing(){
        System.out.println("I can dance");
    }

    String getGroupName(){
        return groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                super.toString()+
                '}';
    }
}
