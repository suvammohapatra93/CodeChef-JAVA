
//CodeChef -> Richie Rich ->

import java.util.*;

public class RichieRich {
    public static void main(String[] args) throws java.lang.Exception {
        int sub, a, b, c, div;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            sub = b - a;
            div = sub / c;

            System.out.println(div);
        }
        sc.close();
    }
}