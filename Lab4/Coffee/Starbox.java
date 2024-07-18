//    สร้าง subclass ของ Coffee ชื่อ Starbox กำหนดค่าตัวแปรที่จำเป็นสำหรับ Starbox เช่น upSize หรือไม่ และ ราคาพิเศษ
class Starbox extends Coffee {
    boolean upSize;
    final double UPSIZE_EXTRA = 1.25;

//    สร้าง method ที่จะรับค่า bool มา
//    สร้างตัวแปร brand และ price สำหรับใช้กับ Starbox
//    และถ้ามีการ upSize=true ให้เอาราคาปกติคูณกับ 25% ก็คือ 1.25
    Starbox(boolean upSize) {
        this.upSize = upSize;
        brand = "Starbox";
        price = 10;
        if (upSize) {
            price = price * UPSIZE_EXTRA;
        }
    }
//    method สำหรับแสดงผล
//    มีเงื่อนไขว่าถ้ามีการ upSize=true ให้แสดงข้อความ UPSIZE
    protected void printBill (int numCup) {
        System.out.println("~*~ Good Morning ~*~");
        if (upSize)
            System.out.println("UPSIZE");
        super.printBill(numCup);
        System.out.println("~*~ Thank you ~*~");
    }

}

