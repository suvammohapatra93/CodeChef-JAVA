
/* CODECHEF -> THE LAST LEVELS */

import java.util.*;

public class The_Last_Levels {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if (x % 3 != 0) {
                int Br = x / 3;
                System.out.println(x * y + (Br * z));

            } else if (x % 3 == 0) {
                int Br = (x / 3) - 1;
                System.out.println(x * y + (Br * z));

            } else {
                System.out.println(x * y);

            }
        }
    }
}

// ! Time Complexty = O(t)
// ! Space Complexty = O(1)