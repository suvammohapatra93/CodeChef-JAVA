/*THE THREE TOPICS:
The Chef has reached the finals of the Annual Inter-school Declamation 
contest.For the finals, students were asked to prepare 10 topics. However, Chef was only able to prepare three topics, numbered A, B and C — he is totally blank about the other topics. This means Chef can only win the contest if he gets the topics A, B or C to speak about.On the contest day, Chef gets topic X. Determine whether Chef has any chances of winning the competition.Print "Yes" if it is possible for Chef to win the contest, else print "No".You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).
Input Format
The first and only line of input will contain a single line containing four space-separated integers A, B, C, and X — the three topics Chef has prepared and the topic that was given to him on contest day.
Output Format
For each testcase, output in a single line "Yes" or "No".You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as 
identical).
Constraints
1≤A,B,C,X≤10
A,B,C are distinct.
*/



import java.util.*;
public class The_Three_Topics 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();   //Topic A
        int B = sc.nextInt();   //Topic B
        int C = sc.nextInt();   //Topic C
        int X = sc.nextInt();   //Topic X

        if((A == X) || (B == X) || (C == X))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}


//! Time Complexity = O(1)
//! Space Complexity = O(1)