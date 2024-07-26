import java.util.*;

public class sumofDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. :");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int a = n % 10;
            n = n / 10;
            sum = sum + a;
        }
        System.out.println("The sum of all the digits in " + n + "is : " + sum);

        sc.close();
    }

}
