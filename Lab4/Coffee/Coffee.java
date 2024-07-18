//    สร้าง class ชื่อ Coffee กำหนดตัวแปร brand และ price เป็น String และ double
class Coffee {
    String brand;
    double price;
//    สร้าง constructor ชื่อ Coffee กำหนดค่าตามโจทย์ แต่ผมไม่ได้กำหนด Java Access Modifiers ให้เพราะคิดว่าถ้า error ค่อยมาใส่เพิ่มทีหลัง
    Coffee() {
        brand="generic";
        price=5;
    }
//    สร้าง constructor ชื่อ Coffee ที่จะรับค่ามาใส่ตัวแปร
    Coffee(String brand, double price) {
        this.brand=brand;
        this.price=price;
    }
    String getBrand() {
        return brand;
    }
    double getPrice() {
        return price;
    }
//    method สำหรับแสดงผล ใช้ print format เพราะอาจารย์ไม่ได้สอน ผมว่ามันสนุกดี
    protected void printBill (int numCup) {
        System.out.printf("%s%s %d %s%.1f %s%.1f\n", brand, ":", numCup, "x $", price, "= $", price*numCup);
    }
}
