/*MINIMUM PIZZAS:
Each pizza consists of 4 slices. There are N friends and each friend needs 
exactly X slices.
Find the minimum number of pizzas they should order to satisfy their appetite.
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two integers N and X, the number of friends and 
the number of slices each friend wants respectively.
Output Format
For each test case, output the minimum number of pizzas required.
Constraints
1≤T≤100,
1≤N,X≤10
*/


import java.util.*;
public class Minimum_Pizzas 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  //* Number of Test Cases
        for(int i=0;i<T;i++)
        {
            int N = sc.nextInt();   //* Students
            int X = sc.nextInt();   //* Exactly X Slices

            int totalSlices = (N * X);

            int minimumPizzas = (totalSlices+3)/4;
            //* Each pizzas has 4 slices.
            //* +3 for rounding up the nearest 4 
            System.out.println(minimumPizzas);
        }
        sc.close();
    }
}


//! Time Complexity = O(T)
//! Space Complexity = O(1)