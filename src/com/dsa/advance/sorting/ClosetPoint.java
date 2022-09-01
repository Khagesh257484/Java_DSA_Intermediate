/*
Q3. B Closest Points to Origin
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
We have a list A of points (x, y) on the plane. Find the B closest points to the origin (0, 0).

Here, the distance between two points on a plane is the Euclidean distance.

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in.)

NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2 ).



Problem Constraints
1 <= B <= length of the list A <= 105
-105 <= A[i][0] <= 105
-105 <= A[i][1] <= 105



Input Format
The argument given is list A and an integer B.



Output Format
Return the B closest points to the origin (0, 0) in any order.



Example Input
Input 1:

 A = [
       [1, 3],
       [-2, 2]
     ]
 B = 1
Input 2:

 A = [
       [1, -1],
       [2, -1]
     ]
 B = 1


Example Output
Output 1:

 [ [-2, 2] ]
Output 2:

 [ [1, -1] ]


Example Explanation
Explanation 1:

 The Euclidean distance will be sqrt(10) for point [1,3] and sqrt(8) for point [-2,2].
 So one closest point will be [-2,2].
Explanation 2:

 The Euclidean distance will be sqrt(2) for point [1,-1] and sqrt(5) for point [2,-1].
 So one closest point will be [1,-1].
**/

// https://leetcode.com/problems/k-closest-points-to-origin/

package com.dsa.advance.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
// https://www.youtube.com/watch?v=IEVbMb473q8   :: Using Priority Queue
// https://leetcode.com/problems/k-closest-points-to-origin/discuss/2508997/Best-Easiest-JAVA-Solution-Ever

class Pair {
    public long x;
    public int y;

    public Pair(long x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ClosetPoint {
    public static int[][] solve(int[][] A, int B) {
        ArrayList<Pair> al = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            long ecd = 0;
            ecd += 1L * A[i][0] * A[i][0];
            ecd += 1L * A[i][1] * A[i][1];
            al.add(new Pair(ecd, i));
        }


        Collections.sort(al, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return (int) (o1.x - (o2.x));
            }
        });

        int[][] res = new int[B][2];
        for (int i = 0; i < B; i++) {
            int idx = al.get(i).y;
            res[i][0] = A[idx][0];
            res[i][1] = A[idx][1];
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 3}, {-2, 2}};
        System.out.println(Arrays.deepToString(solve(A, 1)));
    }
}
