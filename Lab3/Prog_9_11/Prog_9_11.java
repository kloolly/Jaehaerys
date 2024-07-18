// driver class รันไฟล์นี้

import java.util.Scanner;

public class Prog_9_11 {
    public static void main(String[]args) {
//        เรียกใช้ Scanner สร้าง obj ชื่อ scanIn
//        แสดงข้อความให้ผู้ใช้ป้อนค่า และเก็บในตัวแปรที่กำหนด
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f : ");
        double a = scanIn.nextDouble();
        double b = scanIn.nextDouble();
        double c = scanIn.nextDouble();
        double d = scanIn.nextDouble();
        double e = scanIn.nextDouble();
        double f = scanIn.nextDouble();

//        เรียกใช้ class LinearEquation ผ่าน obj ชื่อ monDay
        LinearEquation monDay = new LinearEquation(a,b,c,d,e,f);

//        กำหนดว่าถ้าค่า arguement ที่ผ่านเข้ามาของ monDay เช็คแล้วว่าคำนวณได้ คือ isSolvable = true
//        ให้แสดงค่า x=, y= มิฉะนั้นแสดงว่า่คำนวณไม่ได้ คือ isSolvable = false ให้แสดงข้อความ
        if (monDay.isSolvable()) {
            System.out.println("x = "+monDay.getX());
            System.out.println("y = "+monDay.getY());

        } else System.out.println("The equation has no solution.");
}
}
//    1 2 3 4 5 6     400 3 0 12 199 76
//
//    0 0 0 0 0 0

