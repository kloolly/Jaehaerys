public class TestVehicle {
    public static void main(String[]args) {
        Vehicle vehicle1 = new Vehicle();
//        System.out.println(vehicle1.x1); // อันนี้แตกเด้อ ไปเรียก private มันไม่มาให้เด้อ
        System.out.println(vehicle1.getX1()); // อันนี้มาแล้ว เพราะไปเรียก method ที return ค่า x1 มา
        System.out.println(vehicle1.x2);
        System.out.println(vehicle1.x3+"\n");

        Car car1 = new Car();
//        System.out.println(car1.x1);
        System.out.println(car1.getX1());
        System.out.println(car1.x2);
        System.out.println(car1.x3);
        System.out.println(car1.y1+"\n"); // 11

        // อันนี้คือเรียก method getSum ที่อยู่ใน class Vehicle ผ่าน obj car1
        // แล้วบวกกับค่าในตัวแปร y1 ที่อยู่ใน class Car
        System.out.println(car1.getSum()+car1.y1); // มันคือ 6 + 11 นะ

//        อันนี้เรียก method getSumVerCar ของ subclass Car ที่มันทำทุกอย่างมาเรียบร้อยแล้ว
        System.out.println(car1.getSumVerCar());





    }
}
