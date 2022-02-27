/*
Matrix Multiplication
Easy

1. You are given a number n1, representing the number of rows of 1st matrix.
2. You are given a number m1, representing the number of columns of 1st matrix.
3. You are given n1*m1 numbers, representing elements of 2d array a1.
4. You are given a number n2, representing the number of rows of 2nd matrix.
5. You are given a number m2, representing the number of columns of 2nd matrix.
6. You are given n2*m2 numbers, representing elements of 2d array a2.
7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
8. If the two arrays can't be multiplied, print "Invalid input".

Constraints
1 <= n1 <= 10^2
1 <= m1 <= 10^2
-10^9 <= e11, e12, .. n1 * m1 elements <= 10^9
1 <= n2 <= 10^2
1 <= m2 <= 10^2
-10^9 <= e11', e12', .. n2 * m2 elements <= 10^9

Format
Input
A number n1
A number m1
e11
e12..
e21
e22..
.. n1 * m1 number of elements of array a1
A number n2
A number m2
e11'
e12'..
e21'
e22'..
.. n2 * m2 number of elements of array a2

Output
e11'' e12'' e13'' ..
e21'' e22'' e23'' ..
.. elements of prd array

Example
Sample Input

2  // Size Of Input 
3  // Size Of Input 
10
0
0
0
20
0
3  // Size Of Input 
4  // Size Of Input 
1
0
1
0
0
1
1
2
1
1
0
0

Sample Output
10 0 10 0
0 20 20 40
*/

import java.io.*;
import java.util.*;

public class MatrixMultiplication{

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int[][] arr1 = new int[n1][m1];
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[0].length; j++) {
        arr1[i][j] = scn.nextInt();
      }
    }

    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][] arr2 = new int[n2][m2];
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[0].length; j++) {
        arr2[i][j] = scn.nextInt();
      }
    }

    if (m1 != n2) {
      System.out.print("Invalid input");
      return; // return means break 
    }


    int [][]mul = new int[n1][m2];

    for(int i = 0; i< mul.length; i++){
        for(int j = 0; j < mul[0].length; j++){
            int val = 0;


            for(int k = 0; k <m1; k++ ){
                val +=  arr1[i][k] * arr2[k][j];
            }

            mul[i][j] = val;
        }
    }


    for(int i= 0; i< mul.length; i++){
        for(int j = 0; j < mul[0].length; j++){
            System.out.print(mul[i][j] + " ");
        }

        System.out.println();
    }
  }
}
