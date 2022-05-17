package com.dsa.intermediate.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ShaggyAndDistance {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            if (hm.containsKey(A.get(i))) {
                int newLength = i - hm.get(A.get(i));
                minLength = Math.min(newLength, minLength);
            } else
                hm.put(A.get(i), i);
        }
        if (minLength == Integer.MAX_VALUE)
            return -1;
        else
            return minLength;
    }

    public static void main(String[] args) {
        ShaggyAndDistance distance = new ShaggyAndDistance();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(7, 1, 3, 4, 1, 7));
        System.out.println(distance.solve(al));

        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(1, 1));
        System.out.println(distance.solve(al1));

        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(distance.solve(al2));

        ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(81760, 79550, 22559, 75299, 16955, 88462, 61786, 75867, 70648, 3369, 22975, 96532, 25025, 66395, 93487, 99745, 18113, 53612, 27186, 46537, 45321, 66174, 17988, 41507, 1917, 17613, 20118, 97218, 49013, 69220, 7583, 17748, 64613, 99073, 32976, 84997, 96961, 1757, 9565, 19937, 20844, 52727, 84400, 2459, 29910, 92266, 56997, 95895, 14078, 62465, 56931, 58056, 31338, 85194, 35782, 85090, 75386, 13941, 4115, 25904, 20784, 87872, 60888, 48447, 95087, 54725, 91079, 22263, 88947, 79672, 45292, 81355, 18933, 29522, 44401, 73426, 6301, 75670, 77769, 58508, 67734, 41227, 26015, 97582, 3651, 56043, 74721, 18679, 65400, 33055, 19979, 7691, 484, 93470, 40183, 67462, 81564, 99434, 4884, 38894));
        System.out.println(distance.solve(al3));

    }
}
