
//CodeChef->Building Race ->

import java.util.*;

public class Building_Race {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
            double d = sc.nextInt();
            if (a / c > b / d)
                System.out.println("Chefina");
            else if (a / c < b / d)
                System.out.println("chef");
            else
                System.out.println("both");
        }
        sc.close();
    }
}
