/*SALESEASON:
It's the sale season again and Chef bought items worth a total of X rupees. The sale season offer is as follows:if  X≤100, no discount.if 100<X≤1000, discount is 25 rupees if 1000<X≤5000, discount is 100 rupees if X>5000, discount is 500 rupees.Find the final amount Chef needs to pay for his shopping.
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.Each test case consists of single line of input containing an integer X.
Output Format
For each test case, output on a new line the final amount Chef needs to pay for his shopping.
Constraints
1≤T≤100
1≤X≤10000
*/



import java.util.*;
public class Sale_Season 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();    //* Test cases
        for(int i=0;i<T;i++)
        {
            int X = sc.nextInt();   //* Amount that you spent
            int totalAmount;
            if(X <= 100)
            {
                totalAmount = X;
            }
            else if(X <=1000)
            {
                totalAmount = (X-25);
            }
            else if(X <= 5000)
            {
                totalAmount = (X-100);
            }
            else 
            {
                totalAmount = (X-500);
            }
            System.out.println("Total Amount : "+totalAmount);
        }
        sc.close();
    }
}



//! Time Complexity = O(T)
//! Space Complexity = O(1)