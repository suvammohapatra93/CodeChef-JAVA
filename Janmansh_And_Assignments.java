 /*Janmansh and Assignments
Janmansh has to submit 3 assignments for Chingari before 10 pm and he starts to do the assignments at X pm. Each assignment takes him 1 hour to complete. Can you tell whether he'll be able to complete all assignments on time or not?
Input Format
The first line will contain T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains one integer X - the time when Janmansh starts doing the assignments.
Output Format
For each test case, output Yes if he can complete the assignments on time. Otherwise, output No
You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).
Constraints
1<=T<=10
1≤X≤9
  */


import java.util.*;
public class Janmansh_And_Assignments 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   //* No of Test Cases
        for(int i=0;i<T;i++)
        {
            int X = sc.nextInt(); //* Starting Time

            if(X <= 7)  //* He has to submit 3 assignments (10-3=7)
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