
//CodeChef -> Dracula Eats ->

import java.util.*;

public class Dracula_Eats {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            N = N - 1;
            System.out.println((int) Math.ceil((float) N / 7));
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)