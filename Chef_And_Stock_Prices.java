
//Codechef -> chef and stock prices

import java.util.*;

public class Chef_And_Stock_Prices {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            s = s * (c + 100) / 100;

            if (s >= a && s <= b)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}

// ! Time Complexity = O(n)
// ! Space Complexity = O(1)