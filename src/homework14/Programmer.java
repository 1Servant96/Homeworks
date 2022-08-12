package homework14;

public class Programmer extends Person {
    private String companyName;
    public Programmer(String companyName, String name, String designation){
        super(name, designation);
        this.companyName = companyName;
    }
     public void coding(){
        System.out.println("I can code");
    }

    String getCompanyName() {
        return companyName;
    }


    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                super.toString()+
                '}';
    }
}
