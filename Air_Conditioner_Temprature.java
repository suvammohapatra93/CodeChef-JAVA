  /*AIR CONDITIONER TEMPRATURE:
There are three people sitting in a room - Alice, Bob, and Charlie. They need 
to decide on the temperature to set on the air conditioner. Everyone has a 
demand each:
Alice wants the temperature to be at least A degrees.
Bob wants the temperature to be at most B degrees.
Charlie wants the temperature to be at least C degrees.Can they all agree on some temperature, or not?
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single line which contains three integers - 
A,B,C.
Output Format
For each test case, output on a new line, "Yes" or "No". "Yes", if they can decide on some temperature which fits all their demands. Or "No", if no temperature fits all their demands.
You may print each character of the string in either uppercase or lowercase (for example, the strings NO, nO, No, and no will all be treated as identical).
Constraints
1≤T≤100
1≤A,B,C≤100 Subtask 1 (10 points): 1≤M≤10 Subtask 2 (20 points): The sum of N 
across all test cases won't exceed 20.
Subtask 3 (70 points): No further constraints.
   */


import java.util.*;
public class Air_Conditioner_Temprature 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   //* No of Test Cases
        for(int i=0;i<T;i++)
        {
            int A = sc.nextInt();  //* Alice
            int B = sc.nextInt();   //* Bob
            int C = sc.nextInt();   //* Charlie

            if(Math.max(A,C) <= B)
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