package Lab2;

public class LeapYear {
    //
    public static boolean isLeapYear(){
        int year;
        year = 2090;
        if (year%4==0) {
            if (year%100==0) {
                return year % 400==0;
            } else {
                return true;
            }
        }
        return false;
    }


    public static void main(String[]args) {
        //
        isLeapYear();
    }
}