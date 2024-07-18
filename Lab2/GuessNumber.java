import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
//        สร้าง obj ชื่อ scanIn รับค่าจาก System.in
        Scanner scanIn = new Scanner(System.in);
//        สร้าง obj ชื่อ rand ของ method random
        Random rand = new Random();
//        ประกาศตัวแปรชื่อ randNum เป็น int โดยให้สุ่มจาก 1-100
        int randNum = rand.nextInt(100) + 1;
//        ประกาศตัวแปรชื่อ userGuess เป็น int = 0 ไว้เก็บค่าที่ user เดาใส่เข้ามา
        int userGuess = 0;
//        ประกาศตัวแปรชื่อ numberOfUserGuess เป็น int = 0 ไว้เก็บค่าจำนวนครั้งที่ user เดา
        int numberOfUserGuess = 0;
//        แสดงค่าที่สุ่มได้
        System.out.println(randNum);
//        แสดงคำแนะนำให้ user ป้อนตัวเลข
        System.out.print("Guess a number between 1-100 (inclusive) or -999 to exit: ");
//        ถ้าเลขที่ user เดา ไม่เท่ากับเลขที่สุ่มไว้ ให้เพิ่มค่าตัวแปร numberOfUserGuess ทีละ 1
        while (userGuess != randNum) {
            userGuess = scanIn.nextInt();
            numberOfUserGuess++;
//          ถ้า user พิมพ์ -999 ให้
            if (userGuess == -999) {
                // แสดงข้อความบอกว่าเลขที่โปรแกรมสุ่มมาเท่ากับอะไร แล้ว Bye จากนั้น break ออกจาก if ไปเลย
                System.out.println("The number was " + randNum + ". Bye!");
                break;
//          มิฉะนั้น ถ้าที่ user พิมพ์มาน้อยกว่าค่าที่สุ่มไว้
            } else if (userGuess < randNum) {
//          แสดงข้อความบอกว่าค่าที่เดาต่ำเกินไป
                System.out.print(userGuess + " is too low. Try again: ");
//          มิฉะนั้น ถ้าที่ user พิมพ์มามากกว่าค่าที่สุ่มไว้
            } else if (userGuess > randNum) {
//          แสดงข้อความบอกว่าค่าที่เดาสูงเกินไป
                System.out.print(userGuess + " is too high. Try again: ");
//          มิฉะนั้นให้ทำ
            } else {
//          ถ้าจำนวนครั้งที่ user เดาถูก = 1 คือใส่คำตอบถูกในครั้งแรกให้แสดง guess มิฉะนั้น ให้แสดง guesses
                if (numberOfUserGuess == 1) {
                System.out.println("Correct! With " + numberOfUserGuess + " guess.");
                } else {
                System.out.println("Correct! With " + numberOfUserGuess + " guesses.");
                }
            }
        }
    }
}
