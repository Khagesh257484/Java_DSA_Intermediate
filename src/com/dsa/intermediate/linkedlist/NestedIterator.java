package com.dsa.intermediate.linkedlist;// public class Main {
//     public static void main(String[] args) {

//     }

import java.util.ArrayList;

public class NestedIterator {

    ArrayList<Integer> ans = new ArrayList<>();
    int index = 0;

    NestedIterator(ArrayList<NestedInteger> nestedList) {
        this.init(nestedList);
    }

    int next() {
        return ans.get(index++);
    }

    boolean hasNext() {
        if (index < ans.size())
            return true;

        return false;
    }

    public void init(ArrayList<NestedInteger> nestedList) {
        if (nestedList.isEmpty())
            return;
        for (NestedInteger integer : nestedList) {
            if (!integer.isInteger()) {
                init(integer.getList());
            } else {
                ans.add(integer.getInteger());
            }
        }
    }
}

//     // This is the interface that allows for creating nested lists.
//     // You should not implement it, or speculate about its implementation.
class NestedInteger {

    NestedInteger(int x) {
    }

    // Return true if this NestedInteger holds a single integer, rather than a nested list.
    boolean isInteger() {
        return true;
    }

    /*Return the single integer that this NestedInteger holds, if it holds a single integer.
     The result is 1e9 if this NestedInteger holds a nested list.*/
    int getInteger() {
        return 1;
    }

    // Return the nested list that this NestedInteger holds, if it holds a nested list.
    // The result is an empty ArrayList if this NestedInteger holds a single integer.
    ArrayList<NestedInteger> getList() {
        return null;
    }
}


