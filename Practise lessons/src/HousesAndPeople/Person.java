package HousesAndPeople;

import java.util.Random;
import java.util.Scanner;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String phoneNumber;
    int counter = 0;

    public Person() {
    }

    public void work(String work){
        System.out.println( firstName + " work in "+ work);

    }
    public void timeTable(int days, int hours){
        System.out.println(getFirstName() +" spend "+ days + " days and "+ hours + " hours per week");
    }



    public Person(int id, String firstName, String lastName, String email, int age, String phoneNumber) {
        while(age<0 || age>110){
            System.out.println("You couldn't give negatives values or not real age of human ");
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
        }
        if(age>0 && age<110){
            this.age = age;
        }

        if(!email.contains("@")){
            while(!email.contains("@")){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Type the email ");
                email = scanner.nextLine();
            }
        }
        if (email.contains("@")){
            this.email = email;
        }

if(!(String.valueOf(id).length()==4)){
    while (!(String.valueOf(id).length()==4)){
        System.out.println("Id consists from 4 digits");
    }
}
        if((String.valueOf(id).length()==4)){
            this.id = id;
        }
        if(!(firstName.length() >=2)){
            while(!(firstName.length() >=2)){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Name should be longer ");
                firstName = scanner.nextLine();
            }
        }
        if(firstName.length() >=2) {
            this.firstName = firstName;
        }
        if (!(lastName.length() >=2)){
            while (!(lastName.length() >=2)){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Surname should be longer ");
                lastName = scanner.nextLine();
            }
        }
        if(lastName.length()>=2){
            this.lastName = lastName;
        }
if(!(phoneNumber.startsWith("+996") && (phoneNumber.length() ==13))){
    while (!phoneNumber.startsWith("+996") && !(phoneNumber.length() ==13)){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You need a kyrgyz number phone");
        phoneNumber = scanner.nextLine();
    }
}
if(phoneNumber.startsWith("+996") && phoneNumber.length() ==13){
    this.phoneNumber = phoneNumber;
}
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getCounter() {
        return counter;
    }
    @Override
    public String toString() {
        return
                '\n'+"id = " + id +'\n'+
                "firstName = " + firstName + '\n' +
                "lastName = " + lastName + '\n' +
                "email = " + email + '\n' +
                "age = " + age + '\n'+
                "phoneNumber = " + phoneNumber + '\n'
                ;
    }
}
