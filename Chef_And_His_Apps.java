
// CODECHEF:CHEF AND HIS APPS:


import java.util.*;
public class Chef_And_His_Apps {
    public static void main(String[] args) throws java.lang.Exception {
        int t, s, x, y, z;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t != 0) {
            s = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if (x + y + z <= s)
                System.out.println("0");
            else if (x + z <= s || y + z <= s)
                System.out.println("1");
            else
                System.out.println("2");
            t--;
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)