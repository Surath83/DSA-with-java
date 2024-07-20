//Write a Java program that takes a year from the user and print whether that year is a leap year or not.

/*import java.util.*;

public class leapyr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yr:");
        int yr = sc.nextInt();
        if (yr % 4 == 0) {
            if (yr % 100 == 0) {
                if (yr % 400 == 0) {
                    System.out.println(yr + " is a Leap year");

                } else {
                    System.out.println(yr + " is not a Leap year");
                }
            } else {
                System.out.println(yr + " is a Leap year");
            }
        } else {
            System.out.println(yr + " is not a Leap year");
        }
        sc.close();
    }

}
*/

import java.util.*;

public class leapyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int yr = sc.nextInt();
        boolean x = (yr % 4) == 0;
        boolean y = (yr % 100) != 0;
        boolean z = ((yr % 100 == 0) && (yr % 400 == 0));
        if (x && (y || z)) {
            System.out.println(yr + " is a leap year");
        } else {
            System.out.println(yr + " is not a leapyear");
        }
        sc.close();
    }
}