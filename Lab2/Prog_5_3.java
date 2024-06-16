public class Prog_5_3 {
    public static void main(String[] args) {
        // แสดงหัวตาราง
        System.out.printf("%-12s%-10s\n", "Kilograms", "Pounds");

        // ลูปเพื่อคำนวณและแสดงผลการแปลง
        for (int kg = 1; kg <= 199; kg += 2) {
            double pounds = kg * 2.2;
            System.out.printf("%-12d%-10.1f\n", kg, pounds);
        }
    }
}