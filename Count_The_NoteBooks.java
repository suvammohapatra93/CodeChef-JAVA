  /*CodeChef:Count the Notebooks:
You know that 1 kg of pulp can be used to make 1000 pages and 1 notebook 
consists of 100 pages.
Suppose a notebook factory receives N kg of pulp, how many notebooks can be 
made from that?
Input Format
First line will contain T, the number of test cases. Then the test cases 
follow.
Each test case contains a single integer N - the weight of the pulp the 
factory has (in kgs).
Output Format
For each test case, output the number of notebooks that can be made using 
N kgs of pulp.
Constraints
1≤T≤100
1≤N≤100
   */



import java.util.*;
public class Count_The_NoteBooks 
{
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //No of Test Cases

        while(T --> 0)
        {
            int N = sc.nextInt();  //Weight of pulps in kgs
            int noteBooks = (N * 10);  //Each kg makes 10 notebooks
            
            System.out.println(noteBooks);
        }
        sc.close();
    }
}


//! Time Complexity = O(T)
//! Space Complexity = O(1)