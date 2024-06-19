import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args) {
//        สร้าง obj ชื่อ scanIn ไว้รับค่าจาก user
        Scanner scanIn = new Scanner(System.in);
//        ให้ user ป้อนค่าปี 2 ค่า
        System.out.print("Please enter START and END years: ");
//        เก็บค่าปี 2 ค่า เป็น int
        int startYear = scanIn.nextInt();
        int endYear = scanIn.nextInt();
//        แสดงคำอธิบายว่าที่ป้อนมามีปีที่มี 366 วัน ดังนี้
        System.out.println("From "+startYear+" to "+endYear+", there are 366 days in these years: ");
//        สร้างตัวแปรชื่อ counter มีค่าเท่ากับ 0
        int counter =0;
//        ลูปนับเลขตั้งแต่ startYear จนถึง endYear
        for (int i=startYear ; i<=endYear ; i++) {
//            ถ้า เลขที่นับอยู่ หารด้วย 4 ลงตัว และ หารด้วย 100 ไม่ลงตัว หรือหารด้วย 400 ลงตัว ให้แสดงค่าที่นับ และ counter+1 ทุกครั้งที่ loop
            if (i%4==0 && (i%100!=0 || i%400==0)) {
                System.out.printf("% d",i);
                counter++;
//                และถ้า counter มีค่าที่ 5 หารลงตัว ให้ขึ้นบรรทัดใหม่
                if (counter%5==0) {
                    System.out.println("");
                }
            }
        }
//        แสดงค่า counter
        System.out.println("\nTotal = "+counter);
    }
}