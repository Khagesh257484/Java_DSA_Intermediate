package com.dsa.intermediate.bitManipulation;

public class Test {
    public static void main(String[] args) {
        String a = "11";
        String result = "01";
        String resul1 = "01";
        result = a + result;   // 1101
        resul1 = resul1 + a;    // 0111
        System.out.println(result);
        System.out.println(resul1);
    }
}
