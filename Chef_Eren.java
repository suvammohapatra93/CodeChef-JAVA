
//CODECHEF:CHEF EREN:

import java.util.Scanner;

public class Chef_Eren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int even = 0;
            int odd = 0;
            if (N > 1) {
                if (N % 2 == 0) {
                    System.out.println(((N / 2) * A) + ((N / 2) * B));
                } else {
                    System.out.println((((N / 2) + 1) * B) + ((N / 2) * A));
                }

            } else {
                System.out.println(B);
            }
        }
        sc.close();
    }
}