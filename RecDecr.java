public class RecDecr {
    public static void Dec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        Dec(n - 1);
    }

    public static void main(String[] Args) {
        Dec(10);
    }
}
