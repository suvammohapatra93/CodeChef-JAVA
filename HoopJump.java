
//CodeChef -> Hoop Jump

import java.util.*;

public class HoopJump {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(n / 2 + 1);
        }
        sc.close();
    }
}

// ! Time Complexity = O(N)
// ! Space Complexity = O(1)