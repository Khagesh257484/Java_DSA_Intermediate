package com.dsa.intermediate.sorting;

import java.util.*;

public class LargestNumber {
    public String largestNumber(final List<Integer> A) {
        ArrayList<String> al = new ArrayList<>();

        // Changing int value into String
        for (int i = 0; i < A.size(); i++) {
            al.add(String.valueOf(A.get(i)));
        }

        // Sorting using custom comparator class
        Collections.sort(al, new Sort());

        if (al.get(0).equals("0"))
            return "0";
        else {
            String ans = "";
            for (int i = 0; i < al.size(); i++) {
                ans = ans.concat(al.get(i));
            }
            return ans;
        }
    }

}

class Sort implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        String a1 = a.concat(b);
        String a2 = b.concat(a);
        return a2.compareTo(a1);
    }

    public static void main(String[] args) {
        LargestNumber number = new LargestNumber();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(2, 3, 9, 0));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(0, 0, 0, 0));

        System.out.println(number.largestNumber(al));
        System.out.println(number.largestNumber(al1));
        System.out.println(number.largestNumber(al2));
    }
}


