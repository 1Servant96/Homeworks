package Homeworks;

class Cat{
    private int age;
    private String name;
    private String color;
    void setAge(int jash){
        if(jash>0){
            age = jash;}

        else{
            System.out.println("You couldn't give a negative age for creatures");
        }
    }
    void setColor(String tus){
        color = tus;
    }
    void setName(String nickname){
        name = nickname;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

