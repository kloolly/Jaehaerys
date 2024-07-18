public class arrayChap01 {

    public static void main(String[] args) {
//        array();
//        loopThroughArrayBacis();
//        loopThroughArrayForEach();
        example();
    }
    public static void array() {
        //String[] cars;
        String[] cars = {"volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars[0]);

        cars[0] = "Mercedes";

        System.out.println(cars[0]);
        System.out.println(cars.length);
    }

    public static void loopThroughArrayBacis() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    public static void loopThroughArrayForEach() {
//    for (type variable : arrayname) {
//        ...
//    }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void example() {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
//        int length = ages.length;
//         Create a 'lowest age' variable and assign the first array element of ages to it
        int lowestAge = ages[0];
        System.out.println(lowestAge);
        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array is: " + lowestAge);
    }
}