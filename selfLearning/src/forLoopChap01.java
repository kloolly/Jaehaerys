public class forLoopChap01 {

    public static void demo1 () {
        for (int i=1;i<=5;i=i+1) { // i=i+1 เขียนอีกแบบได้คือ i++
            System.out.println(i);
            System.out.println("----");

        }
        System.out.println("Bye");
    }

    public static void demo2 () {
        for (int i=1;i<=10;i=i+2) { // i=i+2 เขียนอีกแบบได้คือ i+=2
            System.out.println(i);
            System.out.println("----");
        }
    }
    public static void demo3 () {
        for (int i=10;i>=0;i--) {
            System.out.println(i);
            System.out.println("----");
        }
        System.out.println("BOOM!");
    }
    public static void demoSum1 () {
        int result =0;
        for (int i=1;i<=5;i++) {
            result = result + i;
        }
        System.out.println(result);
    }
    public static int sum (int fromNumber, int toNumber) {
        int result =0;
        for (int i=fromNumber ; i<=toNumber ; i++) {
            result = result + i;
        }
        return result;
    }

    public static void main(String[]args) {
        //System.out.println(sum(8,10));
        System.out.println(demo2(););
    }
}
