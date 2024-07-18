package LearnClass;

public class BoxV2 {
    private double w, h, d;

    public void setW(double w) {
        this.w = w;
    }
    public void setH(double h) {
        this.h=h;
    }
    public void setD(double d) {
        this.d=d;
    }

    public double volume() {
        return w*h*d;
    }
}
