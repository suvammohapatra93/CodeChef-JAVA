// CODECHEF:X JUMPS:

import java.util.Scanner;

public class X_Jumps {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y + x % y);
            // For Input-> 1 , 2 , 3
            // Output will be -> 2
        }
    }
}