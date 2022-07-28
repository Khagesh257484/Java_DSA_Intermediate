package com.dsa.advance.array;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {

    // 129
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int reminder = 0;
        // to remove the very first 0
        while (A.size() > 1 && A.get(0) == 0)
            A.remove(0);

        for (int i = A.size() - 1; i >= 0; i--) {
            int number = A.get(i);
            if (number == 9) {
                A.remove(i);
                A.add(i, 0);
                reminder = 1;
            } else {
                A.remove(i);
                A.add(i, number + 1);
                reminder = 0;
                break;
            }
        }
        if (reminder == 1) {
            A.add(0, 1);
        }
        return A;
    }

    // With Array
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (digits == null || digits.length == 0) {
            int[] temp = {1};
            return temp;
        }

        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                carry = carry + digits[i] + 1;
            } else {
                carry += digits[i];
            }
            result.add(0, carry % 10);
            carry /= 10;
        }

        if (carry == 1) {
            result.add(0, 1);
        }
        int resultArray[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(1, 2, 9));
        ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(0, 3, 7, 6, 4, 0, 5, 5, 6));  // 3 7 6 4 0 5 5 6

        System.out.println(plusOne(al));
        System.out.println(plusOne(al1));
        System.out.println(plusOne(al3));

    }

}
