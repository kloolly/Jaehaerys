public class LinearEquation {
    private static double a;
    private static double b;
    private static double c;
    private static double d;
    private static double e;
    private static double f;

    LinearEquation (double a, double b, double c, double d, double e, double f) {

    }
    public double getterA(){
        return a;
    }
    public double getterB(){
        return b;
    }
    public double getterC(){
        return c;
    }
    public double getterD(){
        return d;
    }
    public double getterE(){
        return e;
    }
    public double getterF(){
        return f;
    }

    public static boolean isSolvable() {
        if ((a*d)-(b*c)!=0) {
            return true;
        }
        return false;
    }

    public double getX() {
        return (e*d-b*f)/(a*d-b*c);
    }

    public double getY() {
        return (a*f-e*c)/(a*d-b*c);
    }
}
