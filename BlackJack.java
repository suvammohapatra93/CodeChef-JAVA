
//CODECHEF -> BLACKJACK

import java.util.*;

public class BlackJack {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            int d = 0;
            for (int i = 1; i <= 10; i++) {
                d = a + b + i;
                if (d == 21) {
                    System.out.println(i);
                    break;
                }
            }
            if (d != 21) {
                System.out.println(-1);
            }

        }
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)
