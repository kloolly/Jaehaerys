package w3;

class Second {
    public static void main(String[]args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        myObj.x = 40;
        System.out.println(myObj.x);
        System.out.println(myObj.z);
//        myObj.z = 10;

        Main myObj2 = new Main();
        System.out.println(myObj2.x);
        System.out.println(myObj.x);
        System.out.println(myObj.firstName);


    }
}
