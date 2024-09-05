
/*CODECHEF:CHEF AND CANDIES:
There are N children and Chef wants to give them 1 candy each. Chef already 
has X candies with him. To buy the rest, he visits a candy shop. In the shop, 
packets containing exactly 4 candies are available.
Determine the minimum number of candy packets Chef must buy so that he is 
able to give 1 candy to each of the N children.
Input Format
The first line of input will contain a single integer T, denoting the number 
of test cases.
The first and only line of each test case contains two integers N and X — the 
number of children and the number of candies Chef already has.
Output Format
For each test case, output the minimum number of candy packets Chef must buy 
so that he is able to give 1 candy to each of the N children.
Constraints:
1≤T≤1000
1≤N,X≤100
*/

import java.util.*;

public class Chef_And_Candies {
  public static void main(String args[]) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      int N = sc.nextInt();
      int X = sc.nextInt();
      int shortFall = (N - X);

      if (shortFall <= 0) {
        System.out.println(0);
      } else {
        int packets = (shortFall + 3) / 4;
        System.out.println(packets);
      }
    }
    sc.close();
  }
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)