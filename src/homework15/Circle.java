package homework15;

import static javax.swing.text.html.parser.DTDConstants.PI;

public class Circle {
    private static double radius;

     void setRadius(double radius){
        if(radius>0){
            this.radius = radius;
        }
        else{
            System.out.println("Radius couldn't be the negative number");
        }
    }
    static double getPi(){
        return Math.PI;
    }
    static double getRadius(){
        return radius;
    }
    static double getArea(){
        return getPi()*(Math.pow(radius,2));
    }
    static double getCircumference(){
         return 2*getPi()*radius;
    }

    @Override
    public String toString() {
        return ""+getArea()+getCircumference();
    }
}
