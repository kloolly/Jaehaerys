public class Prog_5_5 {
    public static void main(String[]args) {
        System.out.printf("%-10s %10s %5s %5s %s\n","Kilograms","Pounds", "|", "Pounds", "Kilograms");

        for (int kilo1=1 ,pound2 = 20 ;kilo1<=199; kilo1=kilo1+2, pound2+=5) {
            //System.out.println(kilo);
            double pound1 = kilo1*2.2;
            double kilo2 = pound2/9.09;  // มันยังไงกัน
            //System.out.println((float) pound);

            System.out.printf("%-10d %,10.1f %5s %5d %.2f\n",kilo1,pound1, "|",pound2,kilo2);
        }
    }
}
//
//9 k = 20 p
//1 k = 20 /9