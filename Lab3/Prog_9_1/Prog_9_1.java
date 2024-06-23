//นี้คือ driver class กดรันไฟล์นี้นะครับ
public class Prog_9_1 {
    public static void main(String[]args) {
//        เรียกใช้ class Rectangle สร้าง obj 2 อัน ส่ง arguement 2 ค่าตามโจทย์กกำหนด
        Rectangle obj1 = new Rectangle(4, 40);
        Rectangle obj2 = new Rectangle(3.5, 35.9);
//        แสดงผลลัพท์ตามโจทย์กำหนด
        System.out.println("-- Rectangle 1 -- ");
        System.out.println("Width: "+obj1.width);
        System.out.println("Height: "+obj1.height);
        System.out.println("Area: "+obj1.getArea());
        System.out.println("Perimeter: "+obj1.getPerimeter());
        System.out.println(" ");
        System.out.println("-- Rectangle 2 -- ");
        System.out.println("Width: "+obj2.width);
        System.out.println("Height: "+obj2.height);
        System.out.println("Area: "+obj2.getArea());
        System.out.println("Perimeter: "+obj2.getPerimeter());
    }
}
