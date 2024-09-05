/*While Alice was drinking sugarcane juice, she started wondering about the following facts:
The juicer sells each glass of sugarcane juice for 50 coins.He spends 20% of his total income on buying sugarcane.He spends 20% of his total income on buying salt and mint leaves.He spends 30% of his total income on shop rent.Alice wonders, what is the juicer's profit (in coins) when he sells N glasses of sugarcane juice?
Input Format
The first line of input will contain an integer T — the number of test cases.The description of T test cases follows.The first and only line of each test case contains an integer N, as desc   ribed in the problem statement.
Output Format
For each test case, output on a new line the juicer's profit when he sells N glasses of juice.
Constraints
1≤T≤1000
1≤N≤10^6
*/

import java.util.*;
public class Sugarcane_Juice_Business 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();      //* No of Test cases
        for(int i=0;i<T;i++)
        {
            int N = sc.nextInt();   //* No of glasses
            int profit = (N * 15);   //* (20+20+30=70   ;  50*(70/100)=15)
            System.out.println("Profit= "+profit);
        }
        sc.close();
    }
}


//! Time Complexity == O(T)
//! Space Complexity  O(1)