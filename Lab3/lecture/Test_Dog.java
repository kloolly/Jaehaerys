public class Test_Dog {
    public static void main(String[]args) {
//        Dog: คือประเภทของตัวแปรที่จะสร้าง ในกรณีนี้ Dog เป็นชื่อของคลาส คลาสนี้มีโครงสร้างและพฤติกรรมที่วัตถุ Dog จะสืบทอดหรือได้รับเมื่อถูกสร้าง
//        gaga: เป็นชื่อตัวแปรที่ใช้เก็บวัตถุที่ถูกสร้างขึ้นจากคลาส Dog ชื่อนี้เป็นที่อ้างอิงของวัตถุในโค้ดต่อๆ ไป โดยผ่านตัวแปรนี้เราสามารถเข้าถึงคุณสมบัติและฟังก์ชันต่างๆ ที่วัตถุ Dog มี
//        new: เป็นคำสั่งหรือคีย์เวิร์ดใน Java ที่ใช้สำหรับการสร้างอินสแตนซ์ของคลาส ในที่นี้คือสร้างวัตถุใหม่จากคลาส Dog
//        Dog(): เรียกใช้ constructor ของคลาส Dog ซึ่งเป็นฟังก์ชันพิเศษที่ใช้สำหรับการสร้างและกำหนดค่าเริ่มต้นให้กับวัตถุใหม่ ในกรณีนี้เรียกใช้ constructor ที่ไม่มีการรับพารามิเตอร์
//        รวมแล้ว, บรรทัดนี้คือการสร้างวัตถุใหม่ของคลาส Dog และเก็บไว้ในตัวแปรที่ชื่อ gaga
//        คือเรียกใช้ class Dog ใน obj ชื่อ gaga
//        Dog gaga = new Dog();
//        gaga.bark();
//        gaga.wag();
////        gaga=null;
//
//        Dog gogo = gaga;
//        Dog gigi = gaga;
//        gogo.bark();
//
//        gigi.wag();
//
//        gogo = new Dog();
//        gogo.wag();
//
        Dog gaga = new Dog();
        gaga.count++;
        gaga.age=5;
        System.out.println(gaga.count+" "+gaga.age);

        Dog gogo = new Dog();
        gogo.count++;
        gogo.age=8;
        System.out.println(gogo.count+" "+gogo.age);
        

        System.out.println(gaga.count);
        System.out.println(gogo.count);
    }
}
