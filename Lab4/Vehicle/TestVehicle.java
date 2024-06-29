public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();

        System.out.println("Vehicle: ");
//        System.out.println(v1.x1);
        System.out.println(v1.getX1());
        System.out.println(v1.x2);
        System.out.println(v1.x3);

        System.out.println("Car:");
        System.out.println(v1.getX1());
        System.out.println(v1.x2);
        System.out.println(v1.x3);

    }
}
