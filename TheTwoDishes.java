
//CodeChef -> The Two Dishesh 

import java.util.*;

public class TheTwoDishes {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int S = sc.nextInt();

            if (S <= N)
                System.out.println(S);

            else if (S > N)
                System.out.println(N - (S - N));
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)