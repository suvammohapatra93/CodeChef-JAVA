
// CodeChef -> Speed Limit Test Java

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0)
	    {
	        double a = sc.nextInt();
	        double x = sc.nextInt();
	        double b = sc.nextInt();
	        double y = sc.nextInt();
	        if((a/x)>(b/y))
	        {
	            System.out.println("Alice");
	        }
	        else if((a/x)==(b/y))
	        {
	            System.out.println("Equal");
	        }
	        else{
	            System.out.println("Bob");
	        }
	    }
	}
}


//! Time Complexity = O(T)
//! Space Complexity = O()