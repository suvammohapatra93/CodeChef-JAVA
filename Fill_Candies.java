
//CODECHEF:FILL CANDIES 

import java.util.*;

public class Fill_Candies {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            k = m * k;
            if (n % k == 0) {
                int c = (n / k);
                System.out.println(c);
            } else {
                int c = n / k;
                System.out.println(c + 1);
            }
        }
    }
}