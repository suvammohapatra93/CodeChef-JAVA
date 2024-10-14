
//CodeChef -> Single Use Attack

import java.util.*;

public class SingleUseAttack {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            h -= y;
            int ans = 1;
            ans += Math.ceil((double) h / x);
            System.out.println(ans);
        }
        sc.close();
    }
}

// ! Time Complexity = O(n)
// ! Space Complexity = O(1)