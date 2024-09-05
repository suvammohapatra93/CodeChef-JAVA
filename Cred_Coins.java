/*For each bill you pay using CRED, you earn X CRED coins.
At CodeChef store, each bag is worth 100 CRED coins.
Chef pays Y number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.
Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers X and Y.
Output Format
For each test case, output in a single line - the maximum number of bags Chef can get from the CodeChef store.
Constraints
1≤T≤100
1≤X,Y≤1000
Subtasks
Subtask 1 (100 points): Original constraints
 * 
 */


import java.util.*;
public class Cred_Coins 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Test cases: ");
        int T = sc.nextInt();  //* Number of Test cases

        for(int i=0;i<T;i++)
        {
            System.out.println("Enter value of X: ");
            int X = sc.nextInt();
            System.out.println("Enter value of Y: ");
            int Y = sc.nextInt();

            int totalCredCoins = (X * Y); //* Total cred coins
            int totalBags = (totalCredCoins / 100);

            System.out.println("Total bags are: "+totalBags);
        }
        sc.close();
    }
}


//! Time Complexity = O(T)
//! Space Complexity = O(1)