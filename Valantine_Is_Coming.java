
// CODECHEF:VALENTINE IS COMING:

import java.util.Scanner;

public class Valantine_Is_Coming {
    public static void main(String[] args) throws java.lang.Exception {
        // Input handling via Scanner
        Scanner sc = new Scanner(System.in);

        // Read number of test cases
        int t = sc.nextInt();

        while (t-- > 0) {
            // For each test case, read the values of X and Y
            int X = sc.nextInt(); // Chef's total rupees
            int Y = sc.nextInt(); // Cost of one chocolate

            // Calculate the maximum number of chocolates Chef can buy
            int chocolates = X / Y;

            System.out.println(chocolates);
        }

        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)