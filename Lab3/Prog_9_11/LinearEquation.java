public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a,double b, double c,double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }
    public double getterA() {
        return a;
    }
    public double getterB() {
        return b;
    }
    public double getterC() {
        return c;
    }
    public double getterD() {
        return d;
    }
    public double getterE() {
        return e;
    }
    public double getterF() {
        return f;
    }
    public boolean isSolvable() {
        return (a*d)-(b*c)!=0;
    }
    public double getX() {
        return (e*d-b*f) / (a*d-b*c);
    }
    public double getY() {
        return (a*f-e*c) / (a*d-b*c);
    }
}