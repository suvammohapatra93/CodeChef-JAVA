
//CodeChef -> Indiperm

import java.util.*;

public class Indiperm {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            for (int i = 2; i <= n; i++)
                System.out.print(i + " ");
            System.out.println("1");
        }
        input.close();
    }
}

// ! Time Complexity = O(n)
// ! Space Complexity = O(1)