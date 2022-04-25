package com.dsa.intermediate.bitManipulation;

/*
Problem Description
Given two binary strings, return their sum (also a binary string).
Example:

a = "100"

b = "11"
Return a + b = "111"

* */
public class AddBinaryString {
    public String addBinary(String A, String B) {
        String result = "";
        int carry = 0, i = 0, Alength = A.length(), Blength = B.length();
        while (i < Alength || i < Blength || carry != 0) {

            // First Fecthing String A element
            int x = 0;
            if (i < Alength && A.charAt(Alength - 1 - i) == '1')
                x = 1;

            // Fecthing String B Elements
            int y = 0;
            if (i < Blength && B.charAt(Blength - 1 - i) == '1')
                y = 1;

            result = (x + y + carry) % 2 + result;
            carry = (x + y + carry) / 2;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        AddBinaryString addBinaryString = new AddBinaryString();
        String s1 = "1010";
        String s2 = "10";
        String s = addBinaryString.addBinary(s1, s2);
        System.out.println(s);

    }
}
