
// CodeChef-> Decrement or increment

import java.util.*;

public class Decrement_Or_Increment {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 4 == 0) {
			System.out.println(n + 1);
		} else {
			System.out.println(n - 1);
		}
	}
}

// ! Time Complexity = O(1)
// ! Space Complexity = O(1)