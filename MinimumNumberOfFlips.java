
//CodeChef -> Minimum Number of Flips ->

import java.util.*;

public class MinimumNumberOfFlips {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int t, n;
        Scanner ref = new Scanner(System.in);
        t = ref.nextInt();
        for (int i = 0; i < t; i++) {
            n = ref.nextInt();

            int sum = 0;
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = ref.nextInt();
                sum = sum + arr[j];
            }
            if (sum % 2 == 0) {
                System.out.println(Math.abs(sum / 2));
            } else {
                System.out.println(-1);
            }
        }
        ref.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)