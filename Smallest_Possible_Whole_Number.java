
//CodeChef -> Smallest Possible Whole Number

import java.util.*;

public class Smallest_Possible_Whole_Number {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k == 0)
                System.out.println(n);
            else
                System.out.println(n % k);
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)