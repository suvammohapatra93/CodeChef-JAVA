
/*CODECHEF:CHESS RATINGS-> */

import java.util.*;

public class Chess_Ratings {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();

        // Iterate through each test case
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int difference = y - x;

            // If x is already >= y, no games needed
            if (difference <= 0) {
                System.out.println(0);
            } else {
                
                int games = (difference + 7) / 8; // Adding 7 ensures correct rounding up for integer division
                System.out.println(games);
            }
        }
        sc.close();
    }
}
