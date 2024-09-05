/*Water Filling
Chef has three water bottles. At any point, if at least two of them are empty, she will fill them up. But if at most one bottle is empty, she will wait, and not fill them up now.You are given three integers - B1,B2 , and B3 .If B1=1 it means that the first bottle is full.If  B1=0 it means that the first bottle is empty.Similarly, B2 denotes whether the second bottle is full or empty, and B3 denotes it for the third bottle.
Output "Water filling time", if Chef has to fill the bottles now. If not, 
output "Not now".
Input Format
The first line of input will contain a single integer T, denoting the number 
of test cases.
The only line of each test case contains three space-separated integers, 
B 1 ,B 2,B 3
*/


import java.util.*;
public class Water_Filling 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   //No of test Cases
        for(int i=0;i<T;i++)
        {
            int B1 = sc.nextInt();   //* Bottle 1
            int B2 = sc.nextInt();   //* Bottle 2
            int B3 = sc.nextInt();   //* Bottle 3
    
            int emptyCount = 0;
            if(B1 == 0) emptyCount++;
            if(B2 == 0) emptyCount++;
            if(B3 == 0) emptyCount++;
    
            if(emptyCount >= 2)
            {
                System.out.println("Water Filling Time");
            }
            else{
                System.out.println("Not now");
            }
        }
        sc.close();
    }
}


//! Time Complexity = O(T)
//! Space Complexity = O(1)