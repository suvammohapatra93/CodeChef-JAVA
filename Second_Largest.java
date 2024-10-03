
//CodeChef ->  Second Largest

import java.util.*;

public class Second_Largest {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x > y && x > z) {
                System.out.println(Math.min(x, Math.max(y, z)));
            } else if (y > x && y > z) {
                System.out.println(Math.min(y, Math.max(x, z)));
            } else {
                System.out.println(Math.min(z, Math.max(x, y)));
            }
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)