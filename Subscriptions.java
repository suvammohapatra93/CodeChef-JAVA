/*Subscriptions
A new TV streaming service was recently started in Chefland called the Chef-TV.
A group of N friends in Chefland want to buy Chef-TV subscriptions. We know that 6 people can share one Chef-TV subscription. Also, the cost of one Chef-TV subscription is X rupees. Determine the minimum total cost that the group of N friends will incur so that everyone in the group is able to use Chef-TV
Input Format
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers N and X — the size of the group of friends and the cost of one subscription.
Output Format
For each test case, output the minimum total cost that the group will incur so that everyone in the group is able to use Chef-TV.
Constraints
1≤T≤1000
1<=N<=100
1≤X≤1000
Input
3
1 100
12 250
16 135
Output
100
500
405
*/


import java.util.*;
public class Subscriptions 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();    //* No of Test Cases
        for(int i=0;i<T;i++)
        {
            int N = sc.nextInt();   //* No of students
            int X = sc.nextInt();   //* Rupees of students

            int numSubscriptions = (N+5)/6;  //* subscription needed
            int minCost = (numSubscriptions * X);
            System.out.println("Minimum cost = "+minCost);
        }
        sc.close();
    }
}



//! Time Complexity = O(T)
//! Space Complexity = O(1)