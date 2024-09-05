  /*In Chefland, there are X schools, and each school has Y students.
The year end results are in and a total of Z students passed the exams.
Assuming that all students appeared for the exams, find whether the number
of students who passed in Chefland was strictly greater than 50%.
Input Format
The first line of input will contain a single integer T, denoting the number
of test cases.
Each test case consists of three space-separated integers X,Y, and Z as 
mentioned in the statement.
Output Format
For each test case, output on a new line, YES, if the total number of students
who passed in Chefland was strictly greater than 50%, otherwise print NO.
You may print each character of the string in uppercase or lowercase (for 
example, the strings YES, yEs, yes, and yeS will all be treated as identical).
   */

import java.util.*;
public class Exams 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();    //* No of Test Cases
        for(int i=0;i<T;i++)
        {
            int X = sc.nextInt();  //* No of Schools
            int Y = sc.nextInt();   //* No of Students
            int Z = sc.nextInt();   //* No of students passed

            int totalStudents = (X * Y);  //* No of total students          
                                          //* across all schools
            
            if(Z > (totalStudents/2))
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
