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
        System.out.println(car1.y1);


    }
}
