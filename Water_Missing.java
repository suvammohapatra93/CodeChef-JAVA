
// CODECHEF : WATER MISSING :

import java.util.Scanner;

public class Water_Missing {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();// hot water
            int y = sc.nextInt();// cold water
            if (a <= b && (b - a) <= x) {
                System.out.println("yes");

            } else if (a >= b && (a - b) <= y) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)