package com.beginner.strings;

public class Trim {
    static String trim(String s) {
        s = s.replace('*', ' ');
        s = s.trim();
        s = s.replace(' ', '*');
        return s;
    }

    public static void main(String[] args) {
        String s = "**He**l*l*o***";
        System.out.println(trim(s));
    }
}
