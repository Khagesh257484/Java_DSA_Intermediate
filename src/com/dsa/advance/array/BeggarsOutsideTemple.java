/*
Q1. Beggars Outside Temple
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, Given by the 2D array B


Problem Constraints
1 <= A <= 2 * 105
1 <= L <= R <= A
1 <= P <= 103
0 <= len(B) <= 105


Input Format
The first argument is a single integer A.
The second argument is a 2D integer array B.


Output Format
Return an array(0 based indexing) that stores the total number of coins in each beggars pot.


Example Input
Input 1:-
A = 5
B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]


Example Output
Output 1:-
10 55 45 25 25


Example Explanation
Explanation 1:-
First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]
* */
package com.dsa.advance.array;

import java.util.Arrays;

public class BeggarsOutsideTemple {
    // https://www.youtube.com/watch?v=KcmpMqX5CIs&t=319s
    public static int[] solve(int A, int[][] B) {
        int[] ans = new int[A + 1];

        for (int i = 0; i < B.length; i++) {
            int amount = B[i][2];  // 2 because there is distributing from start and end index
            ans[B[i][0] - 1] += amount;
            ans[B[i][1]] -= amount;
        }
        System.out.println(Arrays.toString(ans));

        // Taking prefix sum of array
        for (int i = 1; i < A; i++) {
            ans[i] = ans[i] + ans[i - 1];
        }
        ans = Arrays.copyOf(ans, ans.length - 1);
        return ans;
    }

    public int[] solve2(int A, int[][] B) {

        // Queries - no of rows
        int[] output = new int[A];
        int rows = B.length;

        //System.out.println("rows : "+ rows);
        // update the queries
        for (int i = 0; i < rows; i++) {
            int L = B[i][0] - 1; // -1 coz 1 based indexing
            int R = B[i][1] - 1; // -1 coz 1 based indexing
            int data = B[i][2];
            //System.out.println("L : " + L + " R: " + R + " data :" + data);

            // keep updating values in the output until N-1
            if (R < A - 1 ) {
                output[L] += data;
                output[R + 1] -= data;
            } else { // for last index A-1 // only update L
                output[L] += data;
            }
            //System.out.println("Prefix Sum: " + Arrays.toString(output));
        }

        //output
        for (int i = 1; i < A; i++) // will start with 1 coz already covered 0 above
        {
            output[i] = output[i - 1] + output[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        System.out.println(Arrays.toString(solve(5, a)));
    }
}
