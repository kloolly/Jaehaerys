public class fibfib {
    public static void main(String[] args) {
        for (int i = 0; i < i+1; i++) {
            System.out.println(i + ": " + fib(i));
        }
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}