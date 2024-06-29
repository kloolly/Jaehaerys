// class Car เป็น class ลูก ของ Vehicle
class Car extends Vehicle {
    public int y1 =11;

//    อันนี่สร้าง method getSumVerCar ให้ return ค่าจาก getSum ของ class Vehicle
    protected int getSumVerCar() {
        return super.getSum()+y1;
    }
}
