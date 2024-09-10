
/*CODECHEF:COMPLEMENTARY STAND IN A DNA: 
 * 
 * You are given the sequence of Nucleotides of one strand of DNA through a string S of length N. S contains the character A,T,C, and G only.
Chef knows that:A is complementary to T.T is complementary to A.C is complementary to G is complementary to C.
Using the string S, determine the sequence of the complementary strand of the DNA.
Input Format
First line will contain T, number of test cases. Then the test cases follow.
First line of each test case contains an integer N - denoting the length of string S.
Second line contains N characters denoting the string S.
Output Format
For each test case, output the string containing N characters - sequence of nucleotides of the complementary strand.

Constraints
1≤T≤100
1≤N≤100 S contains A, T, C, and G only
Sample 1:
Input
4
4
ATCG
4
GTCC
5
AAAAA
3
TAC
Output
TAGC
CAGG
TTTTT
ATG
*/

import java.util.*;

public class Complementary_Strand_In_DNA { // Changed 'Stand' to 'Strand'
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        for (int i = 0; i < T; i++) {
            String s = sc.next(); // directly take the DNA sequence string
            char[] c = s.toCharArray(); // convert the string to a char array
            for (int j = 0; j < c.length; j++) {
                // Replace each nucleotide with its complement
                if (c[j] == 'A')
                    c[j] = 'T';
                else if (c[j] == 'T')
                    c[j] = 'A';
                else if (c[j] == 'C')
                    c[j] = 'G';
                else if (c[j] == 'G')
                    c[j] = 'C';
            }
            String res = new String(c);
            System.out.println(res);
        }
        sc.close();
    }
}
