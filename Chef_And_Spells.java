
//CodeChef -> Chef And Spells 

import java.util.*;

public class Chef_And_Spells {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            Arrays.sort(a);
            System.out.println(a[2] + a[1]);
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)