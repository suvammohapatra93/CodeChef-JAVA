
/*CODECHEF: FINDING SQUARE ROOT -> */

import java.util.Scanner;

public class Finding_Square_Root {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();

            // Compute the integer square root of N
            int sqrt = (int) Math.sqrt(N);

            System.out.println(sqrt);
        }
        sc.close();
    }
}