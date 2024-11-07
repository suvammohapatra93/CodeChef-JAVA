
// CodeChef -> Alternating work days

import java.util.*;
import java.io.*;

public class AlterNating_Work_Days {
    public static void main(String[] args) throws java.lang.Exception {
        FastReader sc = new FastReader();

        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();

            // a divides p and b divides q and |p/a - q/b| is less than 2
            boolean condition = p % a == 0 && q % b == 0 && Math.abs(p / a - q / b) <= 1;

            System.out.println(condition ? "Yes" : "No");
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static long gcd(long num1, long num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    public static long lcm(long num1, long num2) {
        long gcd = gcd(num1, num2);
        return (num1 * num2) / gcd;
    }
}

// ! Time Complexity = O(N)
// ! Space Complexity = O(1)