package homework17.second;

public class Triangle extends Shape{
    int a;
    int b;
    int c;
public Triangle(int a, int b, int c){
    this.a = a;
    this.b = b;
    this.c = c;

}

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public double getPerimeter() {
        return a+b+c ;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
