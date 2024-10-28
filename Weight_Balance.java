
//CodeChef -> Weight Balanace

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Weight_Balance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder result = new StringBuilder();
        while (t-- > 0) {
            String[] inputs = br.readLine().trim().split(" ");
            int w1 = Integer.parseInt(inputs[0]);
            int w2 = Integer.parseInt(inputs[1]);
            int x1 = Integer.parseInt(inputs[2]);
            int x2 = Integer.parseInt(inputs[3]);
            int m = Integer.parseInt(inputs[4]);

            int weightDiff = w2 - w1;
            if (weightDiff >= x1 * m && weightDiff <= x2 * m) {
                result.append(1).append("\n");
            } else {
                result.append(0).append("\n");
            }
        }
        System.out.print(result);
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)