  /*In Chefland, a tennis game involves 4 referees.
Each referee has to point out whether he considers the ball to be inside 
limits or outside limits. The ball is considered to be IN if and only if all 
the referees agree that it was inside limits.
Given the decision of the 4 referees, help Chef determine whether the ball is 
considered inside limits or not.
Input Format
The first line of input will contain a single integer T, denoting the number 
of test cases.
Each test case consists of a single line of input containing 4 integers 
R1,R2,R3,R4 denoting the decision of the respective referees.
Here R can be either 0 or 1 where 0 would denote that the referee considered 
the ball to be inside limits whereas 
1 denotes that they consider it to be outside limits.
Output Format
For each test case, output IN if the ball is considered to be inside limits 
by all referees and OUT otherwise.
The checker is case-insensitive so answers like in, In, and IN would be 
considered the same.
Constraints:
1≤T≤20
0≤R1,R2,R3,R4≤10≤R1,R 2,R3,R4≤1
   */




import java.util.*;
public class ChefLand_Games 
{
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //No of Test Cases

        for(int i=0;i<T;i++)
        {
            int R1 = sc.nextInt(); //Refree one decision
            int R2 = sc.nextInt(); //Refree Two dicision
            int R3 = sc.nextInt(); //Refree Three decision
            int R4 = sc.nextInt(); //Refree Four decision

            if(R1 == 0 && R2 == 0 && R3 == 0 & R4 == 0)
            {
                System.out.println("In");
            }
            else{
                System.out.println("Out");
            }
        }
        sc.close();
    }
}


//! Time Complexity = O(T)
//! Space Complexity = O(1)