
/*CODECHEF:CHEF AND WATER BOTTLES:
 * 
 * Chef has N empty bottles where each bottle has a capacity of X litres.
There is a water tank in Chefland having K litres of water. Chef wants to fill the empty bottles using the water in the tank.
Assuming that Chef does not spill any water while filling the bottles, find out the maximum number of bottles Chef can fill completely.
Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers N,X, and K.
Output Format
For each test case, output in a single line answer, the maximum number of bottles Chef can fill completely.
Constraints
1≤T≤100
1≤N,X≤10 
0≤K≤10 
5
Sample 1:
Input
3
5 2 8
10 5 4
3 1 4
Output
4
0
3
 */

import java.util.Scanner;

public class Chef_And_Water_Bottles {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            // Read N, X, and K
            int N = sc.nextInt(); // Number of bottles
            int X = sc.nextInt(); // Cost of each bottle
            int K = sc.nextInt(); // Total money Chef has

            // Calculate the maximum number of bottles Chef can buy
            int maxBottles = Math.min(N, K / X);

            System.out.println(maxBottles);
        }
        sc.close();
    }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)