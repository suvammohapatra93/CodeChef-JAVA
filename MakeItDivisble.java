
//CodeChef -> Make It Divisible

import java.util.*;

public class MakeItDivisble {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            if (X == 1)
                System.out.println(3);
            else {
                for (int i = 1; i < X; i++) {
                    System.out.print(9);
                }
                System.out.print(3);
                System.out.println();
            }
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)