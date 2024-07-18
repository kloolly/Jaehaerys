//สร้าง class ประกาศตัวแปรเป็น private
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

//    สร้าง method LinearEquation ที่รับ 6 arguement มากำหนดค่าให้กับตัวแปร
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
//    method isSolvable คืนค่าเป็น true ถ้า block code เป็นจริง
    public boolean isSolvable() {
        return (a*d)-(b*c)!=0;
    }
//    method getX เมื่อถูกเรียกใช้งานจะทำงานใน block code แล้วคืนค่าคำตอบกลับไป
    public double getX() {
        return (e*d-b*f) / (a*d-b*c);
    }
//    method getY เมื่อถูกเรียกใช้งานจะทำงานใน block code แล้วคืนค่าคำตอบกลับไป
    public double getY() {
        return (a*f-e*c) / (a*d-b*c);
    }
}