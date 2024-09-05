/*Bath in Winters
A geyser has a capacity of X litres of water and a bucket has a capacity of Y litres of water.One person requires exactly 2 buckets of water to take a bath. Find the maximum number of people that can take bath using water from one completely filled geyser..
Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains a single line of input, two integers X,Y.
Output Format
For each test case, output the maximum number of people that can take bath.
Constraints
1≤T≤1000,1≤X,Y≤100
Sample 1:
Input
4
10 6
25 1
100 10
30 40
Output
0
12
5
0 
*/



import java.util.*;

public class Bath_In_Winters{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Loop over each test case
        while (T-- > 0) {
            // Read X and Y
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            // Calculate the number of buckets required
            int buckets = (X + Y - 1) / Y;  // This is equivalent to (X / Y) + 1 when X % Y != 0
            
            // Print the result
            System.out.println(buckets);
        }
        sc.close();
	}
}

//! Time Complexity = O(T)
//! Space Complexity = O(1)
