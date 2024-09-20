
// CODECHEF- IT IS MY SERVE -

import java.util.*;
public class It_Is_My_Serve {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int x = read.nextInt();
            int y = read.nextInt();
            if ((x + y + 1) < 2) {
                System.out.println("Alice");
            } else {
                if ((((x + y + 1) % 4) == 1) || (((x + y + 1) % 4) == 2)) {
                    System.out.println("Alice");
                } else {
                    System.out.println("Bob");
                }
            }
        }
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)