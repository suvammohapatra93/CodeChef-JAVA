 /*Expert Setter:
 A problem setter is called an expert if at least 50% of their problems 
are approved by Chef.
Munchy submitted X problems for approval. If Y problems out of those were 
approved, find whether Munchy is an expert or not.
Input Format
The first line of input will contain a single integer T, denoting the number 
of test cases.
Each test case consists of a two space-separated integers 
X and Y - the number of problems submitted and the number of problems that 
were approved by Chef.
Output Format
For each test case, output on a new line YES, if Munchy is an expert. 
Otherwise, print NO.
The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes 
are all considered the same.
Constraints:
1≤T≤1000
1≤Y≤X≤10^6
  */



import java.util.*;
public class Expert_Setter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  //* No of Test Cases
        for(int i=0;i<T;i++)
        {
            int X = sc.nextInt(); //* No of Problems submitted
            int Y = sc.nextInt();  //* No of Problems approved

            if(Y > ((X+1)/2))
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}



//! Time Complexity = O(T)
//! Space Complexity = O(1)