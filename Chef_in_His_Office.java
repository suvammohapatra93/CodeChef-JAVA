 /*CODECHEF:CHEF IN HIS OFFICE:
Recently Chef joined a new company. In this company, the employees have to 
work for X hours each day from Monday to Thursday. Also, in this company, 
Friday is called Chill Day — employees only have to work for Y hours (Y<X) 
on Friday. Saturdays and Sundays are holidays.
Determine the total number of working hours in one week.
Input Format
The first line contains a single integer T — the number of test cases. 
Then the test cases follow.
The first and only line of each test case contains two space-separated 
integers X and Y — the number of working hours on each day from Monday to 
Thursday and the number of working hours on Friday respectively.
Output Format
For each test case, output the total number of working hours in one week.
  */




import java.util.*;
public class Chef_in_His_Office 
{
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int X = sc.nextInt(); //Working Time(Monday->Thursday)
            int Y = sc.nextInt(); //Working Time on Friday

            int workingTime = ((4 * X) + Y);
            System.out.println(workingTime);
            sc.close();
        }
    }
}


//! Time Complexity = O(T)
//! Space Complexity = O(1)