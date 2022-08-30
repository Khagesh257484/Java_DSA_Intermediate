/*
Q2. Gray Code
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer A representing the total number of bits in the code, print the sequence of gray code.

A gray code sequence must begin with 0.



Problem Constraints
1 <= A <= 16



Input Format
The first argument is an integer A.



Output Format
Return an array of integers representing the gray code sequence.



Example Input
Input 1:

A = 2
Input 1:

A = 1


Example Output
output 1:

[0, 1, 3, 2]
output 2:

[0, 1]


Example Explanation
Explanation 1:

for A = 2 the gray code sequence is:
    00 - 0
    01 - 1
    11 - 3
    10 - 2
So, return [0,1,3,2].
Explanation 1:

for A = 1 the gray code sequence is:
    00 - 0
    01 - 1
So, return [0, 1].
* */

package com.dsa.advance.recursion;


// Theory about GrayCode
/*
 Gray Code :

It comes in Non weighted categoty, excess 3 categoty

Discover by Frank Gray

It is known as Reflective code, Minimum Error code & unit distance code

Why we use of this :

there is change of single bit in 2 successive codes.
that means only one bit change

Reducing process of switching.

Convsersion binary to Gray
     0123
 5 : 0101 : 0111

 We are doing xor on index base to undestande better
 1) Put most singnificant bit as it as =0 (index 0 )
 2) take xor of MSB and next bit (lets say b=0^1=1) (index 1 ^ index 0)
 3)  1^0=1 (index1 ^ index2)
 4) 0^1=1 (index2 ^ index 3)


Conversion Gray to binary :

 5 : 0111 :

 1) take MSB as it as lets say a=0 , here to convert from Gray to binary we have to take XOR of a with next bit
    a^1=0^1=1

2) 1^1 = 0

3) 0^1 = 1
* */

import java.util.ArrayList;

// https://www.youtube.com/watch?v=tTIrzsf-TQQ  :: Convert Gray code to binary, Gray code Category
// https://www.youtube.com/watch?v=aNI99hQu77M  :: What is Gray code and Why we use it.
public class GrayCode {
    // https://www.youtube.com/watch?v=ha1gEWYvr78
    public static ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);  // binary number will always start from zero so add it zero in beginning.

       /* a=2 : that means binary number can have only 2 digit & check there is how many way to differ a bit from
         previous bit
          0 : 00
          1 : 01
          3 : 11
          2 : 10    Note : You can check every number has one bit difference form previous bit
         .*/

        // Base case
        if (a == 0)
            return list;

        list.add(1);

        int curr = 1;     // Variable to maintain the power factor
        for (int i = 2; i <= a; i++) {
            curr = curr * 2;
            for (int j = list.size() - 1; j >= 0; j--) {
                list.add(curr + list.get(j));
            }

        }
        return list;
    }

    // Second way, More optimized
    public ArrayList<Integer> grayCode_secondWay(int A) {
        int n = A;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 0; i < n; i++) {
            int curSize = result.size();
            // push back all element in result in reverse order
            for (int j = curSize - 1; j >= 0; j--) {
                result.add(result.get(j) + (1 << i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(grayCode(2));

    }

}
