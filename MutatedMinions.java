
//CodeChef -> Mutated Minions

import java.util.*;

public class MutatedMinions {
    public static void main(String[] args) throws java.lang.Exception {
        int t, n, r;
        Scanner ref = new Scanner(System.in);
        t = ref.nextInt();
        for (int i = 0; i < t; i++) {
            n = ref.nextInt();
            r = ref.nextInt();
            int count = 0;
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = ref.nextInt();
            }
            for (int k = 0; k < n; k++) {
                if ((arr[k] + r) % 7 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
        ref.close();
    }
}

// ! Time Complexity = O(n)
// ! Space Complexity = O(1)