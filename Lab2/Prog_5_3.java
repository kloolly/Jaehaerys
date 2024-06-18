public class Prog_5_3 {
    public static void main(String[]args) {
        System.out.printf("%s %10s","Kilograms", "Pounds\n");
        for (int kilo=1; kilo<=199;kilo++) {
            double pounds = kilo*2.2;
            System.out.printf("%-10d %8.1f\n",kilo,pounds);
        }
    }
}

//
//int number = 42;
//printf("%10d\n", number);  กำหนดให้พิมพ์ตัวเลขในช่องว่างกว้าง 10 ช่อง
//    return 0;