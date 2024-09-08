/*CODECHEF: MARIO AND TRANSFORMATION: ----------->

Mario transforms each time he eats a mushroom as follows:
If he is currently small, he turns normal.
If he is currently normal, he turns huge.
If he is currently huge, he turns small.
Given that Mario was initially normal, find his size after eating X mushrooms.
Input Format
The first line of input will contain one integer T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, containing one integer X.
Output Format
For each test case, output in a single line Mario's size after eating X mushrooms.
Constraints
1≤T≤100
1≤X≤100
Sample 1:
Input
3
2
4
12
Output
SMALL
HUGE
NORMAL
 */

import java.util.*;

public class Mario_And_Transformations {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int x = sc.nextInt();
            if (x % 3 == 1) {
                System.out.println("huge");
            } else if (x % 3 == 2) {
                System.out.println("small");
            } else {
                System.out.println("normal");
            }
            t--;
        }
        sc.close();
    }
}

//! Time Complexity = O(T)
//! Space Complexity = O(1)