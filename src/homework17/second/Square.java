package homework17.second;

public class Square extends Shape{
    int s;
    int q;
    int u;
    int e;
    public Square() {
    }

    @Override
    public double getPerimeter() {
        return s+q+u+e;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int getU() {
        return u;
    }

    public void setU(int u) {
        this.u = u;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public Square(int s, int q, int u, int e) {
        this.s = s;
        this.q = q;
        this.u = u;
        this.e = e;
    }
}
