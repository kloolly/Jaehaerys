public class conditionChap01 {

    public static boolean testScore(int interviewScore, int englishScore) {
        boolean isOk;
        if (interviewScore > 70 || englishScore > 50) {

//        if (interviewScore > 70 && englishScore > 50) {
            isOk = true;
        } else {
            isOk = false;
        }
        return isOk;
    }


    public static void main(String[] args) {

        System.out.println(testScore(75, 40));
        System.out.println(testScore(75, 60));

//        int score = 5;
//
//        if (score >= 50) {
//            System.out.println("PASS");
//        } else {
//            System.out.println("FAIL");
//        }
    }
}
