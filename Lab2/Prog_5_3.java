public class Prog_5_3 {
    public static void main(String[]args) {
        System.out.printf("%-10s %10s\n", "Kilograms","Pounds");
        for (int k=1 ; k<=199 ; k+=2) {
//            System.out.println(k);
            double pounds = k*2.2;
            System.out.printf("%-10d %10.1f\n",k,pounds);
        }
    }
}
