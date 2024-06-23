public class Account {
//    data
//    สร้างตัวแปร 3 ตัว แต่ numAccount เป็น statice เพราะจะใช้เก็บค่าร่วมกันทุก method
    static int numAccount=0;
    String name;
    double balance;

//    method
//    สร้าง method ชื่อ Account รับค่า name เอาไปเก็บที่ตัวแปร name ก็เลยใช้ this.name โดยเมื่อเรียกใช้ method นี้ ก็จะนับ numAccount เพิ่มทีละ 1
    public Account(String name) {
        numAccount++;
        this.name=name;
        balance=0;
    }
//    สร้าง method ชื่อ Account รับค่า name และ balance เก็บที่ this.name และ this.balance โดยเมื่อเรียกใช้ method นี้ ก็จะนับ numAccount เพิ่มทีละ 1
    public Account(String name, double balance) {
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
}
