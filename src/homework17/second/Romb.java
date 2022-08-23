package homework17.second;

public class Romb extends Shape{
    int r;
    int o;
    int m;
    int b;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Romb(int r, int o, int m, int b) {
        this.r = r;
        this.o = o;
        this.m = m;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return r+o+m+b;
    }
}
