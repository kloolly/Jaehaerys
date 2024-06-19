public class Prog_5_15 {
    public static void main(String[]args) {
        int counter=0;
        for (int i=33 ; i<=126 ; i++) {
            System.out.printf("%c ",(char) i);
            counter++;
            if (counter % 10==0) {
                System.out.println();
            }
        }
    }
}

//33 , 126