
//CodeChef -> Chef and Races

import java.util.*;

public class Chef_And_Races {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int count = 2;
            if (a == c || a == d) {
                count--;
            }
            if (b == c || b == d) {
                count--;
            }
            System.out.println(count);
        }
        sc.close();
    }
}

// ! Time Complexity = O(n)
// ! Space Complexity = O(1)