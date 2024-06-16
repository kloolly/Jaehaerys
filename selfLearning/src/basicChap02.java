import java.util.Scanner;

public class basicChap02 {

    // เขียนแบบนี้ดีกว่า สร้าง method แยกออกจาก code ที่อยู่ภายใต้ main แล้วก็ให้ตัว main เรียกใช้ตัว method นั้น
    // ใน java , function ก็คือ method ประเภทนึง
    // function นี้ return ค่าเป็น int ตั้งชื่อ function ว่า rectangle แล้วให้รับ parameter 2 ตัวคือ int width กับ int height
    public static int rectangle(int width, int height) {
        return width * height;
    }

    public static int square(int width) {
//        return width*width;
        return rectangle(width, width);
    }

    public static double triangle(double widht, double height) {
        return 0.5*widht*height;
    }

    public static void main(String[] args) {
        System.out.println(triangle(4, 5.6));

        float vatRate = 0.07f;

        double d1 = 1.0/3.0;
        float f1 = 1.0f/3.0f;

        System.out.println("double:"+ d1);
        System.out.println("float:"+ f1);

        /*
        System.out.println(4 * 6);
        System.out.println("area = " + 4 * 6);

        int width;
        int height;
        int area;
//        width = 3;
//        height = 5;
//        area = width*height;
//        System.out.println("area = "+area);
        Scanner in = new Scanner(System.in);
        System.out.print("enter width: ");
        width = in.nextInt();
//        System.out.print("print width = "+ width);
        System.out.print("enter height: ");
        height = in.nextInt();
//        area = width * height;

        // ตัวอย่าง คำนวณ area แบบเรียกใช้ method ที่สร้าง โดย area = เรียก method ที่รับค่า (int width, int height)
        area = rectangle(width, height);
        System.out.println("area (" + width + " x " + height + ") = " + area);
        System.out.println(square(5));


         */

    }
}
