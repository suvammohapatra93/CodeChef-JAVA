
/*CODECHEF:CANDY DISTRIBUTION: */

import java.util.*;

public class Candy_Distribution {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int n = read.nextInt();
            int m = read.nextInt();
            if (n % m == 0 && (n / m) % 2 == 0) {
                System.out.println("YES");

            } else {
                System.out.println("No");

            }
        }
    }
}
