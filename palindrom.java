import java.util.*;

public class palindrom {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. :");
        int n = sc.nextInt();
        int b = palinNum(n);
        int temp = n;
        if (temp == b) {
            System.out.println("The no. " + b + " is palindrom");
        } else {
            System.out.println("The no. " + b + " is non-palindrom");
        }
        sc.close();
    }

    public static int palinNum(int a) {
        int s = 0, r;

        while (a != 0) {
            r = a % 10;
            a = a / 10;
            s = (s * 10) + r;
        }
        return s;

    }
}
