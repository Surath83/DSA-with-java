public class RecIncr {
    public static void Dec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        Dec(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] Args) {
        Dec(10);
    }
}
