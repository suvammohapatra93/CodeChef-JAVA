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

	// Method to compute factorial of a given number n
	public static BigInteger factorial(int n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read number of test cases
		int t = scanner.nextInt();

		// Array to store results
		BigInteger[] results = new BigInteger[t];

		// Read each number and compute its factorial
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			results[i] = factorial(n);
		}

		// Print each factorial result
		for (BigInteger result : results) {
			System.out.println(result);
		}

		scanner.close();
	}
}

// ! Time Complexity = O(T)
// ! Space Complexity = O(1)