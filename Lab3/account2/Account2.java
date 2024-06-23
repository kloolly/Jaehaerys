public class Account2 {
//    data
//    สร้างตัวแปร 3 ตัว แต่ numAccount เป็น statice เพราะจะใช้เก็บค่าร่วมกันทุก method กำหนดให้ทุกตัวเป็น private
    private static int numAccount=0;
    private String name;
    private double balance;

//    method
//    สร้าง method ชื่อ Account รับค่า name เอาไปเก็บที่ตัวแปร name ก็เลยใช้ this.name โดยเมื่อเรียกใช้ method นี้ ก็จะนับ numAccount เพิ่มทีละ 1

    public Account2(String name) {
        numAccount++;
        this.name=name;
        balance=0;
    }
//    สร้าง method ชื่อ Account รับค่า name และ balance เก็บที่ this.name และ this.balance โดยเมื่อเรียกใช้ method นี้ ก็จะนับ numAccount เพิ่มทีละ 1

    public Account2(String name, double balance) {
        numAccount++;
        this.name=name;
        this.balance=balance;
    }
//    สร้าง method ชื่อ deposit โดยบอกว่าฟังก์ชั่นนี้ไม่มีการคืนค่า ทำงานโดยเอา amount ไปบวกเพื่ม balance

    public void deposit(double amount) {
        this.balance+=amount;
    }
//    สร้าง method ชื่อ withdraw ที่จะคืนค่าเป็น true, false โดยรับค่า amount มาทำงาน
//    ถ้า balance คือเงินในบัญชีมีมากกว่าจำนวนถอน เพราะนี้มัน function withdraw ถอนเงิน ให้ลบ balance ด้วย amount ถ้าทำได้ ให้คืนค่า true กลับไป คือบอกว่าถอนได้
//    ไม่งั้น ให้คืนค่า false ก็คือถอนไม่ได้
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance-=amount;
            return true;
        } return false;
    }
//    ใช้ method toString คืนค่า name กับ balance เป็น String
    public String toString() {
        return name+": "+balance;
    }
//    สร้าง method getNumAccount ที่จะ return numAccount เมื่อ method นี้ถูกเรียก ใช้สำหรับการเข้าถึงข้อมูลที่เป็นแบบ private จากนอกคลาส
    public int getNumAccount(){
        return numAccount;
    }
//    สร้าง method getName ที่จะ return name เมื่อ method นี้ถูกเรียก ใช้สำหรับการเข้าถึงข้อมูลที่เป็นแบบ private จากนอกคลาส
    public String getName() {
        return name;
    }
//    สร้าง method getBalance ที่จะ return balance เมื่อ method นี้ถูกเรียก ใช้สำหรับการเข้าถึงข้อมูลที่เป็นแบบ private จากนอกคลาส
    public double getBalance() {
        return balance;
    }
//    สร้างตัว method เพื่อกำหนดค่าให้ this.name ของไฟล์นี้ จากค่า name ที่รับมา แล้วไม่ต้อง return อะไรกลับไป
    public String setName(String name) {
        return null;
    }
}
