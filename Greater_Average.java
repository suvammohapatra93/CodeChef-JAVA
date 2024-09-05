/*Problem on codechef :Greater Average
You are given 3 numbers A,B AND C.Determine whether the average of
A and B is strictly greater than C or not?
INPUT                     OUTPUT
5                          YES
5,9,6                      YES
5,8,6                       NO
4,9,8                       NO
3,7,2                      YES 
INPUT FORMAT:
.The first line of input contains a single integer T,denoting the number 
of test cases .
.Each test case consists of 3 integers A,B,C
 */

import java.util.*;
public class Greater_Average 
{
    public static void main(String[] args) 
    {
        Scanner sc = new  Scanner(System.in);
        int T =sc.nextInt();   //* No of test cases
        for(int i=0;i<T;i++)
        {
            int A = sc.nextInt();  //* First Number
            int B = sc.nextInt();   //* Second Number
            int C = sc.nextInt();   //* Second Number

            System.out.println((0.5)*(A+B)>C ? "Yes": "No"); 
            //* Directly check by Switch case
        }
        sc.close();
    }
}


//! Time Complexity = O(T)
//! Space Complexity = O(1)