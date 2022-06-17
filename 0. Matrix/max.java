
import java.util.*;
import java.io.*;

// package 0. Matrix;

public class max {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
         while(t -- > 0){ 
            int n = scn.nextInt();

            int [] arr = new int[n];
            for(int i = 0; i<arr.length; i++){
                arr[i] = scn.nextInt();
            }
            int num1 = Integer.MIN_VALUE;
            int num2 = Integer.MIN_VALUE;
            int num3 = Integer.MIN_VALUE;
            
            for(int i= 0; i<arr.length; i++)  {
                if(arr[i] > num1)  {
                    num3 = num2;
                    num2 = num1;
                    num1 = arr[i];
                }
                
                else if(arr[i] > num2) {
                    num3 = num2;
                    num2 = arr[i];
                }
                else if(arr[i] > num3){
                    num3 = arr[i];
                }
               
            }

            System.out.print(num1+ " " + num2 + " " + num3+ " ");
           
        
       }

      }
    
   }



/*abstract
Problem Statement
Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.

Try solving it in O(N) per test case
Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The next line contains N (space separated) elements of A.


Constraints:
1 <= T <= 100
3 <= N <= 10^6
1 <= A[i] <= 10^9

Note:-It is guaranteed that the sum of N over all text cases does not exceed 10^6
Output
For each test case, output the first, second and third maximum elements in the array.
Example
Sample Input:

3
5
1 4 2 4 5
6
1 3 5 7 9 8
7
11 22 33 44 55 66 77


Sample Output:
5 4 4
9 8 7
77 66 55

Explanation(might now be the optimal solution):
Testcase 1:
[1 4 2 4 5]
First max = 5
Second max = 4
Third max = 4


*/


