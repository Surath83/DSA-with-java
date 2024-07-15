import java.util.*;

public class fact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int res = 1;
        if (n == 0 || n == 1) {
            res = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                res *= i;
            }

        }

        System.out.println("Factorial of the number is :" + res);
        sc.close();
    }
}
