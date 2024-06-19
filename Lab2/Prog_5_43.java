public class Prog_5_43 {
    public static void main(String[]args) {

        // for loop นับ 1-7
        int counter =0;
        for (int i=1 ; i<=7 ; i++) {
//            System.out.println(i);
            for (int j=i+1 ; j<8 ; j++) {
                System.out.println(i+" "+j);
                counter++;
            }
        }
        System.out.println("The total number of all combinations is "+counter);

    }
}