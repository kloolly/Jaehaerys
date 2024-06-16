public class forLoopChap02 {

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
        for (int i=fromNumber;i<=toNumber;i++) {
            result = result + i;
        }
        return result;
    }

    public static void mutliplicationTable (int n) {
        for (int i = 1; i <= 12 ; i++) {
            // %d เป็นการกำหนดให้ Compilers ทราบว่า เราจะแสดงผลออกเป็นข้อมูลชนิด Integer
            // อ่านได้ว่า %d ตัวแรก รับค่า n, %d ตัวที่สอง รับค่า i ซึ่งทำ loop มา และ %d ตัวที่สาม มีค่าเท่ากับ n*i ของรอบ loop นั้นๆ และ \n ขึ้นบรรทัดใหม่
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }

    public static void printChar () {
        for (char c = 'A'; c<='Z'; c++) {
            System.out.printf("%c\n", c);
        }
    }

    public static void printCharVer2 () {
        for (int c = 65; c<=90; c++) {
            System.out.printf("%c", (char)c);
        }
    }

    public static void printCharVer3 () {
        for (int c = 65; c<=90; c++) {
            System.out.printf("%d -> %c\n", c, (char)c);
        }
    }

    public static void main(String[]args) {
        printCharVer3();
//        printCharVer2();
//        printChar();
//        mutliplicationTable(5);
//        System.out.println(sum(8,10));
    }
}
