
//CodeChef -> Small Factorial ->

import java.util.*;
import java.math.BigInteger; // Missing import for BigInteger

public class Small_Factorial {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger fact = new BigInteger("1");
            for (int i = 2; i <= n; i++)
                fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println(fact);
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)