// สร้าง class Dog
public class Dog {
//    สร้าง function ชื่อ bark
//    โดยที่มี public คือ modifier และ void บอกว่าฟังก์ชันนี้ไม่มีการคืนค่ากลับไป
//    bark() คือชื่อของฟังก์ชันและ () บอกว่าฟังก์ชันนี้ไม่ต้องการพารามิเตอร์ใดๆ ในการทำงาน
//    public void bark () {
//        System.out.println("This is bark ().");
//    }
//    public void wag () {
//        System.out.println("This is wag ().");
//    }

//    ในคลาสก็จะมี Data กับ Method
//    Data
//    count เป็นตัวแปรที่ใช้ร่วมกัน ใส่ static ไว้ด้วย
    static int count;
    int age;


//    Method
    public void bark () {
    System.out.println("This is bark ().");
}
    public void wag () {
        System.out.println("This is wag ().");
    }

}