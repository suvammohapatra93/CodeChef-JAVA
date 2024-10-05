
//CodeChef : cyclic quadrilateral ->

import java.util.*;

public class CyclicQuadralateral {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int t, a, b, c, d;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        for (int i = 0; i < t; i++) {
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            d = s.nextInt();
            if (a + c == 180 && b + d == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        s.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)