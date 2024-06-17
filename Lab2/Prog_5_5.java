public class Prog_5_5 {
    public static void main(String[]args) {
        System.out.printf("%-10s %10s\n","Kilograms","Pounds");
        for (int kilo=1 ;kilo<=199; kilo=kilo+2) {
            //System.out.println(kilo);
            double pound = kilo*2.2;
            //System.out.println((float) pound);

            System.out.printf("%-10d %,10.1f\n",kilo,pound);
        }
    }
}