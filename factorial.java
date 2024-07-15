public class factorial {
    public static int Fact(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = Fact(n - 1);
        int value = n * factorial;
        return value;
    }

    public static void main(String[] Args) {
        int n = 5;
        System.out.println(Fact(n));
    }
}
