public class p1 {
    public static void position(int Arr[], int S, int n, int m, int res) {
        // base
        if (res == S) {
            printarr(n, m);
            return;
        }
        // choise+
        if (res < S) {
            res = 0;
            for (int i = n; i <= m; i++) {
                res = res + Arr[i];
            }
            position(Arr, S, n, m + 1, res);
        } else {
            res = 0;
            for (int j = n; j <= m; j++) {
                res = res + Arr[j];
            }
            position(Arr, S, n + 1, m, res);
        }
        return;
    }

    public static void printarr(int n, int m) {
        int x = n + 1;
        int y = m;
        System.out.print(x + ",");
        System.out.print(y + "");
        return;
    }

    public static void main(String args[]) {
        // int N = 5;
        int res = 0;
        int S = 17;
        int A[] = { 1, 2, 3, 7, 5 };
        position(A, S, 0, 1, res);
    }
}
