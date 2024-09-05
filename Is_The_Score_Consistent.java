 /*CODECHEF:IS THE SCORE CONSISTENT:
Chef is watching a football match. The current score is A:B, that is, team 1 
has scored A goals and team 2 has scored B goals. Chef wonders if it is 
possible for the score to become C:D at a later point in the game (i.e. 
team 1 has scored C goals and team 2 has scored D goals). Can you help 
Chef by answering his question?
Input Format
The first line contains a single integer T - the number of test cases. Then 
the test cases follow.
The first line of each test case contains two integers A and B - the intial 
number of goals team 1 and team 2 have scored respectively.
The second line of each test case contains two integers C and D - the final 
number of goals team 1 and team 2 must be able to score respectively.
Output Format
For each testcase, output POSSIBLE if it is possible for the score to become 
C:D at a later point in the game, IMPOSSIBLE otherwise.
You may print each character of POSSIBLE and IMPOSSIBLE in uppercase or 
lowercase (for example, possible, pOSsiBLe, Possible will be considered 
identical).
Constraints
1≤T≤1000
0≤A,B,C,D≤10
  */


import java.util.*;
public class Is_The_Score_Consistent 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   //* No of Test cases
        for(int i=0;i<T;i++)
        {
            int A = sc.nextInt();   //* Initial score of Team 1
            int B = sc.nextInt();   //* Intial Score of Team 2
            int C = sc.nextInt();   //* final Score of Team 1
            int D = sc.nextInt();   //* final Score of Team 2

            if((C > A) && (D > B))
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
