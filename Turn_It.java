
//CodeChef -> Turn it

import java.util.*;

public class Turn_It {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0) {
            int U = sc.nextInt();
            int V = sc.nextInt();
            int A = sc.nextInt();
            int S = sc.nextInt();

            if (Math.pow(V, 2) >= Math.pow(U, 2) - 2 * A * S) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)