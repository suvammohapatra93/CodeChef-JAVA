/*CODECHEF:MARIO AND BULLET: ---------------->

Mario's bullet moves at X pixels per frame. He wishes to shoot a goomba standing Y pixels away from him. The goomba does not move.
Find the minimum time (in seconds) after which Mario should shoot the bullet, such that it hits the goomba after at least Z seconds from now.
Input Format
The first line of input will contain an integer T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three space-separated integers X,Y, and Z.
Output Format
For each test case, output in a single line the minimum time (in seconds) after which Mario should shoot the bullet, such that it hits the goomba after at least Z seconds from now.
Constraints
1≤T≤100  , 1≤X,Y,Z≤100
X divides Y
Sample 1:
Input
3
3 3 5
2 4 1
3 12 8
Output
4
0
4
 */

import java.util.Scanner;

public class Mario_And_Bullet {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if ((Y / X) > Z) {
                System.out.println("0");
            } else {
                System.out.println(Z - (Y / X));
            }
        }
    }
}

//! Time Complexity = O(N)
//! Space Complexity = O(1)
