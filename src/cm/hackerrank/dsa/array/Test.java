package cm.hackerrank.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static int sockMerchant(int n, int[] ar) {
        int counter = 0;
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            count = 1;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }

    static void sockMerchent2(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] colors = new int[101];
        for (int i = 0; i < n; ++i) {
            int c = in.nextInt();
            colors[c]++;
        }
        System.out.println(Arrays.stream(colors).map(count -> count / 2).sum());
    }

    public static void main(String[] args) {

    }
}
