/*Small factorials
You are asked to calculate factorials of some small positive integers.
Input
An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1 <= n <= 100
Output
For each integer n given at input, display a line with the value of n!Note: For larger numbers, their factorial can overflows any available numeric data type in C.
Sample 1:
Input
4
1
2
5
3
Output
1
2
120
6
*/




import java.util.*;
import java.math.BigInteger;
public class Small_Factorials
{
public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // Read the number of test cases
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // Read the number for which factorial is to be calculated
			
			// Use BigInteger to handle large factorials
			BigInteger factorial = BigInteger.ONE;
			
			// Calculate factorial iteratively
			for (int j = 2; j <= N; j++) {
				factorial = factorial.multiply(BigInteger.valueOf(j));
			}
			
			// Print the factorial
			System.out.println(factorial);
		}
		sc.close();
	}
}

//! Time Complexity = O(T)
//! Space Complexity = O(1)