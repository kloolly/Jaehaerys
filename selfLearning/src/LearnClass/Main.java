package LearnClass;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        BoxV2 aBox = new BoxV2();
        aBox.setW(10.0);
        aBox.setH(5.0);
        aBox.setD(7.0);

        System.out.println(aBox.volume());
    }
}
