
// CodeChef -> Reach Fast ->

import java.util.*;

public class ReachFast {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = Math.abs(a - b);
            if (d % c == 0) {
                System.out.println(d / c);
            } else if (d % c != 0) {
                System.out.println((d / c) + 1);
            }
        }
        s.close();
    }
}

// ! Time Complexity = O(n)
// ! Space Complexity = O(1)