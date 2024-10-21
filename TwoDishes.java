
//CodeChef -> Two Dishes

import java.util.*;

public class TwoDishes {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(); // guests

            int a = sc.nextInt(); // fruits
            int b = sc.nextInt(); // veg
            int c = sc.nextInt(); // fish

            int count = 0;
            while (b-- > 0) {
                if (a > 0) {
                    count++;
                    a--;
                } else if (c > 0) {
                    count++;
                    c--;
                }
            }
            if (count >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}