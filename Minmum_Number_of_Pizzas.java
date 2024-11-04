
//CodeChef -> Minimum Number of Pizzas

import java.util.Scanner;

public class Minmum_Number_of_Pizzas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(n / gcd(n, k));
        }
        scanner.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

// ! Time Complexity: O(n)
// ! Space Complexity: O(1)