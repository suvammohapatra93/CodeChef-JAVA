
//CodeChef:- Minimum Number of Coins

import java.util.*;

public class Minimum_Number_Of_Coins {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            System.out.println((a % 5 == 0 || a % 10 == 0) ? a / 10 + (a % 10) / 5 : "-1");
        }
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)