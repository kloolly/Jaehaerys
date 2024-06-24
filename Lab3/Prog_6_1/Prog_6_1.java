public class Prog_6_1 {

    public static int getPentagonalNumber(int n) {
        return n*(3*n-1)/2;
    }

    public static void main(String[]args) {
        int counter=0;
        for (int i=1 ; i<=100 ; i++) {
//            System.out.print(getPentagonalNumber(i));
            System.out.printf("% d",getPentagonalNumber(i));
            counter++;
            if (counter%10==0) {
                System.out.println();
            }
        }
    }
}
