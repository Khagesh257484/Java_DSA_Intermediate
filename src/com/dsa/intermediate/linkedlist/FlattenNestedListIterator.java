/*
Q1. Flatten Nested List Iterator
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.

Implement the NestedIterator class:

NestedIterator(List nestedList) Initializes the iterator with the nested list nestedList.
int next() Returns the next integer in the nested list.
boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.

Example 1:
Input: nestedList = [[1,1],2,[1,1]]
Output: [1,1,2,1,1]
Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
Example 2:
Input: nestedList = [1,[4,[6]]]
Output: [1,4,6]
Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
Constraints:
The sum of integers in all cases does not exceed 1e5.
The values of the integers in the nested list are in the range [-1e6, 1e6].

* */

package com.dsa.intermediate.linkedlist;

import java.util.ArrayList;

public class FlattenNestedListIterator {
    class NestedIterator {
        //[[1,1],2,[1,1]]
        ArrayList<Integer> arr = new ArrayList<>();
        int index = 0;

        NestedIterator(ArrayList<NestedInteger> nestedList) {
            rec(nestedList);
        }

        void rec(ArrayList<NestedInteger> nestedList) {
            if (nestedList.isEmpty())
                return;

            for (int i = 0; i < nestedList.size(); i++) {
                if (nestedList.get(i).isInteger()) {
                    arr.add(nestedList.get(i).getInteger());
                } else {
                    rec(nestedList.get(i).getList());
                }
            }

        }

        int next() {
            return arr.get(index++);
        }

        boolean hasNext() {
            if (index < arr.size())
                return true;
            else
                return false;
        }
    }
}

