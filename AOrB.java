
//CodeChef -> A or B

import java.util.*;

public class AOrB {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = 500 - (a * 2);
            int d = 1000 - (a + b) * 4;
            int e = 1000 - (b * 4);
            int f = 500 - (a + b) * 2;
            System.out.println((c + d) > (e + f) ? c + d : e + f);
        }
        s.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)