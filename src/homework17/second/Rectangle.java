package homework17.second;

public class Rectangle extends Shape{
    int r;
    int e;
    int c;
    int t;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public Rectangle(int r, int e, int c, int t) {
        this.r = r;
        this.e = e;
        this.c = c;
        this.t = t;
    }

    @Override
    public double getPerimeter() {
        return r+e+c+t;
    }
}
