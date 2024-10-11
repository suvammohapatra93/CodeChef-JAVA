
//CodeChef -> Prsents for Cheffina ->

import java.util.*;

public class Presents_For_Cheffina {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int n = read.nextInt();
            if ((n / 5 >= 0)) {
                System.out.println(n - (n / 5));
            } else {
                System.out.println(n);
            }
        }
        read.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)