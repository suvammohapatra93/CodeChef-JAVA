
//CodeChef -> Distinct Pair Sum

import java.io.*;

public class Distinct_Pair_Sum {

    public static void main(String[] args) throws java.lang.Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int t = Integer.parseInt(br.readLine());
        while (t != 0) {
            String input = br.readLine();
            String i[] = input.split(" ");
            int l = Integer.parseInt(i[0]),
                    r = Integer.parseInt(i[1]);
            int ans = r * 2 - l * 2 + 1;
            // All the numbers in the range [l+l, r+r] are reachable
            // On adding the adjacent numbers we get the odd members
            // And on adding the same (non-distinct) no.s we get even part
            System.out.println(ans);
            t--;
        }
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)