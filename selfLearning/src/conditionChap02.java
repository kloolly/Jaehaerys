public class conditionChap02 {

    public static String testSwitch(String s) {
        String result = "";
        switch (s) {
            case "One":
                result = "หนึ่ง";
                break;
            case "Two":
                result = "สอง";
                break;
            default:
                result = "อื่นๆ";

        }
        return result;
    }

    public static String stormType(int speed) {
        String stormName;

        if (speed < 63) {
            stormName = "Depression";
        } else if (speed >= 63 && speed < 118) {
            stormName = "Tropical Storm";
        } else {
            stormName = "Typhoon";
        }
        return stormName;
    }

    public static void main(String[] args) {
        System.out.println(stormType(63));
        System.out.println(testSwitch("One"));
        System.out.println(testSwitch("Two"));
        System.out.println(testSwitch("one"));
        System.out.println(testSwitch("Three"));

    }
}