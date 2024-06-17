public class Prog_5_3v1 {
    public static void main(String[]args) {

        System.out.printf("%s   %s\n", "Kilograms", "Pounds");

        for (int kilo=1 ; kilo<=199 ; kilo+=2) {

//            System.out.println(kilo);
            double pound = kilo * 2.2;
//            System.out.println(pound);

            System.out.printf("%d   %.1f\n",kilo, pound);

        }
    }
}