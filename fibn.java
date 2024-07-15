public class fibn {
    public static int Fibn(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib1 = Fibn(n - 1);
        int fib2 = Fibn(n - 2);
        int fib = fib1 + fib2;
        return fib;
    }

    public static void main(String[] Args) {
        int n = 25;
        System.out.println(Fibn(n));
    }
}
