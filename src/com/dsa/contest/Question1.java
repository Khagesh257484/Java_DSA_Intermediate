package com.dsa.contest;

import java.util.HashMap;

public class Question1 {
    public String solve(String A) {
        String s = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        int j = 1;
        for (int i = 97; i <= 122; i++, j++) {
            hm.put((char) i, j);
        }

      /*  if (hm.containsKey(A.charAt(0))){
            s+=A.charAt(0);
            s+=hm.get(A.charAt(0));
            System.out.println(s);
        }*/

        for (int i = 0; i < A.length(); i++) {
            if (hm.containsKey(A.charAt(i))) {
                s+=A.charAt(i);
                s+=hm.get(A.charAt(i));
            }
        }
        return s;
    }

    public static void main(String[] args) {

        Question1 que = new Question1();
        System.out.println(que.solve("scaler"));
        System.out.println(que.solve("azd"));

    }
}
