package com.dsa.intermediate.stacksAndQueues;

import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
    }
}
