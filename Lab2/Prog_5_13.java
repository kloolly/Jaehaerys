public class Prog_5_13 {
    public static void main(String[]args) {

        int n =0;
        // n คือเลขอะไรที่ยกกำลัง 3 แล้วได้น้อยกว่า 12000
        // ให้ นับ n ไปเรื่อยๆ แต่พอทำ loop รอบสุดท้ายแล้ว มันมี n++ อีกครั้งนึง ตอนตอบเลย n-1 ให้
        while (Math.pow(n,3)<12000) {
            n++;
        }
        System.out.println(n-1);
    }
}
