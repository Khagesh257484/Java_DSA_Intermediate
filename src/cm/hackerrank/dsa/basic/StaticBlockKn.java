package cm.hackerrank.dsa.basic;

import java.util.Scanner;

public class StaticBlockKn{
static Scanner s = new Scanner(System.in);

static int H, B;
static boolean flag;
 

static {
    H = s.nextInt();
    B = s.nextInt();
    flag = false;    
    try {
        if(B <= 0 || H <= 0) {
            throw new Exception("Breadth and height must be positive");    
        }
        flag = true;
    } catch(Exception e) {
        System.out.println(e);
    }
}
//Write your code here

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

