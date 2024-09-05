/*Problems in your to-do list
CodeChef recently revamped its practice page to make it easier for users to identify the next problems they should solve by introducing some new features:
Recent Contest Problems - contains only problems from the last 2 contests
Separate Un-Attempted, Attempted, and All tabs
Problem Difficulty Rating - the Recommended dropdown menu has various 
difficulty ranges so that you can attempt the problems most suited to your 
experiencePopular Topics and TagsLike most users, Chef didn’t know that he could add problems to a personal to-do list by clicking on the magic '+' symbol on the top-right of each problem page. But once he found out about it, he went crazy and added loads of problems to his to-do list without looking at their difficulty rating Chef is a beginner and should ideally try and solve only problems with difficulty rating strictly less than 1000. Given a list of difficulty ratings for problems in the Chef’s to-do list, please help him identify how many of those problems Chef should remove from his to-do list, so that he is only left with problems of difficulty rating less than 1000.
Input Format
The first line of input will contain a single integer T, the number of test cases. Then the testcases follow.Each testcase consists of 2 lines of input.
The first line of input of each test case contains a single integer, N, which is the total number of problems that the Chef has added to his to-do list.
The second line of input of each test case contains N space-separated integersD1,D2,…,DN, which are the difficulty ratings for each problem in theto-do list.
Output Format
For each test case, output in a single line the number of problems that Chef will have to remove so that all remaining problems have a difficulty rating strictly less than 1000.
Constraints
1≤T≤1000
1≤N≤1000
1≤D i≤5000
*/

import java.util.*;

public class Problems_In_Your_Todo_List {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   //* No of test cases
        for(int i = 0; i < T; i++)
        {
            int N = sc.nextInt();  //* Total number of Questions
            int count = 0;   //* For counting no of difficulty questions

            for(int j = 0; j < N; j++)
            {
                int difficulty = sc.nextInt();
                if(difficulty >= 1000)
                {
                    count++;
                }
            }
            System.out.println(count); // Print only the count without any additional text
        }
        sc.close();
    }
}


// * INPUT:2 5 900 1200 800 1500 700 3 1000 950 1100

// ! Time Complexity = O(T * N)
// ! Space Complexity = O(1)