
//CodeChef -> Tom and Jerry 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TomAndJerry1{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine()); // Number of test cases

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]); // Starting x coordinate
            int b = Integer.parseInt(input[1]); // Starting y coordinate
            int c = Integer.parseInt(input[2]); // Destination x coordinate
            int d = Integer.parseInt(input[3]); // Destination y coordinate
            int k = Integer.parseInt(input[4]); // Maximum distance allowed
            
            // Calculate the total distance needed to reach the destination
            int p = Math.abs(c - a) + Math.abs(d - b);
            
            // Check if the required distance is within the allowed distance
            if (p <= k) {
                // Check if the leftover distance is even
                if ((k - p) % 2 == 0) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb); // Print all results at once
    }
}