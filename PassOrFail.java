
//CodeChef -> Pass Or Fail 

import java.util.*;

public class PassOrFail {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner w = new Scanner(System.in);
        int t = w.nextInt();
        while (t-- > 0) {
            int n = w.nextInt();
            int x = w.nextInt();
            int p = w.nextInt();
            if ((x * 3 + (n - x) * (-1)) >= p)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
        w.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)