public class Prog_5_3 {
    public static void main(String[]args) {
        // แสดงข้อความ
        System.out.printf("%-10s %10s\n","Kilograms","Pounds");
        // for loop ให้kiloเท่ากับหนึ่ง ถ้าkiloยังน้อยกว่าหรือเท่ากับ 199 ให้ทำ code ใน {} หลังจากนั้น ไปทำ statement2 อีกที
        for (int kilo=1 ;kilo<=199; kilo=kilo+2) {
            //System.out.println(kilo);
            double pound = kilo*2.2;
            //System.out.println((float) pound);
            System.out.printf("%-10d %,10.1f\n",kilo,pound);
        }
    }
}