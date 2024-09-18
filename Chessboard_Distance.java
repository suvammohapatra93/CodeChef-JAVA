
// CODECHEF:CHESSBOARD DISTANCE:

import java.util.Scanner;

public class Chessboard_Distance {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        // Reading number of test cases
        int t = sc.nextInt();

        // Process each test case
        while (t-- > 0) {
            // Reading coordinates for two points
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            // Calculate chessboard distance (Chebyshev distance)
            int distance = Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));

            // Output the result
            System.out.println(distance);
        }

        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)