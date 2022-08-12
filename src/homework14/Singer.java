package homework14;

public class Singer extends Person{
    private String bandName;
    public Singer(String bandName, String name, String designation){
        super(name, designation);
        this.bandName = bandName;
    }
    void playGuitar(){
        System.out.println("I can play on guitar");
    }
    void singing(){
        System.out.println("I can sing");
    }
    String getBandName(){
        return bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                super.toString()+
                '}';
    }
}
