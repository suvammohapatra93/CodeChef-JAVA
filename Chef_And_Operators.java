
//CodeChef -> Chef_And_Operators -> 

import java.util.*;

public class Chef_And_Operators {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                System.out.println("<");
            }
            if (a > b) {
                System.out.println(">");
            }
            if (a == b) {
                System.out.println("=");
            }
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)
