
// CodeChef -> Get Lowest Free ->

import java.util.*;

public class GetLowestFree {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int[] x = new int[3];
            x[0] = a;
            x[1] = b;
            x[2] = c;
            Arrays.sort(x);
            System.out.println(x[1] + x[2]);
        }
        read.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)