/*Monopoly(Monopoly is a market structure where a single company dominates the entire industry for a particular product or service. This company has no competition, allowing it to set prices and control supply.)
---------------------------------------------------------------------------There are 4 companies in the markets of Chefland, A, B, C, and D.
This year,Company A made a profit of P lakh rupees, Company B made a profit of Q lakh rupees,Company C made a profit of R lakh rupees Company D made a profit of S lakh rupees.
There is said to be a monopoly in the market if the profit made by one 
company is strictly greater than the sum of profits made by all other 
companies.
Determine if there is a monopoly in the market or not.
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
The first line and only line of each test case contains four space-separated integers 
P,Q,R and S — the profits made by companies A, B, C and D respectively.
Output Format
For each test case, output YES if there is a monopoly in the market. 
Otherwise, output NO.
You may print each character of YES and NO in uppercase or lowercase (for 
example, yes, yEs, Yes will be considered identical).
Constraints
1≤T≤5000
1≤P,Q,R,S≤100
*/

import java.util.*;
public class Monopoly 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // * Number of test cases
        while(T --> 0)
        {
            int P = sc.nextInt(); // * Profit of A company
            int Q = sc.nextInt(); // * Profit of B company
            int R = sc.nextInt(); // * Profit of C company
            int S = sc.nextInt(); // * Profit of D company

            if (P > (Q + R + S) || Q > (P + R + S) || R > (P + Q + S) || S > (P + Q + R)) 
            {
                // Monopoly
                System.out.println("Yes");
            } 
            else 
            {
                // No monopoly
                System.err.println("No");
            }
        }
        sc.close();
    }
}



//! Time Complexity = O(T)
//! Space Complexity = O(1)