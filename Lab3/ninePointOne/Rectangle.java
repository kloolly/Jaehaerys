//    สร้าง class Rectangle กำหนดตัวแปร width height
public class Rectangle {
    public double width;
    public double height;
//    กำหนดค่าให้ตัวแปร width height
    public Rectangle() {
        this.width=1;
        this.height=1;
    }
//    สร้าง method Rectangle รับค่า width height จาก arguement มากำหนดใน class Rectangle
    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }
//    สร้าง method getArea คำนวณพื้นที่แล้วคืนค่ากลับไป
    double getArea() {
        return width*height;
    }
//    สร้าง method getPerimeter คำนวณเส้นรอบรูปแล้วคืนค่ากลับไป
    double getPerimeter() {
        return (width+height)*2;
    }
}
